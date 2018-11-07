package com.example.aluno.awaymed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaginaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_login);

        Button btnEntrar = (Button) findViewById(R.id.btnEntrar);
        final EditText usuario = (EditText) findViewById(R.id.editText);
        String senha;
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuario.getText().toString().equals("medicoContratado")){
                    setContentView(R.layout.activity_medico_contratado );
                }else{
                    if(usuario.getText().toString().equals("hospital")){
                        setContentView(R.layout.activity_hospital );
                    }else{
                        if(usuario.getText().toString().equals("medicoContratante")){
                            setContentView(R.layout.activity_hospital );
                        }
                    }
                }

            }
        });


    }
}
