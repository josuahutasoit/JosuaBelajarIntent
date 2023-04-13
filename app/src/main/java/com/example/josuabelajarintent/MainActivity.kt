package com.example.josuabelajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObject = findViewById<Button>(R.id.btn_pindah_object)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObject.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when(v.id){
            R.id.btn_intent -> run {
                val intentBiasa = Intent(this@MainActivity,PindahActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intenntData = Intent(this@MainActivity,PindahDataActivity::class.java)
                intenntData.putExtra(PindahDataActivity.EXTRA_TEXT,"hallo,ayo belajar kotlin")
                startActivity(intenntData)

            }
            R.id.btn_pindah_object -> run{
                val typehouse = TypeHouse(
                    " 8X12 M2",
                    54,
                    "Kota Pekanbaru"
                )
                val intentObjek = Intent(this@MainActivity,PindahObjectActivity::class.java)
                intentObjek.putExtra(PindahObjectActivity.Extra_TypeHouse,typehouse)
                startActivity(intentObjek)

            }

        }
    }
}