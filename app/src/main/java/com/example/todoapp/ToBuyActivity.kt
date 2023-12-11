package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_to_buy.*

private  lateinit var toBuyAdapter: TodoAdapter
class ToBuyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_buy)


        toBuyAdapter = TodoAdapter(mutableListOf())
        recyclerView2.adapter = toBuyAdapter
        recyclerView2.layoutManager = LinearLayoutManager(this)




        ekleButton2.setOnClickListener()
        {


            val toBuyTitle = editTextTextPersonName2.text.toString()


            if (toBuyTitle.isNotEmpty()) {
                val todo = Todo(toBuyTitle)

                toBuyAdapter.ekle(todo)


                editTextTextPersonName2.text.clear()

            }



        }
        silButton2.setOnClickListener() {
            toBuyAdapter.sil()
        }


}




    fun geri(view: View)
    {
        val intent = Intent(applicationContext, GirisSayfasi::class.java)
        startActivity(intent)
        finish()
    }
}