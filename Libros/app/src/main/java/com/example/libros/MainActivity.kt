package com.example.libros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.libros.ui.NavigationGraph
import com.example.libros.ui.theme.LibrosTheme
import com.example.libros.viewmodel.BookViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibrosTheme {
                val navController = rememberNavController()
                val bookViewModel: BookViewModel = viewModel()
                NavigationGraph(navController, bookViewModel)
            }
        }
    }
}
