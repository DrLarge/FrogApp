package com.example.frogfinance.ui.navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TabSwitch(
    navController: NavHostController,
    currentRoute: String
) {
    TabRow(
        selectedTabIndex = when (currentRoute) {
            "overview" -> 0
            "budgeting" -> 1
            "expenses" -> 2
            "settings" -> 3
            else -> -1
        },
        indicator = { tabPositions ->
            TabRowDefaults.SecondaryIndicator(
                Modifier.tabIndicatorOffset(tabPositions[when (currentRoute) {
                    "overview" -> 0
                    "budgeting" -> 1
                    "expenses" -> 2
                    "settings" -> 3
                    else -> 0
                }]),
                height = 3.dp,
                color = MaterialTheme.colorScheme.primary
            )
        },
    ) {
        Tab(
            selected = currentRoute == "overview",
            onClick = { navController.navigate("overview") }) {
            Text("Overview", style = MaterialTheme.typography.bodyLarge)
        }
        Tab(
            selected = currentRoute == "budgeting",
            onClick = { navController.navigate("budgeting") }) {
            Text("Budgeting", style = MaterialTheme.typography.bodyLarge)
        }
        Tab(
            selected = currentRoute == "expenses",
            onClick = { navController.navigate("expenses") }) {
            Text("Expenses", style = MaterialTheme.typography.bodyLarge)
        }
        Tab(
            selected = currentRoute == "settings",
            onClick = { navController.navigate("settings") }) {
            Text("Settings", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
