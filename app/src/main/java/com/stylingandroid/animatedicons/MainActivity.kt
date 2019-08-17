package com.stylingandroid.animatedicons

import android.graphics.drawable.Animatable2
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadingv2.start()
    }

    private fun ImageView.start() {
        (drawable as? Animatable2)?.start()
    }

    private fun Animatable2.repeat() {
        registerAnimationCallback(
            object : Animatable2.AnimationCallback() {
                override fun onAnimationEnd(drawable: Drawable?) {
                    (drawable as? Animatable2)?.repeat()
                }
            })
        start()
    }
}
