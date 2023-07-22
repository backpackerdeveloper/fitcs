package com.paruluniversity.pica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.paruluniversity.pica.R


class BscMenuFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bsc_menu, container, false)

        val notesnext: ConstraintLayout = view.findViewById(R.id.bscnotesbtn)


        notesnext.setOnClickListener {
            val fragment = NotesFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val papernext : ConstraintLayout = view.findViewById(R.id.bscpaperbtn)

        papernext.setOnClickListener {
            val fragment = PaperFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val syllabusnext : ConstraintLayout = view.findViewById(R.id.bscsyllabusbtn)

        syllabusnext.setOnClickListener {
            val fragment = SyllabusFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        val labnext : ConstraintLayout = view.findViewById(R.id.bsclabbtn)

        labnext.setOnClickListener {
            val fragment = LabFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment, fragment)?.commit()
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.academicFragment)
        }

        return view
    }

}