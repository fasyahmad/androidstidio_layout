package com.example.latdasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//harus sama ama judul filenya
public class MainActivity extends AppCompatActivity {
//ini properti klo python variable
    private EditText etNama, etNoHp;
    private Button btnAdd, btnCancel;
//    onvrete = method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText)findViewById(R.id.et_nama);
        etNoHp = (EditText)findViewById(R.id.et_nohp);
        btnAdd = (Button)findViewById(R.id.btn_add);
        btnCancel = (Button)findViewById(R.id.btn_cancel);
//        keadaan saat di klik (event)
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String nohp = etNoHp.getText().toString();

                Toast.makeText(MainActivity.this, "Nama : " + nama + "d an nomer Hp " + nohp, Toast.LENGTH_LONG).show();
                Intent pindah = new Intent(MainActivity.this, KeduaActivity.class);
                pindah.putExtra("nama",nama);
                pindah.putExtra("nohp",nohp);
                startActivity(pindah);
//                Integer nohp = Integer.valueOf(etNoHp.getText().toString());
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNama.setText("");
                etNoHp.setText("");
            }
        });

    }

}
