package com.example.smartlab3

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    override fun onTouchEvent(touchevent: MotionEvent): Boolean {
        when (touchevent.action) {
            MotionEvent.ACTION_DOWN
                var x1 = touchevent.x
                var y1 = touchevent.y

            MotionEvent.ACTION_UP
                var x2 = touchevent.x
                var y2 = touchevent.y
                if (x1 < x2)
                    val i: intent = Intent(this@HomeActivity, SwipeLeft::class.java)
                    startActivity(i)
        }

        }
        return false
    }



