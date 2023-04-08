package com.example.detski_mir

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ThemedSpinnerAdapter.Helper
import java.io.File
import java.sql.SQLException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun aut (view: View){

        val login = findViewById<EditText>(R.id.login_edit_text)
        val password = findViewById<EditText>(R.id.password_edit_text)
    }
    class auth {
        var login: String? = null
        var password: String? = null
        var lev: String? = null

        val lavel: lavel? = null
        val clients: clients? = null
        val goods: goods? = null


        override fun toString(): String {
            return "(login=$login, password=$password, level=$lev)"
        }
    }

    class lavel {
        val id: Int? = null
        val name: String? = null

        override fun toString(): String {
            return "(id=$id, name=$name)"
        }
    }

    class clients{
        val name_clients: String? = null
        val adres: String? = null
        val sum: String? = null
        val bonuses: String? = null
        val number_phone: Int? = null

        override fun toString(): String {
            return "(name_clients=$name_clients, adres=$adres, sum=$sum, bounuses=$bonuses, number_phone=$number_phone)"
        }
    }

    class goods{
        val index:Int? = null
        val type: String? = null
        val name_goods: String? = null
        val price: String? = null
        val amount: String? = null

        override fun toString(): String {
            return "(index=$index, thype=$type name_goods=$name_goods, price=$price, amout=$amount)"
        }
    }
}


