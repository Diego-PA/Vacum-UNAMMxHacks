package com.proyect.interfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UsuariosFamiliares : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios_familiares)
    }

    fun passActivityMain(view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, Vacunas::class.java)
        startActivity(intent);
    }

    fun passActivitySub (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, VacunasSub::class.java)
        startActivity(intent);
    }

    fun passActivitySub1 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, VacunasSub02::class.java)
        startActivity(intent);
    }

    fun passActivitySub2 (view: View) {
        // Handler code here.
        val intent = Intent(applicationContext, VacunasSub03::class.java)
        startActivity(intent);


    }

    fun passActivityold (view: View) {

        val intent = Intent(applicationContext, olds::class.java)
        startActivity(intent);

    }
}
