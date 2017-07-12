package com.example.igorb.mafia;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anuncio extends AppCompatActivity {

    private TextView texto1;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncio);
        if(MainActivity.nomes.tipo==1)
            setTitle("NARRADOR ANUNCIA!!");
        else if(MainActivity.nomes.tipo==2)
            setTitle("DEUS INFORMA!!");

        texto1 = (TextView) findViewById(R.id.textView81);

        btnNext = (Button) findViewById(R.id.button48);

        texto1.setTextSize(50);
        texto1.setTextColor(Color.BLUE);
        texto1.setText(MainActivity.nomes.message.toString());

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Anuncio.this, Votacao.class);
                startActivity(it);
            }
        });
    }
}
