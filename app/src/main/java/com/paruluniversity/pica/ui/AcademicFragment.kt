package com.paruluniversity.pica.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.paruluniversity.pica.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_academic.*


class AcademicFragment : Fragment(R.layout.fragment_academic) {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_academic, container, false)

        val nextbtn: Button = view.findViewById(R.id.bscbtn)


      nextbtn.setOnClickListener {
          val fragment = BscMenuFragment()
          val transaction = fragmentManager?.beginTransaction()
          transaction?.replace(R.id.fragment, fragment)?.commit()
      }

        val bcanext: Button = view.findViewById(R.id.bcabtn)

        bcanext.setOnClickListener {
            val fragment = BcaMenuFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val imcanext : Button = view.findViewById(R.id.imcabtn)

        imcanext.setOnClickListener {
            val fragment = ImcaMenuFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.homeFragment)
        }
        return view
    }


    }
