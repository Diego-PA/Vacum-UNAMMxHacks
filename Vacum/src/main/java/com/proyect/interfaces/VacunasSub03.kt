package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VacunasSub03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas_sub03)
    }

    fun passHEPBS3 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, AHEPB::class.java)
        startActivity(intent);
    }

    fun passTDS3 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATD::class.java)
        startActivity(intent);
    }

    fun passTDPAS3 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ATDPA::class.java)
        startActivity(intent);
    }
}
