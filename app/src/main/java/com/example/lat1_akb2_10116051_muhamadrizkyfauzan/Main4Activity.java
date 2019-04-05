package com.example.lat1_akb2_10116051_muhamadrizkyfauzan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView6 = (TextView)findViewById(R.id.textView6);

        textView6.setText("Beres! Sekarang "+getIntent().getStringExtra("nama")+"\nsudah bisa negecek\npenggunaan Hp my\ntiap hari buat bantu "+getIntent().getStringExtra("nama")+"\nngatur waktu :)");
    }
}
