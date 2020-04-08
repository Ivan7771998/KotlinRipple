package com.example.kotlinripple

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        image.run{
            addBackgroundImages(
                listOf(
                BitmapFactory.decodeResource(resources,R.drawable.batman)
            ))
            setRippleOffset(0.001f)
            setFadeInterval(2000)
            startCrossFadeAnimation()
        }

    }
}
