package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PutaMorta extends AppCompatActivity {

    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puta_morta);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador enrola:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus enrola:");

        txt = (TextView) findViewById(R.id.textView107);

        if (MainActivity.nomes.tipo == 1)
            txt.setText("A Puta está morta, enrole alguns segundos para que ninguém perceba, e aperte o botão \"Próximo\".");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("O Anjo está morto, enrole alguns segundos para que ninguém perceba, e aperte o botão \"Próximo\".");

        btnNext = (Button) findViewById(R.id.button75);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PutaMorta.this, PutaDorme.class);
                startActivity(it);
            }
        });
    }
}
