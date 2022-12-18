package com.messieyawo.com.ispaceintentservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.messieyawo.com.ispaceintentservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Initialize button click handlers
        with(binding) {

            runButton.setOnClickListener { runCode() }
            //clearButton.setOnClickListener { clearOutput()

            }
        }

    private fun runCode() {
     MyIntentService.startActionFoo(this,"Project Phase one","Project phase two")
    }

}