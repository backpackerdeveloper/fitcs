package com.paruluniversity.pica.ui

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.paruluniversity.pica.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {


override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_home, container, false)
}

override fun onViewCreated(view: View, savedInstanceState: Bundle?){

    val time: LinearLayout = view.findViewById(R.id.timebtn)

    time.setOnClickListener {
        val fragment = TimeTableFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()
    }

    val event: CardView = view.findViewById(R.id.eventbtn)

    event.setOnClickListener {
        val fragment = EventsFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()


    }

    val hod: CardView = view.findViewById(R.id.hodbtn)

    hod.setOnClickListener {
        val fragment = HODFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()


    }

    val dean: CardView = view.findViewById(R.id.deanbtn)

    dean.setOnClickListener {
        val fragment = DeanFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()

    }

    val contact: LinearLayout = view.findViewById(R.id.contactbtn)

    contact.setOnClickListener {
        val fragment = ContactsFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()

    }


    val gal: LinearLayout = view.findViewById(R.id.gallerybtn)

    gal.setOnClickListener {
        val fragment = GallaryFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment, fragment)?.commit()

    }

    val more: ImageView = view.findViewById(R.id.morebtn)

    more.setOnClickListener {
        Toast.makeText(requireContext(), "Adding soon this option on new update", Toast.LENGTH_SHORT).show()

    }



    val phon: CardView = view.findViewById(R.id.noticebtn)

    phon.setOnClickListener {

        val intent = Intent(requireContext(), MainNoticeActivity::class.java)
        startActivity(intent)

    }

}


}