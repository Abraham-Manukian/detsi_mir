package com.example.detski_mir

import MyAppDatabase
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Database
import authDao

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Database(){
        val myDatabase = MyAppDatabase.getDatabase(this)
        val clientsDao = myDatabase.clientsDao()
        val goodsDao = myDatabase.goodsDao()
        val authDao = myDatabase.authDao()
        val levelDao = myDatabase.levelDao()
    }
    fun aut (view: View){

        Database()
        val login = findViewById<EditText>(R.id.login_edit_text)
        val password = findViewById<EditText>(R.id.password_edit_text)
    }

}


