package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoboAcorda extends AppCompatActivity {
    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Narrador diz:");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Deus diz:");
        setContentView(R.layout.activity_lobo_acorda);


        btnNext = (Button) findViewById(R.id.btnNext);
        txt = (TextView) findViewById(R.id.textView3);

        if (MainActivity.nomes.tipo == 1)
            txt.setText("LOBO ACORDA");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("ASSASSINO ACORDA");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.rodada == 1) {
                    Intent it = new Intent(LoboAcorda.this, SelecionaLobo.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent(LoboAcorda.this, LoboMata.class);
                    startActivity(it);
                }
            }
        });
    }
}
