package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Vacunas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas)


    }

    fun passSR (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ASR::class.java)
        startActivity(intent);
    }

    fun passTD (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATD::class.java)
        startActivity(intent);
    }

    fun passTDPA (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATDPA::class.java)
        startActivity(intent);
    }

    fun passIESTACIONAL (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, AIEstacional::class.java)
        startActivity(intent);
    }
}
