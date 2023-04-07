package com.example.lessons25

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

fun onWWW(view: View){
    val i = Intent()
    i.putExtra("z", "Proverka peredachi informacii")
    setResult(RESULT_OK, i)
    finish()
}
}