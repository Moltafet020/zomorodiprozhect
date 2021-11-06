package com.example.zomorodiprozhect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_name=findViewById<EditText>(R.id.ac_main_edt_name)
        val edt_family: EditText =findViewById<EditText>(R.id.ac_main_edt_family)
        val btn_confrim=findViewById<Button>(R.id.ac_main_btn_confrim)
        btn_confrim.setOnClickListener {

            val intent: Intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("edt_name,edt_name.text.tostring()")
            intent.putExtra("edt_family,edt_family.text.tostring()")
            finish()



        }


    }


}
