package com.example.detski_mir

import MyAppDatabase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.detski_mir.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val db = MyAppDatabase.getDatabase(this)

        /*binding.Button.setOnClickListener{
            val auth = auth(null, binding.loginEditText.text.toString(), "admin", binding.passwordEditText.text.toString())
            /*Thread{
                db.authDao().insertOrUpdate(auth)
            }.start()*/
        }*/

    }
    /*
    fun Database(context: Context){

    }
    fun aut (view: View){

        val myDatabase = MyAppDatabase.getDatabase(this)
        val clientDao = myDatabase.clientsDao()
        val clients = clientDao.getAllClients()
        val goodsDao = myDatabase.goodsDao()
        val authDao = myDatabase.authDao()
        val levelDao = myDatabase.levelDao()

        val login = findViewById<EditText>(R.id.login_edit_text)
        val password = findViewById<EditText>(R.id.password_edit_text)
    }
*/
}


