package com.example.igorb.mafia;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SelecionaPuta extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
    private boolean t1 = true, t2 = true, t3 = true, t4 = true, t5 = true, t6 = true, t7 = true, t8 = true;
    private boolean t9 = true, t10 = true, t11 = true, t12 = true, erro = false;
    private Button btnNext;
    private int numPutas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Selecione a(s) Puta(s)");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Selecione o(s) Anjo(s)");
        setContentView(R.layout.activity_seleciona_puta);

        btnNext = (Button) findViewById(R.id.button16);

        name1 = (TextView) findViewById(R.id.textView29);
        name2 = (TextView) findViewById(R.id.textView30);
        name3 = (TextView) findViewById(R.id.textView31);
        name4 = (TextView) findViewById(R.id.textView32);
        name5 = (TextView) findViewById(R.id.textView33);
        name6 = (TextView) findViewById(R.id.textView34);
        name7 = (TextView) findViewById(R.id.textView35);
        name8 = (TextView) findViewById(R.id.textView36);
        name9 = (TextView) findViewById(R.id.textView37);
        name10 = (TextView) findViewById(R.id.textView38);
        name11 = (TextView) findViewById(R.id.textView39);
        name12 = (TextView) findViewById(R.id.textView40);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton13);
        r3 = (RadioButton) findViewById(R.id.radioButton14);
        r4 = (RadioButton) findViewById(R.id.radioButton15);
        r5 = (RadioButton) findViewById(R.id.radioButton16);
        r6 = (RadioButton) findViewById(R.id.radioButton17);
        r7 = (RadioButton) findViewById(R.id.radioButton18);
        r8 = (RadioButton) findViewById(R.id.radioButton19);
        r9 = (RadioButton) findViewById(R.id.radioButton20);
        r10 = (RadioButton) findViewById(R.id.radioButton21);
        r11 = (RadioButton) findViewById(R.id.radioButton22);
        r12 = (RadioButton) findViewById(R.id.radioButton23);

        if (MainActivity.nomes.tipo == 1) {
            r1.setText("Puta");
            r2.setText("Puta");
            r3.setText("Puta");
            r4.setText("Puta");
            r5.setText("Puta");
            r6.setText("Puta");
            r7.setText("Puta");
            r8.setText("Puta");
            r9.setText("Puta");
            r10.setText("Puta");
            r11.setText("Puta");
            r12.setText("Puta");
        } else if (MainActivity.nomes.tipo == 2) {
            r1.setText("Anjo");
            r2.setText("Anjo");
            r3.setText("Anjo");
            r4.setText("Anjo");
            r5.setText("Anjo");
            r6.setText("Anjo");
            r7.setText("Anjo");
            r8.setText("Anjo");
            r9.setText("Anjo");
            r10.setText("Anjo");
            r11.setText("Anjo");
            r12.setText("Anjo");
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


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1.setChecked(t1);
                t1 = !t1;
                if (r1.isChecked()) {
                    numPutas++;
                    name1.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name1.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2.setChecked(t2);
                t2 = !t2;
                if (r2.isChecked()) {
                    numPutas++;
                    name2.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name2.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r3.setChecked(t3);
                t3 = !t3;
                if (r3.isChecked()) {
                    numPutas++;
                    name3.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name3.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r4.setChecked(t4);
                t4 = !t4;
                if (r4.isChecked()) {
                    numPutas++;
                    name4.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name4.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r5.setChecked(t5);
                t5 = !t5;
                if (r5.isChecked()) {
                    numPutas++;
                    name5.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name5.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r6.setChecked(t6);
                t6 = !t6;
                if (r6.isChecked()) {
                    numPutas++;
                    name6.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name6.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r7.setChecked(t7);
                t7 = !t7;
                if (r7.isChecked()) {
                    numPutas++;
                    name7.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name7.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r8.setChecked(t8);
                t8 = !t8;
                if (r8.isChecked()) {
                    numPutas++;
                    name8.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name8.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r9.setChecked(t9);
                t9 = !t9;
                if (r9.isChecked()) {
                    numPutas++;
                    name9.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name9.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r10.setChecked(t10);
                t10 = !t10;
                if (r10.isChecked()) {
                    numPutas++;
                    name10.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name10.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r11.setChecked(t11);
                t11 = !t11;
                if (r11.isChecked()) {
                    numPutas++;
                    name11.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name11.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r12.setChecked(t12);
                t12 = !t12;
                if (r12.isChecked()) {
                    numPutas++;
                    name12.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name12.setTextColor(Color.BLACK);
                    numPutas--;
                }
            }
        });

        if (MainActivity.nomes.vet.get(0).getText().equals("-")) {
            name1.setVisibility(View.INVISIBLE);
            r1.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(1).getText().equals("-")) {
            name2.setVisibility(View.INVISIBLE);
            r2.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(2).getText().equals("-")) {
            name3.setVisibility(View.INVISIBLE);
            r3.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(3).getText().equals("-")) {
            name4.setVisibility(View.INVISIBLE);
            r4.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(4).getText().equals("-")) {
            name5.setVisibility(View.INVISIBLE);
            r5.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(5).getText().equals("-")) {
            name6.setVisibility(View.INVISIBLE);
            r6.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(6).getText().equals("-")) {
            name7.setVisibility(View.INVISIBLE);
            r7.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(7).getText().equals("-")) {
            name8.setVisibility(View.INVISIBLE);
            r8.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(8).getText().equals("-")) {
            name9.setVisibility(View.INVISIBLE);
            r9.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(9).getText().equals("-")) {
            name10.setVisibility(View.INVISIBLE);
            r10.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(10).getText().equals("-")) {
            name11.setVisibility(View.INVISIBLE);
            r11.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(11).getText().equals("-")) {
            name12.setVisibility(View.INVISIBLE);
            r12.setVisibility(View.INVISIBLE);
        }


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.nomes.hooker.clear();

                MainActivity.nomes.hooker.add(!t1);
                MainActivity.nomes.hooker.add(!t2);
                MainActivity.nomes.hooker.add(!t3);
                MainActivity.nomes.hooker.add(!t4);
                MainActivity.nomes.hooker.add(!t5);
                MainActivity.nomes.hooker.add(!t6);
                MainActivity.nomes.hooker.add(!t7);
                MainActivity.nomes.hooker.add(!t8);
                MainActivity.nomes.hooker.add(!t9);
                MainActivity.nomes.hooker.add(!t10);
                MainActivity.nomes.hooker.add(!t11);
                MainActivity.nomes.hooker.add(!t12);

                for (int i = 0; i < 12; i++) {
                    if (MainActivity.nomes.hooker.get(i)) {
                        MainActivity.nomes.puta = i;
                        if (MainActivity.nomes.wolves.get(i))
                            erro = true;
                        else erro = false;
                    }
                }
                if (numPutas == 0) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaPuta.this);
                    if (MainActivity.nomes.tipo == 1)
                        builder1.setMessage("Selecione pelo menos uma Puta.");
                    else if (MainActivity.nomes.tipo == 2)
                        builder1.setMessage("Selecione pelo menos um Anjo.");
                    builder1.setCancelable(true);
                    builder1.show();
                }else if(numPutas>1){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaPuta.this);
                    if (MainActivity.nomes.tipo == 1)
                        builder1.setMessage("Selecione apenas uma Puta.");
                    else if (MainActivity.nomes.tipo == 2)
                        builder1.setMessage("Selecione apenas um Anjo.");
                    builder1.setCancelable(true);
                    builder1.show();
                }
                else if (!erro) {
                    Intent it = new Intent(SelecionaPuta.this, PutaSalva.class);
                    startActivity(it);
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaPuta.this);
                    builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Lobo.");
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
    }
}
