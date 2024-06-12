// AbsensiActivity.java
package com.example.aplikasiabsensi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AbsensiActivity extends AppCompatActivity {
    EditText noAbsen, namaSiswa, statusKehadiran, lokasi;
    Button btnFoto, btnSimpan;
    ImageView imageView;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi);

        noAbsen = findViewById(R.id.noAbsen);
        namaSiswa = findViewById(R.id.namaSiswa);
        statusKehadiran = findViewById(R.id.statusKehadiran);
        lokasi = findViewById(R.id.lokasi);
//        btnFoto = findViewById(R.id.btnFoto);
        btnSimpan = findViewById(R.id.btnSimpan);
        imageView = findViewById(R.id.imageView);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);
            }
        });

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simpan data ke database
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            bitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(bitmap);
        }
    }
}
