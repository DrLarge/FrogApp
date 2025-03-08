package com.example.frogfinance.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.frogfinance.ui.navigation.TabSwitch
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

@Composable
fun SettingsScreen(navController: NavHostController, viewModel: FrogFinanceViewModel) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TabSwitch(navController, "settings")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text("Notifications", style = MaterialTheme.typography.bodyLarge)
            SwitchPreference()
            Spacer(modifier = Modifier.height(16.dp))
            Text("Theme", style = MaterialTheme.typography.bodyLarge)
            ThemeDropdown()
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Account Settings")
            }
        }
    }
}

@Composable
fun SwitchPreference() {
    var checked by remember { mutableStateOf(true) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Enabled", modifier = Modifier.weight(1f))
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
    }
}

@Composable
fun ThemeDropdown() {
    var expanded by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(0) }
    val themes = listOf("Light", "Dark", "System")
    Box {
        OutlinedButton(onClick = { expanded = true }) {
            Text(themes[selectedIndex])
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                themes.forEachIndexed { index, _ ->
                    DropdownMenuItem(
                        onClick = {
                            selectedIndex = index
                            expanded = false
                        },
                        text = { Text("placeholder") },
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingsScreen() {
    val navController = rememberNavController()
    val viewModel = FrogFinanceViewModel()
    SettingsScreen(navController = navController, viewModel = viewModel)
}
