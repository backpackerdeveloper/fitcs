package com.paruluniversity.pica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.addCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.paruluniversity.pica.R

class ImcaMenuFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_imca_menu, container, false)

        val inotesnext: ConstraintLayout = view.findViewById(R.id.imcanotesbtn)

        inotesnext.setOnClickListener {
            val fragment = ImcanotesFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val ipapernext : ConstraintLayout = view.findViewById(R.id.imcapaperbtn)

        ipapernext.setOnClickListener {
            val fragment = ImcaPaperFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }



        val ilabnext : ConstraintLayout = view.findViewById(R.id.imcalabbtn)

        ilabnext.setOnClickListener {
            val fragment = ImcaLabFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val isylnext : ConstraintLayout = view.findViewById(R.id.imcasyllabusbtn)

        isylnext.setOnClickListener {
            val fragment = Imcasyylabus()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.academicFragment)
        }

        return view
    }
}