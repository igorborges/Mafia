package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoJogo extends AppCompatActivity {

    private Button btnTipo1, btnTipo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_jogo);
        setTitle("Selecione o tipo de jogo:");

        btnTipo1 = (Button) findViewById(R.id.button80);
        btnTipo2 = (Button) findViewById(R.id.button81);

        btnTipo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.nomes.tipo = 2;
                Intent it = new Intent(TipoJogo.this, MainActivity.class);
                startActivity(it);

            }
        });

        btnTipo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.nomes.tipo = 1;
                Intent it = new Intent(TipoJogo.this, MainActivity.class);
                startActivity(it);

            }
        });
    }
}
