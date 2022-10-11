package com.adhi.cowboyshoot.ui.menuactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.adhi.cowboyshoot.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private val binding: ActivityMenuBinding by lazy{
        ActivityMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val message = intent.getStringExtra("name")
        val messageView: TextView = binding.tvGetName
        messageView.text = message
    }
}