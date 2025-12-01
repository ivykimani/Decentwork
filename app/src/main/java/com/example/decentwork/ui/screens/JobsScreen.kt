package com.example.decentwork.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.decentwork.data.Job
import com.example.decentwork.data.JobType
import com.example.decentwork.ui.viewmodel.JobsViewModel

@Composable
fun JobsScreen(onBack: () -> Unit, vm: JobsViewModel = viewModel()) {
    val jobs by vm.jobs.collectAsState()
    val loading by vm.loading.collectAsState()

    Scaffold(
        topBar = {
            SmallTopAppBar(title = { Text("Job Opportunities") }, navigationIcon = {
                IconButton(onClick = onBack) { Icon(Icons.Default.FilterList, contentDescription = "Back") }
            }, actions = {
                // filter menu could go here
            })
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).fillMaxSize()) {
            JobFilterRow(onFilterSelected = { type -> vm.filterBy(type) })
            if (loading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(contentPadding = PaddingValues(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    items(jobs) { job ->
                        JobCard(job = job)
                    }
                }
            }
        }
    }
}

@Composable
fun JobFilterRow(onFilterSelected: (JobType?) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Row(modifier = Modifier.fillMaxWidth().padding(12.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("Filter:")
        ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = !expanded }) {
            TextButton(onClick = {}) { Text("Select Job Type") }
            ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(text = { Text("All") }, onClick = { onFilterSelected(null); expanded = false })
                DropdownMenuItem(text = { Text("Full-time") }, onClick = { onFilterSelected(JobType.FULL_TIME); expanded = false })
                DropdownMenuItem(text = { Text("Part-time") }, onClick = { onFilterSelected(JobType.PART_TIME); expanded = false })
                DropdownMenuItem(text = { Text("Contract") }, onClick = { onFilterSelected(JobType.CONTRACT); expanded = false })
                DropdownMenuItem(text = { Text("Remote") }, onClick = { onFilterSelected(JobType.REMOTE); expanded = false })
            }
        }
    }
}

@Composable
fun JobCard(job: Job) {
    var showDetails by remember { mutableStateOf(false) }
    Card(modifier = Modifier.fillMaxWidth().clickable { showDetails = true }) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(job.title, style = MaterialTheme.typography.titleMedium)
            Text("${job.company} • ${job.location}", style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(6.dp))
            Text(job.salary ?: "Salary not specified", style = MaterialTheme.typography.bodyMedium)
        }
    }

    if (showDetails) {
        AlertDialog(
            onDismissRequest = { showDetails = false },
            title = { Text(job.title) },
            text = {
                Column { 
                    Text("Company: ${job.company}")
                    Text("Location: ${job.location}")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Description:")
                    Text(job.description)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Requirements:")
                    job.requirements.forEach { Text("- $it") }
                }
            },
            confirmButton = {
                TextButton(onClick = { 
                    // Ideally open applyUrl using an Intent
                    showDetails = false
                }) { Text("Apply") }
            },
            dismissButton = {
                TextButton(onClick = { showDetails = false }) { Text("Close") }
            }
        )
    }
}

