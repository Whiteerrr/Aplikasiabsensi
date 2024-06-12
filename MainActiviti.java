// MainActivity.java
package com.example.aplikasiabsensi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActiviti extends AppCompatActivity{
    Button btnAbsensi, btnLaporan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbsensi = findViewById(R.id.noAbsen);
        btnLaporan = findViewById(R.id.cvLaporan);

        btnAbsensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActiviti.this, AbsensiActivity.class);
                startActivity(intent);
            }
        });

        btnLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActiviti.this, LaporanActivity.class);
                startActivity(intent);
            }
        });
    }
}
