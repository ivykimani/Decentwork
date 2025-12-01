package com.example.decentwork.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.decentwork.ui.navigation.Routes

@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Decent Work & Economic Growth", style = MaterialTheme.typography.headlineMedium)
            Text("Supporting UN SDG 8", style = MaterialTheme.typography.bodyMedium)

            Button(onClick = { onNavigate(Routes.JOBS) }, modifier = Modifier.fillMaxWidth()) {
                Text("Job Opportunities")
            }
            Button(onClick = { onNavigate(Routes.INDICATORS) }, modifier = Modifier.fillMaxWidth()) {
                Text("Economic Indicators")
            }
            Button(onClick = { onNavigate(Routes.RIGHTS) }, modifier = Modifier.fillMaxWidth()) {
                Text("Worker Rights")
            }
            Button(onClick = { onNavigate(Routes.RESOURCES) }, modifier = Modifier.fillMaxWidth()) {
                Text("Career Resources")
            }
        }
    }
}
