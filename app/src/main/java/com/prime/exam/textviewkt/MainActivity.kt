package com.prime.exam.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//앱이 실행되었을때 최초로 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//xml 화면 뷰를 연결
    }
}