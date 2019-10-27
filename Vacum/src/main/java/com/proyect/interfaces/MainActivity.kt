package com.proyect.interfaces

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun passActivity(view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, UsuariosFamiliares::class.java)
        startActivity(intent);
    }
}
