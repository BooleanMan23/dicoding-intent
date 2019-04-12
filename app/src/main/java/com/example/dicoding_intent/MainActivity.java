package com.example.dicoding_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button pindahActivityButton;
    private Button pindahActivityDataButton;
    private Button pindahActivityObjectButton;
    private Button telponButton;
    private Button hasilButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindahActivityButton = (Button) findViewById(R.id.pindahActivityButton);
        pindahActivityDataButton = (Button) findViewById(R.id.denganDataButton);
        pindahActivityObjectButton = (Button) findViewById(R.id.denganObjectButton);
        telponButton = (Button) findViewById(R.id.dialButton);
        hasilButton = (Button) findViewById(R.id.pindahResultButton);
        hasilTextView = (TextView) findViewById(R.id.hasilTextView);
        Intent intent = getIntent();
        String data = intent.getStringExtra("hasil");
        if(data != null){
            hasilTextView.setText(data);
        }
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.pindahActivityButton){
            Intent intent = new Intent(this, pindahActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.denganDataButton){
            Intent intent = new Intent(this, pindahActivity.class);

            String message = "Pindah Activity dengan data";
            intent.putExtra("data", message);
            startActivity(intent);
        }

        if(v.getId() == R.id.denganObjectButton){
            orang adit = new orang("Aditya Negara", 21, "Jalan gunuk IVB Nomor 72");
            Intent intent = new Intent(this, pindahActivity.class);
            Log.d("OBJECT YANG AKAN DIKIRM", adit.getNama());
            intent.putExtra("object", adit);
            startActivity(intent);

        }

        if (v.getId() == R.id.dialButton){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:081289503000"));
            startActivity(intent);
        }

        if(v.getId() == R.id.pindahResultButton){
            Intent intent = new Intent(this, HasilActivity.class);
            startActivity(intent);
        }

    }
}
