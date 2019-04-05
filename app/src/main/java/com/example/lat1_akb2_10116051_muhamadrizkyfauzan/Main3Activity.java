package com.example.lat1_akb2_10116051_muhamadrizkyfauzan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    EditText Nama;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Nama = (EditText) findViewById(R.id.editText2);

        next = (Button) findViewById(R.id.button);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                String nama = Nama.getText().toString();

                Intent start = new Intent(Main3Activity.this,Main4Activity.class);
                start.putExtra("nama",nama);

                startActivity(start);
        }
    }
}
