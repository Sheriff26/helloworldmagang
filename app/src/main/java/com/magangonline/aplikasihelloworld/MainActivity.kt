package com.magangonline.aplikasihelloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity  : AppCompatActivity(), View.OnClickListener {

    var nama = "Amar"
    var alamat = "jawa tengah"
    var nilai: Int = 0
    var isLogin: Boolean = false
    var double: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvent()

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            btn_login.id -> {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initEvent(){
        btn_login.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

}