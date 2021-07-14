package com.example.kotlin_practice
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.httpTest)
        val txt = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            VolleyService.testVolley(this) { testSuccess ->
                if (testSuccess) {
                    Toast.makeText(this, "통신 성공!", Toast.LENGTH_LONG).show()
                 

                } else {
                    Toast.makeText(this, "통신 실패...!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}