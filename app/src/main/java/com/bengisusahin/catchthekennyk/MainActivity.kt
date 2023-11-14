package com.bengisusahin.catchthekennyk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bengisusahin.catchthekennyk.databinding.ActivityMainBinding
import java.util.ArrayList
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var score = 0
    var imageArray = ArrayList<ImageView>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //ImageArray
        imageArray.add(binding.imageView)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)

        hideImages()
    }

    fun hideImages(){
        for (image in imageArray){
            image.visibility = View.INVISIBLE
        }
        val random = Random()
        val randomIndex = random.nextInt(9)
        imageArray[randomIndex].visibility = View.VISIBLE
    }

    fun increaseScore(view: View){
        score = score +1
        binding.scoreText.text = "Score: ${score}"
    }
}