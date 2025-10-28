package id.antasari.p5datasave_230104040057.navigation

import androidx.navigation.NavController

fun NavController.navigateToSingleTopTo(route: String) {
    this.navigate(route) {
        launchSingleTop = true
        restoreState = true
        popUpTo(graph.startDestinationId) { saveState = true }
    }
}
