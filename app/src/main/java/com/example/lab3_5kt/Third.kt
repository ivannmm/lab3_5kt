package com.example.lab3_5kt

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

class Third : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
    Bundle?): View {
        setHasOptionsMenu(true)
        val view = inflater.inflate(R.layout.third, container, false)
        view.findViewById<View>(R.id.button3to1).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment3to1)
        }
        view.findViewById<View>(R.id.button3to2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment3to2)
        }
        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about)
            NavHostFragment.findNavController(this).navigate(R.id.action_about)
        return super.onOptionsItemSelected(item)
    }

}