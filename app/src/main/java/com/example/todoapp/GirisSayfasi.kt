package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GirisSayfasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris_sayfasi)
    }
    fun toDoList(view: View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)


    }

    fun toBuyList(view: View) {
        val intent = Intent(applicationContext, ToBuyActivity::class.java)
        startActivity(intent)
        finish()

    }

}