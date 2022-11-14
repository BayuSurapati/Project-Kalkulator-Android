package com.bayusurapati.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){
            val result = savedInstanceState.getString(STATE_RESULT) as String
            txt_hasil.text = result
        }
    }
    fun clear(view: View){
        val input1 = edtNilaiA
        val input2 = edtNilaiB
        var input3 = txt_hasil

        input1.text = null
        input2.text = null
        input3.text = "0"
    }

    fun tambah(view: View){
        val input1 = edtNilaiA.text.toString()
        val input2 = edtNilaiB.text.toString()
        val input3 = txt_hasil

        if(input1.isEmpty() ){
            edtNilaiA.setError("Masukkan Nilai Pertama")
        }else if(input2.isEmpty()){
            edtNilaiB.setError("Masukkan Nilai Kedua")
        }else{
            var jumlah = input1.toDouble() + input2.toDouble()
            input3.text = jumlah.toString()
        }
    }
    fun kurang(view: View){
        val input1 = edtNilaiA.text.toString()
        val input2 = edtNilaiB.text.toString()
        val input3 = txt_hasil

        if(input1.isEmpty() ){
            edtNilaiA.setError("Masukkan Nilai Pertama")
        }else if(input2.isEmpty()){
            edtNilaiB.setError("Masukkan Nilai Kedua")
        }else{
            var jumlah = input1.toDouble() - input2.toDouble()
            input3.text = jumlah.toString()
        }
    }
    fun kali(view: View){
        val input1 = edtNilaiA.text.toString()
        val input2 = edtNilaiB.text.toString()
        val input3 = txt_hasil

        if(input1.isEmpty() ){
            edtNilaiA.setError("Masukkan Nilai Pertama")
        }else if(input2.isEmpty()){
            edtNilaiB.setError("Masukkan Nilai Kedua")
        }else{
            var jumlah = input1.toDouble() * input2.toDouble()
            input3.text = jumlah.toString()
        }
    }
    fun bagi(view: View){
        val input1 = edtNilaiA.text.toString()
        val input2 = edtNilaiB.text.toString()
        val input3 = txt_hasil

        if(input1.isEmpty() ){
            edtNilaiA.setError("Masukkan Nilai Pertama")
        }else if(input2.isEmpty()){
            edtNilaiB.setError("Masukkan Nilai Kedua")
        }else{
            var jumlah = input1.toDouble() / input2.toDouble()
            input3.text = jumlah.toString()
        }
    }
    fun modulus(view: View){
        val input1 = edtNilaiA.text.toString()
        val input2 = edtNilaiB.text.toString()
        val input3 = txt_hasil

        if(input1.isEmpty() ){
            edtNilaiA.setError("Masukkan Nilai Pertama")
        }else{
            var jumlah = input1.toDouble() / 100
            input3.text = jumlah.toString()
        }
    }

    companion object{
        private const val  STATE_RESULT = "state_result"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT,txt_hasil.text.toString())
    }
}