package com.example.frogfinance.ui.viewmodel

import androidx.lifecycle.ViewModel

class FrogFinanceViewModel : ViewModel() {
    var isSignedIn = false
        private set

    fun signIn(username: String, password: String) {
        isSignedIn = true
    }
}
