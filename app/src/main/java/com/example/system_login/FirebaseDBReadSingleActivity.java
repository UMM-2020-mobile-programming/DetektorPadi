package com.example.system_login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.system_login.model.Data;

public class FirebaseDBReadSingleActivity extends AppCompatActivity {

    private Button btSubmit;
    private EditText etNama;
    private EditText etMerk;
    private EditText etHarga;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_create);
        etNama = (EditText) findViewById(R.id.et_namabarang);
        etMerk = (EditText) findViewById(R.id.et_merkbarang);
        etHarga = (EditText) findViewById(R.id.et_hargabarang);
        btSubmit = (Button) findViewById(R.id.bt_submit);

        etNama.setEnabled(false);
        etMerk.setEnabled(false);
        etHarga.setEnabled(false);
        btSubmit.setVisibility(View.GONE);

        Data barang = (Data) getIntent().getSerializableExtra("data");
        if(barang!=null){
            etNama.setText(barang.getTanggal());
            etMerk.setText(barang.getJudul());
            etHarga.setText(barang.getNote());
        }
    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity, FirebaseDBReadSingleActivity.class);
    }
}