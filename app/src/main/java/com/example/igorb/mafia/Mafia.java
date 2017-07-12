package com.example.igorb.mafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mafia extends AppCompatActivity {

    private Button btnTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafia);
        setTitle("INICIO");

        btnTela = (Button) findViewById(R.id.button78);

        btnTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Mafia.this,TipoJogo.class);
                startActivity(it);
            }
        });
    }
}
