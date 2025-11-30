package com.example.decentwork.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.TrendingDown
import androidx.compose.material.icons.automirrored.filled.TrendingFlat
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.decentwork.data.DataRepository
import com.example.decentwork.data.EconomicIndicator
import com.example.decentwork.data.TrendType
import com.example.decentwork.ui.theme.DecentworkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IndicatorsScreen(onNavigateBack: () -> Unit) {
    val indicators = remember { DataRepository.getEconomicIndicators() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Economic Indicators") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Key Economic Metrics",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Track important indicators for economic growth and employment",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }
            }

            items(indicators) { indicator ->
                IndicatorCard(indicator)
            }
        }
    }
}

@Composable
fun IndicatorCard(indicator: EconomicIndicator) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = indicator.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = indicator.value,
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Surface(
                        color = when (indicator.trend) {
                            TrendType.UP -> MaterialTheme.colorScheme.tertiaryContainer
                            TrendType.DOWN -> MaterialTheme.colorScheme.errorContainer
                            TrendType.STABLE -> MaterialTheme.colorScheme.surfaceVariant
                        },
                        shape = MaterialTheme.shapes.small
                    ) {
                        Text(
                            text = indicator.changePercent,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            color = when (indicator.trend) {
                                TrendType.UP -> MaterialTheme.colorScheme.onTertiaryContainer
                                TrendType.DOWN -> MaterialTheme.colorScheme.onErrorContainer
                                TrendType.STABLE -> MaterialTheme.colorScheme.onSurfaceVariant
                            },
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = indicator.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = when (indicator.trend) {
                    TrendType.UP -> Icons.AutoMirrored.Filled.TrendingUp
                    TrendType.DOWN -> Icons.AutoMirrored.Filled.TrendingDown
                    TrendType.STABLE -> Icons.AutoMirrored.Filled.TrendingFlat
                },
                contentDescription = indicator.trend.name,
                modifier = Modifier.size(48.dp),
                tint = when (indicator.trend) {
                    TrendType.UP -> MaterialTheme.colorScheme.tertiary
                    TrendType.DOWN -> MaterialTheme.colorScheme.error
                    TrendType.STABLE -> MaterialTheme.colorScheme.onSurfaceVariant
                }
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IndicatorsScreenPreview() {
    DecentworkTheme {
        IndicatorsScreen(onNavigateBack = {})
    }
}

@Preview(showBackground = true)
@Composable
fun IndicatorCardPreview() {
    DecentworkTheme {
        IndicatorCard(
            indicator = EconomicIndicator(
                name = "Unemployment Rate",
                value = "3.8%",
                trend = TrendType.DOWN,
                description = "Percentage of workforce actively seeking employment",
                changePercent = "-0.2%"
            )
        )
    }
}
