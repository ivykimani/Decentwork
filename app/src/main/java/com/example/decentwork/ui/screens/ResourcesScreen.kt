package com.example.decentwork.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.decentwork.ui.viewmodel.ResourcesViewModel

@Composable
fun ResourcesScreen(onBack: () -> Unit, vm: ResourcesViewModel = viewModel()) {
    val resources by vm.resources.collectAsState()
    val ctx = LocalContext.current

    Scaffold(topBar = {
        SmallTopAppBar(title = { Text("Career Resources") }, navigationIcon = {
            IconButton(onClick = onBack) { Icon(Icons.Default.ArrowBack, contentDescription = "Back") }
        })
    }) { padding ->
        LazyColumn(modifier = Modifier.padding(padding).fillMaxSize(), contentPadding = PaddingValues(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(resources) { res ->
                Card(modifier = Modifier.fillMaxWidth().clickable {
                    res.url?.let {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it))
                        ctx.startActivity(intent)
                    }
                }) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(res.title, style = MaterialTheme.typography.titleMedium)
                        Text("${res.provider} • ${res.duration}", style = MaterialTheme.typography.bodySmall)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(res.description, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
