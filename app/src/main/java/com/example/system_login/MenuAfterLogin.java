package com.example.system_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuAfterLogin extends AppCompatActivity {
    ImageView Daftar, TtgProgram, HalamanBerita, scanner, RekapData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_after_login);

        Daftar = findViewById(R.id.dftr_penyakit);
        TtgProgram = findViewById(R.id.ttg_program);
        HalamanBerita = findViewById(R.id.berita);
        scanner = findViewById(R.id.scanner_padi);
        RekapData =findViewById(R.id.rekap_data);

        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAfterLogin.this, TentangPenyakit.class);
                startActivity(intent);
            }
        });

        TtgProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAfterLogin.this, TentangAplikasi.class);
                startActivity(intent);
            }
        });

        HalamanBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAfterLogin.this, HalamanNews.class);
                startActivity(intent);
            }
        });

        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuAfterLogin.this, ScanActivity.class);
                startActivity(intent);
            }
        });

        RekapData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuAfterLogin.this, MainActivityRekap.class);
                startActivity(intent);
            }
        });


    }
}
