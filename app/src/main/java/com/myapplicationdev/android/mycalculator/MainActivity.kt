package com.myapplicationdev.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var msg = ""
    private var plusNum = 0.0
    private var plusBoolean = false
    private var subNum = 0.0
    private var subBoolean = false
    private var multiplyNum = 0.0
    private var multiplyBoolean = false
    private var divideNum = 0.0
    private var divideBoolean = false
    private var percentNum = 0.0
    private var percentBoolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener {
            tvNum.text = 0.toString()
            msg = ""
        }

        btnPlus.setOnClickListener {
            plusNum = tvNum.text.toString().toDouble()
            plusBoolean = true
            msg = ""
            tvNum.text = "+"
        }
        btnSub.setOnClickListener {
            subNum = tvNum.text.toString().toDouble()
            subBoolean = true
            msg = ""
            tvNum.text = "-"
        }

        btnMultiply.setOnClickListener {
            multiplyNum = tvNum.text.toString().toDouble()
            multiplyBoolean = true
            msg = ""
            tvNum.text = "*"
        }

        btnDivide.setOnClickListener {
            divideNum = tvNum.text.toString().toDouble()
            divideBoolean = true
            msg = ""
            tvNum.text = "/"
        }

        btnPercent.setOnClickListener {
            percentNum = tvNum.text.toString().toDouble()
            percentBoolean = true
            msg = ""
            tvNum.text = "%"
        }

        btnPlusMinus.setOnClickListener {
            val number = -1.0
            if (tvNum.text.toString().toDouble() < 0.0){
                var result = tvNum.text.toString().toDouble() * number
                tvNum.text = result.toString()
            } else {
                var result = tvNum.text.toString().toDouble() * number
                tvNum.text = result.toString()
            }
        }
        btnEqual.setOnClickListener {
            when {
                plusBoolean -> {
                    var plusResult = plusNum + tvNum.text.toString().toDouble()
                    tvNum.text = plusResult.toString()
                    plusBoolean = false
                }
                subBoolean -> {
                    var minusResult = subNum - tvNum.text.toString().toDouble()
                    tvNum.text = minusResult.toString()
                    subBoolean = false
                }
                multiplyBoolean -> {
                    var multiplyResult = multiplyNum * tvNum.text.toString().toDouble()
                    tvNum.text = multiplyResult.toString()
                    multiplyBoolean = false
                }
                divideBoolean -> {
                    var divideResult = divideNum / tvNum.text.toString().toDouble()
                    tvNum.text = divideResult.toString()
                    divideBoolean = false
                }
                percentBoolean -> {
                    var percentResult = percentNum / 100
                    tvNum.text = percentResult.toString()
                    percentBoolean = false
                }
            }
        }

    }
    fun btnOnClick(view: View){
        val btnSelected = view as Button
        when(btnSelected.id){
            btn0.id -> msg += "0"
            btn1.id -> msg += "1"
            btn2.id -> msg += "2"
            btn3.id -> msg += "3"
            btn4.id -> msg += "4"
            btn5.id -> msg += "5"
            btn6.id -> msg += "6"
            btn7.id -> msg += "7"
            btn8.id -> msg += "8"
            btn9.id -> msg += "9"
            btnDot.id -> msg += "."
        }

        tvNum.text = msg
    }
}