package com.shadyshadyshades.rolltables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fm = supportFragmentManager
        var menu = fm.findFragmentById(R.id.menu)

        var recycle = fm.findFragmentById(R.id.view)

        if (menu==null)
        {
            menu = Menu()
            fm.beginTransaction().add(R.id.menu, menu).commit()
        }

        if (recycle==null)
        {
            recycle = RecyclerView()
            fm.beginTransaction().add(R.id.view, recycle).commit()
        }
    }
}