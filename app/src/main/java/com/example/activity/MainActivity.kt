package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLog","activity onCreate")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","activity onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog","activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog","activity onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","activity onDestroy")
    }

    override fun onStart() {
        super.onStart()
        btn = this.findViewById(R.id.btn)
        btn?.setOnClickListener {
            changeFragment(BlankFragment())
        }

    }

    

    fun changeFragment(fragment: Fragment, addStack: Boolean = true){
        if(addStack){
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.dataContainer, fragment)
                .commit()
        }
        else{
            supportFragmentManager.beginTransaction()
                .replace(R.id.dataContainer, fragment)
                .commit()
        }
    }
}