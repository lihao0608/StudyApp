package com.example.studyapp.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studyapp.R
import java.sql.DriverManager.println

class KotlinDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_demo)

        val intValue = 100
        //可以直接包含变量
        println("intValue value is $intValue") //intValue value is 100
        //也可以包含表达式
        println("(intValue + 100) value is ${intValue + 100}")   //(intValue + 100) value is 200
    }
}