package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val strName = args.name
        tvName.text = strName

        val tvAuthor = view.findViewById<TextView>(R.id.tvAuthor)
        val strAuthor = args.author
        tvAuthor.text = strAuthor

        val tvYear = view.findViewById<TextView>(R.id.tvYear)
        val strYear = args.year
        tvYear.text = strYear
        val tvComp = view.findViewById<TextView>(R.id.textView12)
        val strComp = args.country
        tvComp.text = strComp

    }
}