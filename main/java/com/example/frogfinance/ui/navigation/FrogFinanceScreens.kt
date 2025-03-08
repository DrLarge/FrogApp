package com.example.frogfinance.ui.navigation

import com.example.frogfinance.ui.navigation.specs.BudgetScreenSpec
import com.example.frogfinance.ui.navigation.specs.ExpenseScreenSpec
import com.example.frogfinance.ui.navigation.specs.IScreenSpec
import com.example.frogfinance.ui.navigation.specs.OverviewScreenSpec
import com.example.frogfinance.ui.navigation.specs.SettingsScreenSpec
import com.example.frogfinance.ui.navigation.specs.SignInScreenSpec

object FrogFinanceScreens {
    val allScreens = mapOf<String, IScreenSpec?>(
        "sign_in" to SignInScreenSpec,
        "overview" to OverviewScreenSpec,
        "budgeting" to BudgetScreenSpec,
        "expenses" to ExpenseScreenSpec,
        "settings" to SettingsScreenSpec
    )

    const val ROOT = "root"
    const val startDestination = "sign_in"
}
