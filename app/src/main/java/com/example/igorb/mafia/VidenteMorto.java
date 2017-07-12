package com.example.igorb.mafia;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VidenteMorto extends AppCompatActivity {

    private Button btnNext;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidente_morto);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador enrola:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus enrola:");



        btnNext = (Button) findViewById(R.id.button76);

        text = (TextView) findViewById(R.id.textView110);
        text.setTextColor(Color.BLUE);
        if (MainActivity.nomes.tipo == 1)
            text.setText("O Vidente está morto, enrole alguns segundos para que ninguém perceba, e aperte o botão \"Próximo\".");
        else if (MainActivity.nomes.tipo == 2)
            text.setText("O Detetive está morto, enrole alguns segundos para que ninguém perceba, e aperte o botão \"Próximo\".");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(VidenteMorto.this, VidenteDorme.class);
                startActivity(it);
            }
        });
    }
}
