package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView tvpesan;
    Button kembali;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvpesan = findViewById(R.id.editText2);
        kembali = findViewById(R.id.button);

        kembali.setOnClickListener(this);

        Intent i = getIntent();
        String ipesan = i.getStringExtra(MainActivity.EXTRA_DATA);
        tvpesan.setText(ipesan);

    }

    private void sendToMain() {
        Intent sendToMain  = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(sendToMain);
        finish();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button:
                sendToMain();
        }
    }
}
