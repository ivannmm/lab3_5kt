package com.example.lab3_5kt

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment


class First : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        val view = inflater.inflate(R.layout.first, container, false)
        view.findViewById<View>(R.id.button1to2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragment1to2)
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