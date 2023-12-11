package com.example.todoapp
import android.content.SharedPreferences
import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_to_buy.*
import kotlinx.android.synthetic.main.activity_to_buy.view.*
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoAdapter(private val todos:MutableList<Todo>): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false))
    }

    fun ekle(todo:Todo)
    {

       todos.add(todo)
        notifyItemInserted(todos.size-1)
    }

    fun sil()
    {

        todos.removeAll{todo->todo.isChecked
        }
       notifyDataSetChanged()
    }


    fun toBuyEkle(todo: Todo)
    {

        todos.add(todo)
        notifyItemInserted(todos.size-1)

    }

    fun toBuySil()
    {

        todos.removeAll{todo->todo.isChecked
        }
        notifyDataSetChanged()
    }


    private fun toggleStrikeThrough(textView: TextView, isChecked: Boolean)
    {
      if(isChecked)
      {
          textView.paintFlags = textView.paintFlags or STRIKE_THRU_TEXT_FLAG
      }
        else
      {
          textView.paintFlags = textView.paintFlags and STRIKE_THRU_TEXT_FLAG.inv()
      }
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position]
        holder.itemView.apply {
            textView.text = curTodo.title
            checkBox.isChecked = curTodo.isChecked
            toggleStrikeThrough(textView, curTodo.isChecked)
            checkBox.setOnCheckedChangeListener { _, isChecked ->
                toggleStrikeThrough(textView, isChecked)
                curTodo.isChecked = !curTodo.isChecked
            }

            }
        }


    override fun getItemCount(): Int {
       return todos.size
    }




}