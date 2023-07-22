package com.paruluniversity.pica.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.paruluniversity.pica.R


class AboutFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)


        val insta: ImageView = view.findViewById(R.id.instabtn)

        insta.setOnClickListener {

            val i =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/_rajnish.7667/"))
            startActivity(i)


            val linkdin: ImageView = view.findViewById(R.id.linkdinbtn)

            linkdin.setOnClickListener {

                val i = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/rajnish-kumar-78235224b")
                )
                startActivity(i)

            }

            val mail: ImageView = view.findViewById(R.id.mailbtn)

            mail.setOnClickListener {

                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("EMAIL")
                val str_array = arrayOf("rajnishku2668@gmail.com")
                intent.putExtra(Intent.EXTRA_EMAIL,str_array)
                intent.putExtra(Intent.EXTRA_SUBJECT,"SUBJECT HERE")
                intent.putExtra(Intent.EXTRA_TEXT,"BODY HERE")
                intent.type = "message/rfc822"
                val a = Intent.createChooser(intent,"Launch Email")
                startActivity(a)

            }


        }
        return view
// Created by bagpackers Devlopers @shubhamtripz
    }
}