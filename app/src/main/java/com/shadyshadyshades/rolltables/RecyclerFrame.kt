package com.shadyshadyshades.rolltables

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [RecyclerFrame.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerFrame : Fragment() {

    private val testData = LinkedList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*testData is a list of potential roll tables so that I can set up the UI
        This will be deleted/removed once I set up an online SQL/mySQL to store user data */

        if (testData.isEmpty()) {
            testData.add("100 trinkets")
            testData.add("20 enemies you might find in the snow")
            testData.add("10 cranky gatekeepers")
            testData.add("20 shady characters that you might find in a tavenr")
            testData.add("12 magical swords")
        }


        /*
        The app should actually connect to a SQL database to grab recent tables made
         */

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recycler_frame, container, false)

        //set up the Recycler View and the adapter
        val rv = view.findViewById<RecyclerView>(R.id.theFrame)
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = TableAdapter(testData)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment RecyclerView.
         */
        @JvmStatic
        fun newInstance() =
            RecyclerFrame().apply {

            }
    }
}