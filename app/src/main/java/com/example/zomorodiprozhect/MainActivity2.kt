package com.example.zomorodiprozhect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv_name=findViewById<TextView>(R.id.ac_main2_tv_name)
        val bundler : Bundle? =intent.extras
        tv_name.text = "سلام" + "" + bundler!!.get("edt_name").toString() + "" + bundler!!.get("edt_name").toString() + "عزیز به سامانه خوش امدید"
    }
}
