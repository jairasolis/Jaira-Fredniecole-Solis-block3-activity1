package com.solis.jaira.block3.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    private lateinit var bt5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1 = findViewById(R.id.button1)
        bt2 = findViewById(R.id.button2)
        bt3 = findViewById(R.id.button3)
        bt4 = findViewById(R.id.button4)
        bt5 = findViewById(R.id.button5)

        bt1.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        bt2.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        bt3.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        bt4.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        bt5.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

    }
}