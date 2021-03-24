package com.magangonline.aplikasihelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        hitung.setOnClickListener {
            val nilai1 = nilai_1.text.toString()
            val nilai2 = nilai_2.text.toString()

            val jumlah = nilai1.toInt() + nilai2.toInt()

            hasil.text = jumlah.toString()
            et_hasil.setText(jumlah.toString())


        }

    }



}