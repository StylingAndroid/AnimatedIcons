package com.stylingandroid.animatedicons

import android.graphics.drawable.Animatable2
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import com.stylingandroid.animatedicons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.root.children
            .filterIsInstance<ImageView>()
            .forEach {
                it.addAnimationStarter()
            }
    }

    private fun ImageView.addAnimationStarter() =
        if (this is RepeatingImageView) {
            start()
        } else {
            setOnClickListener {
                if (isRunning()) {
                    stop()
                } else {
                    start()
                }
            }
        }

    private fun ImageView.start() {
        (drawable as? Animatable2)?.start()
    }

    private fun ImageView.isRunning(): Boolean =
        (drawable as? Animatable2)?.isRunning ?: false

    override fun onPause() {
        super.onPause()

        binding.root.children
            .filterIsInstance<ImageView>()
            .forEach { it.stop() }
    }

    private fun ImageView.stop() {
        (drawable as? Animatable2)?.stop()
    }
}
