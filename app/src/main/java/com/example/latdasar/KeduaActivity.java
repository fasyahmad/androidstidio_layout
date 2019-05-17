package com.example.latdasar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.sql.Struct;

public class KeduaActivity extends AppCompatActivity {

    private TextView tvNama, tvNoHp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //ini home dari sini
        String Nama = getIntent().getStringExtra("nama");
        String NoHp = getIntent().getStringExtra("nohp");


        tvNama = (TextView)findViewById(R.id.tv_nama);
        tvNoHp = (TextView)findViewById(R.id.tv_nohp);

       tvNama.setText(Nama);
       tvNoHp.setText(NoHp);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:  //ini home yang dari atas
                this.finish(); //ini kembali k option sebelumya
                return true;
             default:
        }
        return super.onOptionsItemSelected(item);
    }
}
