package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PutaAcorda extends AppCompatActivity {

    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puta_acorda);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Narrador diz:");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Deus diz:");

        txt = (TextView) findViewById(R.id.textView28);

        if (MainActivity.nomes.tipo == 1)
            txt.setText("PUTA ACORDA");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("ANJO ACORDA");

        btnNext = (Button) findViewById(R.id.button15);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.rodada == 1) {
                    Intent it = new Intent(PutaAcorda.this, SelecionaPuta.class);
                    startActivity(it);
                } else if (!MainActivity.nomes.alive.get(MainActivity.nomes.puta)) {
                    Intent it = new Intent(PutaAcorda.this, PutaMorta.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent(PutaAcorda.this, PutaSalva.class);
                    startActivity(it);
                }
            }

        });
    }
}
