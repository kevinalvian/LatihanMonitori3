package com.example.latihanmonitori3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Nama extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "ccom.dandri.monitori.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        TextView Tambah = (TextView)
                findViewById(R.id.button);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Nama.this, Beres.class);
                startActivity(i);
            }
        });

    }
        public void sendMessage(View view){
            Intent intent = new Intent(this,Beres.class);
            EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE,message);
            startActivity(intent);
        }


}