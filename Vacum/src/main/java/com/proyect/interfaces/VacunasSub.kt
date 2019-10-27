package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VacunasSub : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas_sub)
    }

    fun passSRS (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ASR::class.java)
        startActivity(intent);
    }

    fun passTDS (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATD::class.java)
        startActivity(intent);
    }

    fun passIESTACIONALS (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, AIEstacional::class.java)
        startActivity(intent);
    }

}
