package com.shadyshadyshades.rolltables

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TableAdapter(inList:List<String?>?) : RecyclerView.Adapter<TableViewHolder>() {

    private var list:List<String?>? = null

        init {
            list = inList
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        //inflate the view, then create the view holder
        val l = LayoutInflater.from(parent.context)
        val view = l.inflate(R.layout.table_view ,parent, false)
        val v: TableViewHolder = TableViewHolder(view)

        return v
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        var s = list?.get(position)
        if (s != null) {
            holder.tableName = s
            holder.t.setText(s)
        }

    }
}