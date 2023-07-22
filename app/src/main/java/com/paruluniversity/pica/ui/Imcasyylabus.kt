package com.paruluniversity.pica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.paruluniversity.pica.R


class Imcasyylabus : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_imcasyylabus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val myWebView: WebView = view.findViewById(R.id.imcasyllabusweb)
        myWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        myWebView.loadUrl("https://sites.google.com/view/imca-syllabus/home")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.imcaMenuFragment)
        }
    }
}