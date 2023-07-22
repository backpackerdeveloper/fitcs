package com.paruluniversity.pica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.addCallback
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.paruluniversity.pica.R

class TimeTableFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_time_table, container, false)

        val bcattnext: CardView = view.findViewById(R.id.cardt1)

        bcattnext.setOnClickListener {
            val fragment = BcaTTFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val bscttnext: CardView = view.findViewById(R.id.cardt2)

        bscttnext.setOnClickListener {
            val fragment = BscitTTFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val imcattnext: CardView = view.findViewById(R.id.cardt3)

        imcattnext.setOnClickListener {
            val fragment = ImcaTTFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.homeFragment)
        }

        return view
    }



}