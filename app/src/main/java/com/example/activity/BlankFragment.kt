package com.example.activity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.d("MyLog", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_blank, container, false)

        Log.d("MyLog", "onCreateView")

        return rootView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("MyLog", "onAttach")
    }

    override fun onStart() {
        super.onStart()

        Log.d("MyLog", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("MyLog", "onResume")
    }

    override fun onStop() {
        Log.d("MyLog", "onStop")

        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("MyLog", "onDestroyView")

        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("MyLog", "onDestroy")

        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("MyLog", "onDetach")

        super.onDetach()
    }
}