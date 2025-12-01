package com.example.decentwork.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.decentwork.ui.screens.*

object Routes {
    const val HOME = "home"
    const val JOBS = "jobs"
    const val INDICATORS = "indicators"
    const val RIGHTS = "rights"
    const val RESOURCES = "resources"
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HOME) {
        composable(Routes.HOME) { HomeScreen(onNavigate = { navController.navigate(it) }) }
        composable(Routes.JOBS) { JobsScreen(onBack = { navController.popBackStack() }) }
        composable(Routes.INDICATORS) { IndicatorsScreen(onBack = { navController.popBackStack() }) }
        composable(Routes.RIGHTS) { RightsScreen(onBack = { navController.popBackStack() }) }
        composable(Routes.RESOURCES) { ResourcesScreen(onBack = { navController.popBackStack() }) }
    }
}
