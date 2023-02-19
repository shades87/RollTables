package com.shadyshadyshades.rolltables

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/*Viewholder for recycler view to show users the name of tables*/

class TableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    lateinit var s:String
    lateinit var t:TextView

    init {
        t = itemView.findViewById(R.id.tableName)
    }

    var tableName: String
        get() = s
        set(s) {
            this.s = s
        }
}