package com.example.decentwork.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.decentwork.data.Trend
import com.example.decentwork.ui.viewmodel.IndicatorsViewModel

@Composable
fun IndicatorsScreen(onBack: () -> Unit, vm: IndicatorsViewModel = viewModel()) {
    val indicators by vm.indicators.collectAsState()
    Scaffold(topBar = {
        SmallTopAppBar(title = { Text("Economic Indicators") }, navigationIcon = {
            IconButton(onClick = onBack) { Icon(Icons.Default.ArrowBack, contentDescription = "Back") }
        })
    }) { padding ->
        LazyColumn(modifier = Modifier.padding(padding).fillMaxSize(), contentPadding = PaddingValues(12.dp)) {
            items(indicators) { ind ->
                IndicatorCard(ind.name, ind.value, ind.trend, ind.lastUpdated)
            }
        }
    }
}

@Composable
fun IndicatorCard(name: String, value: String, trend: Trend, lastUpdated: String) {
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp)) {
        Row(modifier = Modifier.padding(12.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(name, style = MaterialTheme.typography.titleMedium)
                Text("Updated: $lastUpdated", style = MaterialTheme.typography.bodySmall)
            }
            Column(horizontalAlignment = androidx.compose.ui.Alignment.End) {
                Text(value, style = MaterialTheme.typography.headlineSmall)
                when (trend) {
                    Trend.UP -> Icon(Icons.Default.ArrowUpward, contentDescription = "Up")
                    Trend.DOWN -> Icon(Icons.Default.ArrowDownward, contentDescription = "Down")
                    Trend.STABLE -> Icon(Icons.Default.ArrowForward, contentDescription = "Stable")
                }
            }
        }
    }
}

