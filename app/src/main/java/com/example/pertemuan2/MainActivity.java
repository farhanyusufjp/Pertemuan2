package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.pertemuan2.Main2Activity.EXTRA_REPLY;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public static final String EXTRA_DATA="extra_data";

String data;
EditText DataInput;
Button Kirim;
TextView tvpesan2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvpesan2 = findViewById(R.id.textView2);
        DataInput = findViewById(R.id.editText);
        Kirim = findViewById(R.id.button2);
        Kirim.setOnClickListener(this);

        Intent i = getIntent();
        String ipesan = i.getStringExtra(EXTRA_REPLY);
        tvpesan2.setText(ipesan);

        //SendBundle = findViewById(R.id.send_by_bundle);
        // SendBundle.setOnClickListener(this);

    }

    public void
                onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                //Mengirim/Passing Data Menggunakan Intent
                data = DataInput.getText().toString();
                Intent sendData = new Intent(MainActivity.this, Main2Activity.class);
                sendData.putExtra(EXTRA_DATA, data);
                startActivity(sendData);
                break;
        }
    }
}
