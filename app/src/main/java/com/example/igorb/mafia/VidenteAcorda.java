package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VidenteAcorda extends AppCompatActivity {

    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidente_acorda);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador diz:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus diz:");

        txt = (TextView) findViewById(R.id.textView42);
        if (MainActivity.nomes.tipo == 1)
            txt.setText("VIDENTE ACORDA");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("DETETIVE ACORDA");

        btnNext = (Button) findViewById(R.id.button19);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.nomes.rodada==1) {
                    Intent it = new Intent(VidenteAcorda.this, SelecionaVidente.class);
                    startActivity(it);
                }else if(!MainActivity.nomes.alive.get(MainActivity.nomes.vidente)){
                    Intent it = new Intent(VidenteAcorda.this,VidenteMorto.class);
                    startActivity(it);
                }
                else{
                    Intent it = new Intent(VidenteAcorda.this, VidenteVe.class);
                    startActivity(it);
                }
            }
        });
    }
}
