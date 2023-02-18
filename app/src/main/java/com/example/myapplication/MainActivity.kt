package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        El1 = findViewById<TextView>(R.id.ABut)
        El2 = findViewById<TextView>(R.id.Bbut)
        ProvBtn = findViewById<TextView>(R.id.CBut)
    }
    lateinit var  El1:TextView
    lateinit var  El2:TextView
    lateinit var  ProvBtn:TextView
    var i:Int=0
    var j:Int=0

    fun StartPr(view: View){
      val Check = findViewById<Button>(R.id.CheckBut)
        Check.isEnabled=true
        val start = 0
        val end = 99
        val randomNumber = start + (Math.random() * end).toInt()
        val randomNumber2 = start + (Math.random() * end).toInt()
        El1.setText("" + randomNumber)
        El2.setText("" + randomNumber2)
    }

    fun Check(view: View){
        ProvBtn.text
        val a:Int=El1.text.toString().toInt()
        val b:Int=El2.text.toString().toInt()
        val c:Int=ProvBtn.text.toString().toInt()
        val start = 0
        val end = 99
        val randomNumber = start + (Math.random() * end).toInt()
        val randomNumber2 = start + (Math.random() * end).toInt()
        El1.setText("" + randomNumber)
        El2.setText("" + randomNumber2)

        if ((a+b)==c){
            i+=1
            var True = findViewById<TextView>(R.id.TrueT)
            True.text=i.toString()
        }else{
            j+=1
            var Faulse = findViewById<TextView>(R.id.FaulseT)
            Faulse.text=j.toString()
        }



    }
}

