package com.example.frogfinance.ui.navigation.specs

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

interface IScreenSpec {
    val route: String
    val arguments: List<NamedNavArgument>
    @Composable
    fun Content(
        modifier: Modifier,
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        viewModel: FrogFinanceViewModel,
        context: Context
    )
}