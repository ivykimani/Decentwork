package com.example.decentwork.ui.navigation

import androidx.compose.runtime.*
import com.example.decentwork.ui.screens.*

enum class Screen {
    HOME, JOBS, INDICATORS, RIGHTS, RESOURCES
}

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf(Screen.HOME) }

    when (currentScreen) {
        Screen.HOME -> HomeScreen(
            onNavigateToJobs = { currentScreen = Screen.JOBS },
            onNavigateToIndicators = { currentScreen = Screen.INDICATORS },
            onNavigateToRights = { currentScreen = Screen.RIGHTS },
            onNavigateToResources = { currentScreen = Screen.RESOURCES }
        )
        Screen.JOBS -> JobsScreen(
            onNavigateBack = { currentScreen = Screen.HOME }
        )
        Screen.INDICATORS -> IndicatorsScreen(
            onNavigateBack = { currentScreen = Screen.HOME }
        )
        Screen.RIGHTS -> RightsScreen(
            onNavigateBack = { currentScreen = Screen.HOME }
        )
        Screen.RESOURCES -> ResourcesScreen(
            onNavigateBack = { currentScreen = Screen.HOME }
        )
    }
}
