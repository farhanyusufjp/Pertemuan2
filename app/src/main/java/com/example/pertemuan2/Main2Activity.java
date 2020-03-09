package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.pertemuan2.MainActivity.EXTRA_DATA;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    public  static final String EXTRA_REPLY = "EXTRA_REPLY";

    String data;
    TextView kirimpesan;
    TextView tvpesan;
    Button kirim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvpesan = findViewById(R.id.textView);
        kirimpesan = findViewById(R.id.editText2);
        kirim = findViewById(R.id.btn_kirim);
        kirim.setOnClickListener(this);



        Intent i = getIntent();
        String ipesan = i.getStringExtra(EXTRA_DATA);
        tvpesan.setText(ipesan);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_kirim:
                data = kirimpesan.getText().toString();
                Intent sendData = new Intent(Main2Activity.this, MainActivity.class);
                sendData.putExtra(EXTRA_REPLY, data);
                startActivity(sendData);
                break;

        }
    }
}
