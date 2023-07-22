package com.paruluniversity.pica.ui

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.navigation.NavigationView
import com.paruluniversity.pica.R

class BcaMenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bca_menu, container, false)


        val bcanotesbtn: ConstraintLayout = view.findViewById(R.id.bcanotesbtn)

        bcanotesbtn.setOnClickListener {
            val fragment = BcaNotesFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val bcapapbtn: ConstraintLayout = view.findViewById(R.id.bcapaperbtn)

        bcapapbtn.setOnClickListener {
            val fragment = BcaPaperFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val bcasalbtn: ConstraintLayout = view.findViewById(R.id.bcasyllabusbtn)

        bcasalbtn.setOnClickListener {
            val fragment = BcaSyllabusFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val bcapracbtn: ConstraintLayout = view.findViewById(R.id.bcalabbtn)

        bcapracbtn.setOnClickListener {
            val fragment = BcaLabragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.academicFragment)
        }

        return view
    }


}
