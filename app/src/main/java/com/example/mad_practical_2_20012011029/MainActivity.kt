package com.example.mad_practical_2_20012011029

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG,"OnCreate: function called")
        Toast.makeText(this,"onCreate:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"oncreate: function called",Snackbar.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"OnStart: function called")
        Toast.makeText(this,"onStart:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"OnPause: function called")
        Toast.makeText(this,"onPause:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"OnResume: function called")
        Toast.makeText(this,"onResume:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"OnStop: function called")
        Toast.makeText(this,"onStop:function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStop: function called",Snackbar.LENGTH_LONG).show()
    }

}
