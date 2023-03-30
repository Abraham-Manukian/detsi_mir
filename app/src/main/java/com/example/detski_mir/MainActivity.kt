package com.example.detski_mir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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


