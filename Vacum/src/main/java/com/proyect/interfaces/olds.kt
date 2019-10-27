package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class olds : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olds)
    }

    fun passNEUMOO (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ANEUMO::class.java)
        startActivity(intent);
    }

    fun passTDO (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATD::class.java)
        startActivity(intent);
    }

    fun passIESTACIONALO (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, AIEstacional::class.java)
        startActivity(intent);
    }
}
