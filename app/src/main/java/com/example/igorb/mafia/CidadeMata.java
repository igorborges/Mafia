package com.example.igorb.mafia;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;

public class CidadeMata extends AppCompatActivity {

    private TextView texto;
    private Button btnNext,btnEnd;
    private boolean acabou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade_mata);
        setTitle("CIDADE MATA:");

        int temLoboVivo = 0, pessoasVivas = 0;
        texto = (TextView) findViewById(R.id.textView106);
        btnNext = (Button) findViewById(R.id.button74);
        btnEnd = (Button) findViewById(R.id.button77);
        btnEnd.setVisibility(View.INVISIBLE);

        texto.setTextSize(50);
        texto.setTextColor(Color.BLUE);


        for (int i = 0; i < 12; i++) {
            if (MainActivity.nomes.wolves.get(i) && MainActivity.nomes.alive.get(i)) {
                temLoboVivo++;
            } else if (!MainActivity.nomes.wolves.get(i) && MainActivity.nomes.alive.get(i)) {
                pessoasVivas++;
            }
        }

        if (temLoboVivo == 0) {
            if(MainActivity.nomes.tipo==1)
                texto.setText("Cidade decidiu por matar:\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString() + ",\nque era o último Lobo vivo!!\nFIM DE JOGO.\nCidade vence!");
            else if(MainActivity.nomes.tipo==2)
                texto.setText("Cidade decidiu por matar:\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString() + ",\nque era o último Assassino vivo!!\nFIM DE JOGO.\nCidade vence!");

            acabou = true;
            btnNext.setText("Novo Jogo");
            btnEnd.setVisibility(View.VISIBLE);
        } else if (temLoboVivo >= pessoasVivas) {
            acabou = true;
            btnNext.setText("Novo Jogo");
            btnEnd.setVisibility(View.VISIBLE);
            if(MainActivity.nomes.tipo==1)
            texto.setText("Cidade decidiu por matar:\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString() + ",\nque não era Lobo.\nFIM DE JOGO.\nLobo(s) vence(m)");
            else if(MainActivity.nomes.tipo==2)
                texto.setText("Cidade decidiu por matar:\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString() + ",\nque não era Assassino.\nFIM DE JOGO.\nAssassino(s) vence(m)");
        } else {
            texto.setText("Cidade decidiu por matar:\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString());
            acabou = false;
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!acabou){
                    Intent it = new Intent(CidadeMata.this, CidadeDorme.class);
                    startActivity(it);
                }else {
                    MainActivity.nomes.vet = new Vector<TextView>();
                    MainActivity.nomes.wolves = new Vector<Boolean>();
                    MainActivity.nomes.seer = new Vector<Boolean>();
                    MainActivity.nomes.hooker = new Vector<Boolean>();
                    MainActivity.nomes.alive = new Vector<Boolean>();
                    MainActivity.nomes.message = new String();
                    MainActivity.nomes.rodada = 1;
                    MainActivity.nomes.mortoDaRodada = -1;
                    MainActivity.nomes.puta = -1;
                    MainActivity.nomes.vidente = -1;

                    Intent it = new Intent(CidadeMata.this, MainActivity.class);
                    startActivity(it);
                }

            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.nomes.vet = new Vector<TextView>();
                MainActivity.nomes.wolves = new Vector<Boolean>();
                MainActivity.nomes.seer = new Vector<Boolean>();
                MainActivity.nomes.hooker = new Vector<Boolean>();
                MainActivity.nomes.alive = new Vector<Boolean>();
                MainActivity.nomes.message = new String();
                MainActivity.nomes.rodada = 1;
                MainActivity.nomes.mortoDaRodada = -1;
                MainActivity.nomes.puta = -1;
                MainActivity.nomes.vidente = -1;

                Intent intent = new Intent();
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
            }
        });
    }
}
