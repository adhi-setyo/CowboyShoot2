package com.adhi.cowboyshoot.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.adhi.cowboyshoot.databinding.ActivitySplashScreenBinding
import com.adhi.cowboyshoot.ui.game.GameActivity
import com.adhi.cowboyshoot.ui.onboarding.OnBoardingActivity

class SplashScreenActivity : AppCompatActivity() {
    private var timer: CountDownTimer? = null

    private val binding : ActivitySplashScreenBinding by lazy{
        ActivitySplashScreenBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        setTimerSplashScreen()
    }

    override fun onDestroy() {
        super.onDestroy()
        //destroy the timer for case new activity still opened when splashscreen destoryed
        if (timer != null) {
            timer?.cancel()
            timer = null
        }
    }

    private fun setTimerSplashScreen() {
        timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                val intent = Intent(this@SplashScreenActivity,OnBoardingActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
                finish()
            }
        }
        timer?.start()
    }
}