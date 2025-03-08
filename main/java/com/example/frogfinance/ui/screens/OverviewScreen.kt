package com.example.frogfinance.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.frogfinance.R
import com.example.frogfinance.ui.navigation.TabSwitch
import com.example.frogfinance.ui.viewmodel.FrogFinanceViewModel

@Composable
fun OverviewScreen(navController: NavHostController, viewModel: FrogFinanceViewModel) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TabSwitch(navController, "overview")
        Spacer(modifier = Modifier.height(24.dp))
        OutlinedTextField(
            value = "$123,456.78",
            onValueChange = {},
            readOnly = true,
            label = { Text("Total Money", style = MaterialTheme.typography.titleMedium) },
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colorScheme.onSurface),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        ImageCard(imageRes = R.drawable.ic_launcher_foreground, contentDescription = "Sample Image 1")
        Spacer(modifier = Modifier.height(8.dp))
        ImageCard(imageRes = R.drawable.ic_launcher_background, contentDescription = "Sample Image 2")
    }
}

@Composable
fun ImageCard(imageRes: Int, contentDescription: String) {
    Card(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = contentDescription,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOverviewScreen() {
    val navController = rememberNavController()
    val viewModel = FrogFinanceViewModel()
    OverviewScreen(navController = navController, viewModel = viewModel)
}
