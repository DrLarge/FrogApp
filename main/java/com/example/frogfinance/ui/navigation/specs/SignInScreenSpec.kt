package com.example.frogfinance.ui.navigation.specs

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.frogfinance.ui.screens.SignInScreen
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

object SignInScreenSpec : IScreenSpec {
    override val route = "sign_in"
    override val arguments = emptyList<NamedNavArgument>()

    @Composable
    override fun Content(
        modifier: Modifier,
        navController: NavHostController,
        navBackStackEntry: NavBackStackEntry,
        viewModel: FrogFinanceViewModel,
        context: Context
    ) {
        SignInScreen(navController, viewModel)
    }
}
