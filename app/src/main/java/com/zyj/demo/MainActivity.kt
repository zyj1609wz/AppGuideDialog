package com.zyj.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zyj.demo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val my = MyDialog()
            my.show(supportFragmentManager, "")
        }

    }

}