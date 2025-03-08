package com.example.frogfinance.ui.navigation.specs

import com.example.frogfinance.ui.screens.OverviewScreen
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

object OverviewScreenSpec : IScreenSpec {
    override val route = "overview"
    override val arguments = emptyList<NamedNavArgument>()

    @Composable
    override fun Content(
        modifier: Modifier,
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        viewModel: FrogFinanceViewModel,
        context: Context
    ) {
        OverviewScreen(navController, viewModel)
    }
}