package com.bengisusahin.catchthekennyk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bengisusahin.catchthekennyk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun increaseScore(view: View){
        score = score +1
        binding.scoreText.text = "Score: ${score}"
    }
}