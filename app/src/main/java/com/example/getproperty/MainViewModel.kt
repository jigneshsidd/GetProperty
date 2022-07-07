package com.example.getproperty

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel (private val userRepository: UserRepository) : ViewModel() {

    fun getQuotes() : LiveData<List<User>> {
        return userRepository.getQuotes()
    }

    fun insertQuote(user: User){
        viewModelScope.launch(Dispatchers.IO){
            userRepository.insertQuote(user)
        }

    }
}