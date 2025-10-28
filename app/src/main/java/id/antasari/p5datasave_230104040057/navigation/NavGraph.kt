package id.antasari.p5datasave_230104040057.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

// Sesuaikan import screens dengan package yang benar
import id.antasari.p5datasave_230104040057.ui.screens.AboutScreen
import id.antasari.p5datasave_230104040057.ui.screens.FilesScreen
import id.antasari.p5datasave_230104040057.ui.screens.HomeScreen
import id.antasari.p5datasave_230104040057.ui.screens.SharedPrefsScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues,
    onDarkChanged: (Boolean) -> Unit // callback dari MainActivity untuk sinkron tema
) {
    NavHost(
        navController = navController,
        startDestination = Dest.Home.route, // Dest harus berupa object yang mendefinisikan rute
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Dest.Home.route) { HomeScreen(navController) }
        composable(Dest.SP.route) { SharedPrefsScreen(onDarkChanged = onDarkChanged) }
        composable(Dest.Files.route) { FilesScreen() }
        composable(Dest.About.route) { AboutScreen() }
    }
}
