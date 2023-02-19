package com.shadyshadyshades.rolltables

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.LinkedList

class TableAdapter(inList:List<String?>?) : RecyclerView.Adapter<TableViewHolder>() {

    var list:List<String?>? = null

        init {
            list = inList
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}