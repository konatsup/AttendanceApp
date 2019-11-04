package com.valjapan.kintai

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class ShukkinFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ShukkinFragment", "Fragmentの初回起動")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("ShukkinFragment", "ShukkinFragmentをCreateViewしました")
        return inflater.inflate(R.layout.fragment_shukkin, container, false)
    }

}