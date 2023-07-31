package com.example.mad_practical_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import kotlin.contracts.contract

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onstart method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onresume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onpause method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart")
    }


    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val constraintLayout:ConstraintLayout?=findViewById(R.id.mainconstriant)
        if (constraintLayout != null){
            Snackbar.make(constraintLayout,message,Snackbar.LENGTH_SHORT).show()
        }
    }
}