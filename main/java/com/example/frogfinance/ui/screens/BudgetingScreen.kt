package com.example.frogfinance.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.frogfinance.ui.navigation.TabSwitch
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

@Composable
fun BudgetingScreen(navController: NavHostController, viewModel: FrogFinanceViewModel) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TabSwitch(navController, "budgeting")
        Spacer(modifier = Modifier.height(24.dp))
        OutlinedTextField(
            value = "$1",
            onValueChange = {},
            readOnly = true,
            label = { Text("Current Budget", style = MaterialTheme.typography.titleMedium) },
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colorScheme.onSurface),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    "Budget Details",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Detailed information about budgeting.",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    "Additional Controls",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Controls and options for managing budget.",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBudgetingScreen() {
    val navController = rememberNavController()
    val viewModel = FrogFinanceViewModel()
    BudgetingScreen(navController = navController, viewModel = viewModel)
}
