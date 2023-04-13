package com.example.josuabelajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahObjectActivity : AppCompatActivity() {

    private lateinit var tvPenerimaObject : TextView
    companion object{
        const val Extra_TypeHouse= "extra_typehouse"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_object)

        tvPenerimaObject = findViewById(R.id.tv_Penerima_Object)

        val typehouse: TypeHouse = intent.getParcelableExtra<TypeHouse>(Extra_TypeHouse) as TypeHouse
        val text = "Ukuran : ${typehouse.ukuran.toInt()} \nTipe :${typehouse.tipe.toString()} \nLokasi:${typehouse.lokasi} "
        tvPenerimaObject.text= text
    }
}