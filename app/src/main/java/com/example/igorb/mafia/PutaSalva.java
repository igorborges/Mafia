package com.example.igorb.mafia;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;

public class PutaSalva extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, btnNext;
    private boolean k1 = false, k2 = false, k3 = false, k4 = false, k5 = false, k12 = false;
    private boolean k6 = false, k7 = false, k8 = false, k9 = false, k10 = false, k11 = false;
    private int cont = 0;
    public static int safe = -1;
    private Vector<Boolean> salvos = new Vector<Boolean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puta_salva);
        if(MainActivity.nomes.tipo==1)
            setTitle("Puta salva:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Anjo salva:");

        name1 = (TextView) findViewById(R.id.textView53);
        name2 = (TextView) findViewById(R.id.textView54);
        name3 = (TextView) findViewById(R.id.textView55);
        name4 = (TextView) findViewById(R.id.textView56);
        name5 = (TextView) findViewById(R.id.textView57);
        name6 = (TextView) findViewById(R.id.textView58);
        name7 = (TextView) findViewById(R.id.textView59);
        name8 = (TextView) findViewById(R.id.textView60);
        name9 = (TextView) findViewById(R.id.textView61);
        name10 = (TextView) findViewById(R.id.textView62);
        name11 = (TextView) findViewById(R.id.textView63);
        name12 = (TextView) findViewById(R.id.textView64);

        b1 = (Button) findViewById(R.id.button30);
        b2 = (Button) findViewById(R.id.button31);
        b3 = (Button) findViewById(R.id.button32);
        b4 = (Button) findViewById(R.id.button33);
        b5 = (Button) findViewById(R.id.button34);
        b6 = (Button) findViewById(R.id.button35);
        b7 = (Button) findViewById(R.id.button36);
        b8 = (Button) findViewById(R.id.button37);
        b9 = (Button) findViewById(R.id.button38);
        b10 = (Button) findViewById(R.id.button39);
        b11 = (Button) findViewById(R.id.button40);
        b12 = (Button) findViewById(R.id.button41);

        btnNext = (Button) findViewById(R.id.button17);

        for(int i=0 ; i<12; i++){
            salvos.add(false);
        }

        name1.setText(MainActivity.nomes.vet.get(0).getText());
        name2.setText(MainActivity.nomes.vet.get(1).getText());
        name3.setText(MainActivity.nomes.vet.get(2).getText());
        name4.setText(MainActivity.nomes.vet.get(3).getText());
        name5.setText(MainActivity.nomes.vet.get(4).getText());
        name6.setText(MainActivity.nomes.vet.get(5).getText());
        name7.setText(MainActivity.nomes.vet.get(6).getText());
        name8.setText(MainActivity.nomes.vet.get(7).getText());
        name9.setText(MainActivity.nomes.vet.get(8).getText());
        name10.setText(MainActivity.nomes.vet.get(9).getText());
        name11.setText(MainActivity.nomes.vet.get(10).getText());
        name12.setText(MainActivity.nomes.vet.get(11).getText());

        if (MainActivity.nomes.hooker.get(0)) name1.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(1)) name2.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(2)) name3.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(3)) name4.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(4)) name5.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(5)) name6.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(6)) name7.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(7)) name8.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(8)) name9.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(9)) name10.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(10)) name11.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.hooker.get(11)) name12.setTextColor(Color.rgb(102, 153, 0));

        if (name1.getText().equals("-")) {
            name1.setVisibility(View.INVISIBLE);
            b1.setVisibility(View.INVISIBLE);
        }
        if (name2.getText().equals("-")) {
            name2.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
        }
        if (name3.getText().equals("-")) {
            name3.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
        }
        if (name4.getText().equals("-")) {
            name4.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
        }
        if (name5.getText().equals("-")) {
            name5.setVisibility(View.INVISIBLE);
            b5.setVisibility(View.INVISIBLE);
        }
        if (name6.getText().equals("-")) {
            name6.setVisibility(View.INVISIBLE);
            b6.setVisibility(View.INVISIBLE);
        }
        if (name7.getText().equals("-")) {
            name7.setVisibility(View.INVISIBLE);
            b7.setVisibility(View.INVISIBLE);
        }
        if (name8.getText().equals("-")) {
            name8.setVisibility(View.INVISIBLE);
            b8.setVisibility(View.INVISIBLE);
        }
        if (name9.getText().equals("-")) {
            name9.setVisibility(View.INVISIBLE);
            b9.setVisibility(View.INVISIBLE);
        }
        if (name10.getText().equals("-")) {
            name10.setVisibility(View.INVISIBLE);
            b10.setVisibility(View.INVISIBLE);
        }
        if (name11.getText().equals("-")) {
            name11.setVisibility(View.INVISIBLE);
            b11.setVisibility(View.INVISIBLE);
        }
        if (name12.getText().equals("-")) {
            name12.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
        }



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k1 = !k1;
                if (k1) {
                    b1.setBackgroundResource(R.drawable.heart);
                    salvos.set(0,true);
                    cont++;
                    safe = 0;
                } else {
                    b1.setBackgroundResource(R.drawable.emptyheart);
                    salvos.set(0, false);
                    cont--;
                    safe = -1;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k2 = !k2;
                if (k2) {
                    b2.setBackgroundResource(R.drawable.heart);
                    salvos.set(1, true);
                    cont++;
                    safe = 1;
                } else {
                    b2.setBackgroundResource(R.drawable.emptyheart);
                    salvos.set(1, false);
                    cont--;
                    safe = -1;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k3 = !k3;
                if (k3) {
                    cont++;
                    safe = 2;
                    salvos.set(2,true);
                    b3.setBackgroundResource(R.drawable.heart);
                } else {
                    b3.setBackgroundResource(R.drawable.emptyheart);
                    cont--;
                    salvos.set(2,false);
                    safe = -1;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k4 = !k4;
                if (k4) {
                    cont++;
                    safe = 3;
                    salvos.set(3,true);
                    b4.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(3,false);
                    b4.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k5 = !k5;
                if (k5) {
                    safe = 4;
                    cont++;
                    salvos.set(4,true);
                    b5.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(4,false);
                    b5.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k6 = !k6;
                if (k6) {
                    cont++;
                    safe = 5;
                    salvos.set(5,true);
                    b6.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(5,false);
                    b6.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k7 = !k7;
                if (k7) {
                    cont++;
                    safe = 6;
                    salvos.set(6,true);
                    b7.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(6,false);
                    b7.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k8 = !k8;
                if (k8) {
                    cont++;
                    safe = 7;
                    salvos.set(7,true);
                    b8.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(7,false);
                    b8.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k9 = !k9;
                if (k9) {
                    cont++;
                    safe = 8;
                    salvos.set(8,true);
                    b9.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(8,false);
                    b9.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k10 = !k10;
                if (k10) {
                    cont++;
                    safe = 9;
                    salvos.set(9,true);
                    b10.setBackgroundResource(R.drawable.heart);
                } else {
                    cont--;
                    safe = -1;
                    salvos.set(9,false);
                    b10.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k11 = !k11;
                if (k11) {
                    safe = 10;
                    cont++;
                    salvos.set(10,true);
                    b11.setBackgroundResource(R.drawable.heart);
                } else {
                    safe = -1;
                    cont--;
                    salvos.set(10,false);
                    b11.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k12 = !k12;
                if (k12) {
                    safe = 11;
                    salvos.set(11, true);
                    cont++;
                    b12.setBackgroundResource(R.drawable.heart);
                } else {
                    safe = -1;
                    cont--;
                    salvos.set(11,false);
                    b12.setBackgroundResource(R.drawable.emptyheart);
                }
            }
        });

        if (!MainActivity.nomes.alive.get(0)) {
            name1.setPaintFlags(name1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b1.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(1)) {
            name2.setPaintFlags(name2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b2.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(2)) {
            name3.setPaintFlags(name3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b3.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(3)) {
            name4.setPaintFlags(name4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b4.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(4)) {
            name5.setPaintFlags(name5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b5.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(5)) {
            name6.setPaintFlags(name6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b6.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(6)) {
            name7.setPaintFlags(name7.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b7.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(7)) {
            name8.setPaintFlags(name8.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b8.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(8)) {
            name9.setPaintFlags(name9.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b9.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(9)) {
            name10.setPaintFlags(name10.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b10.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(10)) {
            name11.setPaintFlags(name11.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b11.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(11)) {
            name12.setPaintFlags(name12.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b12.setVisibility(View.INVISIBLE);
        }


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(PutaSalva.this, PutaDorme.class);
                for(int i = 0; i < 12; i++){
                    if(salvos.get(i)){
                        safe = i;
                    }
                }
                if (cont >= 2 || cont == 0) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(PutaSalva.this);
                    if(MainActivity.nomes.tipo==1)
                        builder1.setMessage("A puta só pode salvar uma pessoa por rodada.");
                    else if(MainActivity.nomes.tipo==2)
                        builder1.setMessage("O anjo só pode salvar uma pessoa por rodada.");

                    builder1.setCancelable(true);
                    builder1.show();
                }else if(MainActivity.nomes.puta == safe){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(PutaSalva.this);
                    if(MainActivity.nomes.tipo==1)
                        builder1.setMessage("A puta não pode se salvar.");
                    else if(MainActivity.nomes.tipo==2)
                        builder1.setMessage("O anjo não pode se salvar.");
                    builder1.setCancelable(true);
                    builder1.show();
                }
                else
                    startActivity(it);

            }
        });
    }
}
