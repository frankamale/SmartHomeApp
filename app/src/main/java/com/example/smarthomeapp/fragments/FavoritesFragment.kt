package com.example.smarthomeapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smarthomeapp.R
import com.example.smarthomeapp.selectRoutine
import com.google.android.material.floatingactionbutton.FloatingActionButton


/**
 * A simple [Fragment] subclass.
 * Use the [FavoritesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavoritesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.idFABAddNote)

        fab?.setOnClickListener {
            val intent = Intent(activity, selectRoutine::class.java)
            startActivity(intent)
        }
        return view
        }


    }




