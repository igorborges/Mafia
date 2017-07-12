package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CidadeAcorda extends AppCompatActivity {

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade_acorda);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador diz:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus diz:");

        btnNext = (Button) findViewById(R.id.button47);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CidadeAcorda.this,Anuncio.class);
                startActivity(it);
            }
        });
    }
}
