package com.example.decentwork.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.decentwork.ui.viewmodel.RightsViewModel

@Composable
fun RightsScreen(onBack: () -> Unit, vm: RightsViewModel = viewModel()) {
    val rights by vm.rights.collectAsState()
    Scaffold(topBar = {
        SmallTopAppBar(title = { Text("Worker Rights") }, navigationIcon = {
            IconButton(onClick = onBack) { Icon(Icons.Default.ExpandLess, contentDescription = "Back") }
        })
    }) { padding ->
        LazyColumn(modifier = Modifier.padding(padding).fillMaxSize(), contentPadding = PaddingValues(12.dp)) {
            items(rights) { r ->
                ExpandableRightCard(r.title, r.category, r.summary, r.details)
            }
        }
    }
}

@Composable
fun ExpandableRightCard(title: String, category: String, summary: String, details: String) {
    var expanded by remember { mutableStateOf(false) }
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp).clickable { expanded = !expanded }) {
        Column(modifier = Modifier.padding(12.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Column {
                    Text(title, style = MaterialTheme.typography.titleMedium)
                    Text("Category: $category", style = MaterialTheme.typography.bodySmall)
                }
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore, contentDescription = null)
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(summary, style = MaterialTheme.typography.bodyMedium)
            if (expanded) {
                Spacer(modifier = Modifier.height(6.dp))
                Text(details, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}
