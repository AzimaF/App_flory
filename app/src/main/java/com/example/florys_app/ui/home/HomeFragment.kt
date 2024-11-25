package com.example.yourapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.florys_app.R
import com.example.florys_app.ui.flower.FlowerActivity

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Mengatur listener untuk flower_1
        view.findViewById<View>(R.id.flower_1).setOnClickListener {
            startActivity(Intent(requireContext(), FlowerActivity::class.java))
        }

        // Mengatur listener untuk flower_2
        view.findViewById<View>(R.id.flower_2).setOnClickListener {
            startActivity(Intent(requireContext(), FlowerActivity::class.java))
        }

        // Mengatur listener untuk flower_3
        view.findViewById<View>(R.id.flower_3).setOnClickListener {
            startActivity(Intent(requireContext(), FlowerActivity::class.java))
        }

        return view
    }
}
