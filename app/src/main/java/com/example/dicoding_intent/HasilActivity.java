package com.example.dicoding_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class HasilActivity extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton radioButton;
String hasil = "43";
Button balik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        balik = (Button) findViewById(R.id.balikButton);
    }

    public void checkButton(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioId);
        hasil = radioButton.getText().toString();
        Log.d("Hasil", hasil);
    }

    public void balik(View view){

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("hasil", hasil);
        startActivity(intent);
    }


}
