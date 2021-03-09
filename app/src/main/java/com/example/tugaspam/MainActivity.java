package com.example.tugaspam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel untuk buton
    Button btnLogin;

    //deklarasi variabel untuk edit text
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnlogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignIn);

        //menghungkan variable edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //untuk menghungkan variabel edepassword dengan komponen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi oneklik pada button btnlogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check();
            }
        });
    }

    public void check() {
        if (edemail.getText().toString().equals("Dama") &&
                edpassword.getText().toString().equals("Yudis")) {
            Toast.makeText(this, "Sukses!!!", Toast.LENGTH_SHORT).show();
        }
        else if (edemail.getText().toString().equals("Dama"))
        {
            Toast.makeText(this, "Password Salah!!!", Toast.LENGTH_SHORT).show();
        }
        else if (edpassword.getText().toString().equals("Yudis"))
        {
            Toast.makeText(this, "Email Salah", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}