package com.example.kotlin_practice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.sample.gual.MainActivity2
import com.sample.gual.ResponseDTO
import com.sample.gual.RetrofitService
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    var server: RetrofitService? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.httpTest)
        val txt = findViewById<TextView>(R.id.textView)
        //Retrofit
        var retrofit = Retrofit.Builder()
            .baseUrl("http://gual.cafe24app.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        server = retrofit.create(RetrofitService::class.java)

        onClick_btn()

        btn.setOnClickListener {
            VolleyService.testVolley(this) { testSuccess ->
                if (testSuccess) {
                    Toast.makeText(this, "통신 성공!", Toast.LENGTH_LONG).show()
                    val volly = testSuccess.toString()
                    txt.setText(VolleyService.myJson)
                } else {
                    Toast.makeText(this, "통신 실패...!", Toast.LENGTH_LONG).show()
                }
            }



        }
    }

    private fun onClick_btn() {
        var uid = findViewById<EditText>(R.id.uid).toString()
        var email = findViewById<EditText>(R.id.email).toString()

        var params:HashMap<String, String> = HashMap<String, String>()
        params.put("uid", uid)
        params.put("email", email)

        server?.testRequest("/login", params)?.enqueue(object : Callback<ResponseDTO>{
            override fun onFailure(call: Call<ResponseDTO>?, t: Throwable?) {
                Log.e("Retrofit", t.toString())
            }

            override fun onResponse(call: Call<ResponseDTO>?, response: Response<ResponseDTO>?) {
                var res: ResponseDTO? = response?.body()

                Log.d("Retrofit", res?.result.toString())

            }
        })



    }


}