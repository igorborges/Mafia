package com.example.igorb.mafia;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Vector;


public class LoboMata extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, btnNext;
    private boolean k1 = false, k2 = false, k3 = false, k4 = false, k5 = false, k12 = false;
    private boolean k6 = false, k7 = false, k8 = false, k9 = false, k10 = false, k11 = false;
    private int cont = 0, dead = -1;
    private Vector<Boolean> mortos = new Vector<Boolean>();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(MainActivity.nomes.tipo==1)
            setTitle("Lobo escolhe a vítima:");
        else if(MainActivity.nomes.tipo==2)
            setTitle("Assassino escolhe a vítima:");
        setContentView(R.layout.activity_mata_lobo);

        name1 = (TextView) findViewById(R.id.textView16);
        name2 = (TextView) findViewById(R.id.textView17);
        name3 = (TextView) findViewById(R.id.textView18);
        name4 = (TextView) findViewById(R.id.textView19);
        name5 = (TextView) findViewById(R.id.textView20);
        name6 = (TextView) findViewById(R.id.textView21);
        name7 = (TextView) findViewById(R.id.textView22);
        name8 = (TextView) findViewById(R.id.textView23);
        name9 = (TextView) findViewById(R.id.textView24);
        name10 = (TextView) findViewById(R.id.textView25);
        name11 = (TextView) findViewById(R.id.textView26);
        name12 = (TextView) findViewById(R.id.textView27);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);

        btnNext = (Button) findViewById(R.id.button13);


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

        if (MainActivity.nomes.wolves.get(0)) name1.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(1)) name2.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(2)) name3.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(3)) name4.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(4)) name5.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(5)) name6.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(6)) name7.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(7)) name8.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(8)) name9.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(9)) name10.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(10)) name11.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.wolves.get(11)) name12.setTextColor(Color.rgb(102, 153, 0));

        for(int i=0 ; i<12; i++){
            mortos.add(false);
        }

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


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k1 = !k1;
                if (k1) {
                    b1.setBackgroundResource(R.drawable.knife);
                    mortos.set(0,true);
                    cont++;
                    dead = 0;
                } else {
                    b1.setBackgroundResource(R.drawable.heart);
                    mortos.set(0, false);
                    cont--;
                    dead = -1;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k2 = !k2;
                if (k2) {
                    b2.setBackgroundResource(R.drawable.knife);
                    mortos.set(1, true);
                    cont++;
                    dead = 1;
                } else {
                    b2.setBackgroundResource(R.drawable.heart);
                    mortos.set(1, false);
                    cont--;
                    dead = -1;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k3 = !k3;
                if (k3) {
                    cont++;
                    dead = 2;
                    mortos.set(2,true);
                    b3.setBackgroundResource(R.drawable.knife);
                } else {
                    b3.setBackgroundResource(R.drawable.heart);
                    cont--;
                    mortos.set(2,false);
                    dead = -1;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k4 = !k4;
                if (k4) {
                    cont++;
                    dead = 3;
                    mortos.set(3,true);
                    b4.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(3,false);
                    b4.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k5 = !k5;
                if (k5) {
                    dead = 4;
                    cont++;
                    mortos.set(4,true);
                    b5.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(4,false);
                    b5.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k6 = !k6;
                if (k6) {
                    cont++;
                    dead = 5;
                    mortos.set(5,true);
                    b6.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(5,false);
                    b6.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k7 = !k7;
                if (k7) {
                    cont++;
                    dead = 6;
                    mortos.set(6,true);
                    b7.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(6,false);
                    b7.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k8 = !k8;
                if (k8) {
                    cont++;
                    dead = 7;
                    mortos.set(7,true);
                    b8.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(7,false);
                    b8.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k9 = !k9;
                if (k9) {
                    cont++;
                    dead = 8;
                    mortos.set(8,true);
                    b9.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(8,false);
                    b9.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k10 = !k10;
                if (k10) {
                    cont++;
                    dead = 9;
                    mortos.set(9,true);
                    b10.setBackgroundResource(R.drawable.knife);
                } else {
                    cont--;
                    dead = -1;
                    mortos.set(9,false);
                    b10.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k11 = !k11;
                if (k11) {
                    dead = 10;
                    cont++;
                    mortos.set(10,true);
                    b11.setBackgroundResource(R.drawable.knife);
                } else {
                    dead = -1;
                    cont--;
                    mortos.set(10,false);
                    b11.setBackgroundResource(R.drawable.heart);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k12 = !k12;
                if (k12) {
                    dead = 11;
                    mortos.set(11, true);
                    cont++;
                    b12.setBackgroundResource(R.drawable.knife);
                } else {
                    dead = -1;
                    cont--;
                    mortos.set(11,false);
                    b12.setBackgroundResource(R.drawable.heart);
                }
            }
        });




        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 12; i++){
                    if(mortos.get(i)){
                        dead = i;
                    }
                }

                if (cont >= 2 || cont == 0) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(LoboMata.this);
                    if(MainActivity.nomes.tipo==1)
                        builder1.setMessage("O(s) lobo(s) só pode(m) matar uma pessoa por rodada.");
                    else if(MainActivity.nomes.tipo==2)
                        builder1.setMessage("O(s) Assassino(s) só pode(m) matar uma pessoa por rodada.");

                    builder1.setCancelable(true);
                    builder1.show();
                } else {
                    MainActivity.nomes.mortoDaRodada = dead;

                    Intent it = new Intent(LoboMata.this, LoboDorme.class);
                    startActivity(it);
                }
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "LoboMata Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.igorb.mafia/http/host/path")
        );
        AppIndex.AppIndexApi.start(client2, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "LoboMata Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.igorb.mafia/http/host/path")
        );
        AppIndex.AppIndexApi.end(client2, viewAction);
        client2.disconnect();
    }
}