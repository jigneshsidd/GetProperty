package com.example.getproperty

import androidx.lifecycle.LiveData

class UserRepository (private val userDao: UserDao) {

    fun getQuotes(): LiveData<List<User>> {
        return userDao.getUser()
    }

    suspend fun insertQuote(user: User){
        userDao.insertUser(user)
    }
}