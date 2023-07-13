package com.omersarikaya.stajfirst.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.omersarikaya.stajfirst.R
import com.omersarikaya.stajfirst.model.Ogrenci
import com.omersarikaya.stajfirst.model.getGrade

class CustomAdapter(private val mList: List<Ogrenci>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student_row, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val studentModel = mList[position]

        // sets the text to the textview from our itemHolder class    l
        holder.textView.text = studentModel.text
        holder.classView.text = studentModel.old.toString()
        holder.textViewTelephone.text = studentModel.telNumber
        holder.button.setOnClickListener {
            holder.itemView.visibility = View.GONE
        }
        val grade = studentModel.getGrade()
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
        val classView: TextView = itemView.findViewById(R.id.classView)
        val textViewTelephone: TextView = itemView.findViewById(R.id.textViewTelephone)
        val button: Button = itemView.findViewById(R.id.button)
    }
}