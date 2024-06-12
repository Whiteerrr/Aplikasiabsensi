// LaporanActivity.java
package com.example.aplikasiabsensi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class LaporanActivity extends AppCompatActivity {
    Spinner spinnerKelas;
    CheckBox checkBoxPelajaran1;  // Tambahkan checkbox lain sesuai kebutuhan
    Button btnCetakLaporan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        spinnerKelas = findViewById(R.id.spinnerKelas);
        checkBoxPelajaran1 = findViewById(R.id.checkBoxPelajaran1);
        btnCetakLaporan = findViewById(R.id.btnCetakLaporan);

        btnCetakLaporan.setOnClickListener(v -> {
            // Implementasi untuk mencetak laporan
        });
    }
}
