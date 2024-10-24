package com.cmc.vp2app

import android.os.Bundle
import android.util.EventLogTags.Description
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    lateinit var imageView: ImageView
    lateinit var textView: TextView
    lateinit var Description:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        imageView = view.findViewById(R.id.app_logo)
        textView = view.findViewById(R.id.welcome_text)
        Description = view.findViewById(R.id.description_text)
        return view
    }
}
