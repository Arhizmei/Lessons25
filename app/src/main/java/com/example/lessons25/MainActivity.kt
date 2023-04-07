package com.example.lessons25

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private var launcher: ActivityResultLauncher<Intent>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

                result: ActivityResult ->

                if (result.resultCode == RESULT_OK) {
                    val text = result.data?.getStringExtra("z")
                    val test = findViewById<TextView>(R.id.textView)
                    test.text = text

            }}
    }

    fun onClick(view: View) {
        launcher?.launch(Intent(this, MainActivity2::class.java)) }

    }