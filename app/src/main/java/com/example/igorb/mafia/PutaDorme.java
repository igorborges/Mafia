package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PutaDorme extends AppCompatActivity {

    private Button btnNext;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puta_dorme);
        if(MainActivity.nomes.tipo==1)
            setTitle("Narrador diz:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Deus diz:");

        txt = (TextView) findViewById(R.id.textView41);

        if (MainActivity.nomes.tipo == 1)
            txt.setText("PUTA DORME");
        else if (MainActivity.nomes.tipo == 2)
            txt.setText("ANJO DORME");

        btnNext = (Button) findViewById(R.id.button18);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PutaDorme.this, VidenteAcorda.class);
                startActivity(it);
            }
        });
    }
}
