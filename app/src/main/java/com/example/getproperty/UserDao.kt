package com.example.getproperty

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * from user")
    fun getUser() : LiveData<List<User>>

    @Insert
    suspend fun insertUser(quote: User)
}