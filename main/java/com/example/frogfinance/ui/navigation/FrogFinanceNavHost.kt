package com.example.frogfinance.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.compose.ui.platform.LocalContext
import com.example.frogfinance.ui.navigation.specs.IScreenSpec
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

@Composable
fun FrogFinanceNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    frogFinanceViewModel: FrogFinanceViewModel
) {
    val context = LocalContext.current

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = FrogFinanceScreens.ROOT
    ) {
        navigation(
            route = FrogFinanceScreens.ROOT,
            startDestination = FrogFinanceScreens.startDestination
        ) {
            FrogFinanceScreens.allScreens.forEach { (_, screenSpec) ->
                screenSpec?.let { screen: IScreenSpec ->
                    composable(
                        route = screen.route,
                        arguments = screen.arguments
                    ) { navBackStackEntry ->
                        screen.Content(
                            modifier = Modifier.fillMaxSize(),
                            navController = navController,
                            navBackStackEntry = navBackStackEntry,
                            viewModel = frogFinanceViewModel,
                            context = context
                        )
                    }
                }
            }

        }
    }
}

