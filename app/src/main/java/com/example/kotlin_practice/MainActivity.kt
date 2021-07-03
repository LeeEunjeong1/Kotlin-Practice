package com.example.kotlin_practice
import android.os.AsyncTask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import java.io.BufferedReader
import java.net.HttpURLConnection
import java.io.InputStreamReader
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        JSONTask().execute("http://gual.cafe24app.com/")
    }
    class JSONTask : AsyncTask<String, String, String>() {
        override fun doInBackground(vararg params: String?): String? {
            // ...
            val url = params[0]
            val obj = URL(url)
            with(obj.openConnection() as HttpURLConnection) {
                // optional default is GET
                requestMethod = "GET"
                println("\nSending 'GET' request to URL : $url")
                println("Response Code : $responseCode")
                BufferedReader(InputStreamReader(inputStream)).use {
                    var response = it.readText()
                    println("response = "+response)
                    return response
                }
            }
            return null
        }
        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            println("결과 = "+result)
        }
    }
}