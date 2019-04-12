package com.example.dicoding_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class pindahActivity extends AppCompatActivity {
    Intent intent ;
    TextView textView;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        orang object = intent.getParcelableExtra("object");

        if(data != null){
            textView.setText(data);
        }
        if(object != null){
            String nama = object.getNama();
            int umur = object.getUmur();
            String alamat = object.getAlamat();
            textView.setText("Nama = "+ nama +" Umur = "+umur +" Alamat = "+alamat);
        }




    }
}
