package com.shadyshadyshades.rolltables

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //Get the UI elements and add listeners
        val theView = inflater.inflate(R.layout.fragment_menu, container, false)
        val home = theView.findViewById<ImageView>(R.id.home)
        val post = theView.findViewById<ImageView>(R.id.post)
        val user = theView.findViewById<ImageView>(R.id.user)


        /*Set onClickListeners for the UI elements on the menu
        Make sure that the icon changes to look like it's been selected
         */
        home.setOnClickListener{

        }

        post.setOnClickListener{

        }

        user.setOnClickListener{

        }

        return theView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Menu.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            Menu().apply {

            }
    }
}