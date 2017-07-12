package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VidenteDorme extends AppCompatActivity {

    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidente_dorme);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Narrador diz:");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Deus diz:");

        txt = (TextView) findViewById(R.id.textView67);
        if (MainActivity.nomes.tipo == 1)
            txt.setText("VIDENTE DORME");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("DETETIVE DORME");

        btnNext = (Button) findViewById(R.id.button45);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(VidenteDorme.this, CidadeAcorda.class);
                if (MainActivity.nomes.mortoDaRodada == PutaSalva.safe) {//puta salva mesma pessoa que lobo, ninguem morre
                    if (MainActivity.nomes.tipo == 1)
                        MainActivity.nomes.message = "Parabéns Puta,\nNINGUÉM\n morreu!";
                    else if (MainActivity.nomes.tipo == 2)
                        MainActivity.nomes.message = "Parabéns Anjo,\nNINGUÉM\n morreu!";
                    startActivity(it);
                } else if (MainActivity.nomes.wolves.get(PutaSalva.safe) && MainActivity.nomes.hooker.get(MainActivity.nomes.mortoDaRodada)) {//puta salva lobo, lobo mata puta, puta morre.
                    MainActivity.nomes.message = "Que pena,\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + "\nmorreu!";
                    MainActivity.nomes.alive.set(MainActivity.nomes.mortoDaRodada, false);
                    startActivity(it);
                } else if (!MainActivity.nomes.wolves.get(PutaSalva.safe) && MainActivity.nomes.hooker.get(MainActivity.nomes.mortoDaRodada)) {//lobo mata puta, puta salva outra pessoa, as duas morrem.
                    if (MainActivity.nomes.tipo == 1)
                        MainActivity.nomes.message = "Parabéns Lobo(s),\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + " e " + MainActivity.nomes.vet.get(PutaSalva.safe).getText().toString().toUpperCase() + "\nmorreram!";
                    else if (MainActivity.nomes.tipo == 2)
                        MainActivity.nomes.message = "Parabéns Assassino(s),\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + " e " + MainActivity.nomes.vet.get(PutaSalva.safe).getText().toString().toUpperCase() + "\nmorreram!";
                    MainActivity.nomes.alive.set(MainActivity.nomes.mortoDaRodada, false);
                    MainActivity.nomes.alive.set(PutaSalva.safe, false);
                    startActivity(it);
                } else if (MainActivity.nomes.wolves.get(PutaSalva.safe) && !MainActivity.nomes.hooker.get(MainActivity.nomes.mortoDaRodada)) {//lobo mata alguem, puta salva lobo
                    if (MainActivity.nomes.tipo == 1)
                        MainActivity.nomes.message = "Parabéns Lobo(s),\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + " e " + MainActivity.nomes.vet.get(MainActivity.nomes.puta).getText().toString().toUpperCase() + "\nmorreram!";
                    else if (MainActivity.nomes.tipo == 2)
                        MainActivity.nomes.message = "Parabéns Assassino(s),\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + " e " + MainActivity.nomes.vet.get(MainActivity.nomes.puta).getText().toString().toUpperCase() + "\nmorreram!";

                    MainActivity.nomes.alive.set(MainActivity.nomes.mortoDaRodada, false);
                    MainActivity.nomes.alive.set(MainActivity.nomes.puta, false);
                    startActivity(it);
                } else if (MainActivity.nomes.mortoDaRodada != PutaSalva.safe) {//Lobo mata uma pessoa, puta salva outra
                    MainActivity.nomes.message = "Que pena,\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString().toUpperCase() + "\nmorreu!";
                    MainActivity.nomes.alive.set(MainActivity.nomes.mortoDaRodada, false);
                    startActivity(it);
                }
            }
        });
    }
}
