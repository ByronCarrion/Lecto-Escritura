package edu.lectoescritura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import edu.lectoescritura.ui.login.Login

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000 //1 second
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, Login::class.java))

            finish()
        },SPLASH_TIME_OUT)
    }
}