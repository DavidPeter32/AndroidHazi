package com.example.lab4_quizapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.lab4_quizapplication.MESSAGE"
class MainActivity : AppCompatActivity() {
    val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri?->
        // Handle the returned Uri

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "this is OnCreate()")
        val selectButton = findViewById<Button>(R.id.contactButton)


    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "this is OnStart()")
    }
    fun GetStarted(view: View) {
        val editText = findViewById<EditText>(R.id.userName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "this is onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "this is onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "this is onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "this is onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "this is onDestroy()")
    }

}