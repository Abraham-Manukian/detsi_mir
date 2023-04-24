package com.example.detski_mir

import MyAppDatabase
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.detski_mir.data_base.Auth
import com.example.detski_mir.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var db: MyAppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        db = MyAppDatabase.getDb(this)
        binding.button.setOnClickListener {
            val item = Auth(
                null,
                binding.editTextTextPersonName.text.toString(),
                binding.editTextTextPersonName2.text.toString()
            )
            insertAuth(item)
        }
    }

    private fun insertAuth(auth: Auth) {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                db.authDao().insertauth(auth)
            }
        }
    }
}


