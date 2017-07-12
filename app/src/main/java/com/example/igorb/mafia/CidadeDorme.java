package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CidadeDorme extends AppCompatActivity {

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador diz:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus diz:");
        setContentView(R.layout.activity_cidade_dorme);

        btnNext = (Button) findViewById(R.id.btnNext);

        if(MainActivity.nomes.vet.get(0).getText().equals("-")) MainActivity.nomes.alive.set(0,false);
        if(MainActivity.nomes.vet.get(1).getText().equals("-")) MainActivity.nomes.alive.set(1,false);
        if(MainActivity.nomes.vet.get(2).getText().equals("-")) MainActivity.nomes.alive.set(2,false);
        if(MainActivity.nomes.vet.get(3).getText().equals("-")) MainActivity.nomes.alive.set(3,false);
        if(MainActivity.nomes.vet.get(4).getText().equals("-")) MainActivity.nomes.alive.set(4,false);
        if(MainActivity.nomes.vet.get(5).getText().equals("-")) MainActivity.nomes.alive.set(5,false);
        if(MainActivity.nomes.vet.get(6).getText().equals("-")) MainActivity.nomes.alive.set(6,false);
        if(MainActivity.nomes.vet.get(7).getText().equals("-")) MainActivity.nomes.alive.set(7,false);
        if(MainActivity.nomes.vet.get(8).getText().equals("-")) MainActivity.nomes.alive.set(8,false);
        if(MainActivity.nomes.vet.get(9).getText().equals("-")) MainActivity.nomes.alive.set(9,false);
        if(MainActivity.nomes.vet.get(10).getText().equals("-")) MainActivity.nomes.alive.set(10,false);
        if(MainActivity.nomes.vet.get(11).getText().equals("-")) MainActivity.nomes.alive.set(11,false);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CidadeDorme.this,LoboAcorda.class);
                startActivity(it);
            }
        });

    }
}
