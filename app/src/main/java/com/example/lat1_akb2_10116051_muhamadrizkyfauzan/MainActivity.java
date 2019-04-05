package com.example.lat1_akb2_10116051_muhamadrizkyfauzan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
NIM   : 10116051
Nama  : Muhamad Rizky Fauzan
Kelas : IF2/AKB2
Change Log :
    v0.1 [3/4/2019 21:00 PM] : - Membuat Semua Tampilan (Rough Sketch)
    v0.2 [4/4/2019 21:00 PM] : - Membuat fungsi Intent dari tampilan awal sampai akhir
                               - Membuat xml rounded/curv button
    v0.3 [4/5/2019 13:30 PM] : - Membuat fungsi Putextra dan Getextra
    v1.0 [4/5/2019 15:30 PM] : - Fix tampilan
                               - Fix Intent
                               - Fix Putextra
    v1.1 [4/5/2019 19:00 PM] : - Fix Tampilan
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class ));
            }
        });
    }
}
