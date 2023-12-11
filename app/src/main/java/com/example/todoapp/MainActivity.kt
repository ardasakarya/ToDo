package com.example.todoapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_to_buy.*
import kotlinx.android.synthetic.main.item_todo.*
import kotlinx.android.synthetic.main.item_todo.view.*

class MainActivity : AppCompatActivity() {

    private  lateinit var todoAdapter: TodoAdapter

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)









        todoAdapter = TodoAdapter(mutableListOf())
        recyclerView.adapter = todoAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)




            ekleButton.setOnClickListener()
        {
            val todoTitle = editTextTextPersonName.text.toString()


            if (todoTitle.isNotEmpty()) {
                val todo = Todo(todoTitle)


              todoAdapter.ekle(todo)






                editTextTextPersonName.text.clear()

            }

        }

        silButton.setOnClickListener() {
            todoAdapter.sil()
        }




    }

    fun geriDon(view: View)
        {
            val intent = Intent(applicationContext, GirisSayfasi::class.java)
            startActivity(intent)
            finish()
        }


    }





