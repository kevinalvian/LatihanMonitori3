package com.example.latihanmonitori3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Beres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beres);

        Intent intent=getIntent();
        String message = intent.getStringExtra(Nama.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Beres! Sekarang " + message + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");

    }
}