package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VacunasSub02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas_sub02)
    }

    fun passBCGS2 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, ABCG::class.java)
        startActivity(intent);
    }

    fun passHEPBS2 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, AHEPB::class.java)
        startActivity(intent);
    }

    fun passPENTAVALENTES2 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, APENTA::class.java)
        startActivity(intent);
    }
}
