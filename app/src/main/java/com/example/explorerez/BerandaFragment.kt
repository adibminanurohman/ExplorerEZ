package com.example.explorerez

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.example.explorerez.databinding.FragmentBerandaBinding

class BerandaFragment : Fragment() {

    private lateinit var cardBromo: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_beranda, container, false)
        // Inflate the layout for this fragment
        var cardBromo: CardView = view.findViewById(R.id.cardBromo)
        cardBromo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_berandaFragment_to_detailBromoFragment)
        }
        return view


    }


}