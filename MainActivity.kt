package com.example.aplikasiabsensi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnAbsensi: Button
    private lateinit var btnLaporan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbsensi = findViewById(R.id.noAbsen)
        btnLaporan = findViewById(R.id.cvLaporan)

        btnAbsensi.setOnClickListener {
            val intent = Intent(this, AbsensiActivity::class.java)
            startActivity(intent)
        }

        btnLaporan.setOnClickListener {
            val intent = Intent(this, LaporanActivity::class.java)
            startActivity(intent)
        }
    }
}
