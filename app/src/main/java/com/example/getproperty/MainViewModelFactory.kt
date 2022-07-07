package com.example.getproperty

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory (private val quoteRepository: UserRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(quoteRepository) as T
    }
}