package com.example.libros.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.libros.ui.screens.DetailScreen
import com.example.libros.ui.screens.FormScreen
import com.example.libros.ui.screen.LoginScreen
import com.example.libros.ui.screen.HomeScreen
import com.example.libros.viewmodel.BookViewModel

@Composable
fun NavigationGraph(navController: NavHostController, viewModel: BookViewModel) {
    NavHost(navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController)
        }
        composable("home") {
            HomeScreen(navController, viewModel)
        }
        composable("form") {
            FormScreen(navController, viewModel, null)
        }
        composable("form/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull()
            FormScreen(navController, viewModel, id)
        }
        composable("detail/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull()
            DetailScreen(navController, viewModel, id)
        }
    }
}


