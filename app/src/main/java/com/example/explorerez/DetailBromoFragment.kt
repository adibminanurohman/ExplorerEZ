package com.example.explorerez

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation


class DetailBromoFragment : Fragment() {

lateinit var imgBackBromo: ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_detail_bromo, container, false)
        var imgBackBromo: ImageButton = view.findViewById(R.id.imgBackBromo)
        imgBackBromo.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_detailBromoFragment_to_berandaFragment)
        }
        return view
    }

}