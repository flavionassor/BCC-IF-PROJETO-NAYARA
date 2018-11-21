package com.example.aluno.awaymed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class selecao_medicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_medicos);

        Button btnSolicitar = (Button) findViewById(R.id.btnSolicitar);
        final EditText usuario = (EditText) findViewById(R.id.editSolicitar);
        String senha;
        btnSolicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selecao_medicos.this, Aguardando.class);
                startActivity(intent);
            }
        });
    }
}
