package org.geeksforgeeks.imagerotationanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mImageView = findViewById<ImageView>(R.id.image_view_1)
        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {
            mImageView.animate().rotation(180f).setDuration(5000).start()
        }
    }
}