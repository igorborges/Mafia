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

public class SelecionaLobo extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
    private boolean t1 = true, t2 = true, t3 = true, t4 = true, t5 = true, t6 = true, t7 = true, t8 = true;
    private boolean t9 = true, t10 = true, t11 = true, t12 = true;
    private Button btnNext;
    private int numLobos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainActivity.nomes.tipo == 1)

            setTitle("Selecione o(s) Lobo(s)");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Deus diz:");
        setContentView(R.layout.activity_seleionar_lobo);

        btnNext = (Button) findViewById(R.id.btnNext);

        name1 = (TextView) findViewById(R.id.textView4);
        name2 = (TextView) findViewById(R.id.textView5);
        name3 = (TextView) findViewById(R.id.textView6);
        name4 = (TextView) findViewById(R.id.textView7);
        name5 = (TextView) findViewById(R.id.textView8);
        name6 = (TextView) findViewById(R.id.textView9);
        name7 = (TextView) findViewById(R.id.textView10);
        name8 = (TextView) findViewById(R.id.textView11);
        name9 = (TextView) findViewById(R.id.textView12);
        name10 = (TextView) findViewById(R.id.textView13);
        name11 = (TextView) findViewById(R.id.textView14);
        name12 = (TextView) findViewById(R.id.textView15);

        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);
        r6 = (RadioButton) findViewById(R.id.radioButton6);
        r7 = (RadioButton) findViewById(R.id.radioButton7);
        r8 = (RadioButton) findViewById(R.id.radioButton8);
        r9 = (RadioButton) findViewById(R.id.radioButton9);
        r10 = (RadioButton) findViewById(R.id.radioButton10);
        r11 = (RadioButton) findViewById(R.id.radioButton11);
        r12 = (RadioButton) findViewById(R.id.radioButton12);

        if (MainActivity.nomes.tipo == 1) {
            r1.setText("Lobo");
            r2.setText("Lobo");
            r3.setText("Lobo");
            r4.setText("Lobo");
            r5.setText("Lobo");
            r6.setText("Lobo");
            r7.setText("Lobo");
            r8.setText("Lobo");
            r9.setText("Lobo");
            r10.setText("Lobo");
            r11.setText("Lobo");
            r12.setText("Lobo");
        } else if (MainActivity.nomes.tipo == 2) {

            r1.setText("Assassino");
            r2.setText("Assassino");
            r3.setText("Assassino");
            r4.setText("Assassino");
            r5.setText("Assassino");
            r6.setText("Assassino");
            r7.setText("Assassino");
            r8.setText("Assassino");
            r9.setText("Assassino");
            r10.setText("Assassino");
            r11.setText("Assassino");
            r12.setText("Assassino");
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
                    numLobos++;
                    name1.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name1.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2.setChecked(t2);
                t2 = !t2;
                if (r2.isChecked()) {
                    numLobos++;
                    name2.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name2.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r3.setChecked(t3);
                t3 = !t3;
                if (r3.isChecked()) {
                    numLobos++;
                    name3.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name3.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r4.setChecked(t4);
                t4 = !t4;
                if (r4.isChecked()) {
                    numLobos++;
                    name4.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name4.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r5.setChecked(t5);
                t5 = !t5;
                if (r5.isChecked()) {
                    numLobos++;
                    name5.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name5.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r6.setChecked(t6);
                t6 = !t6;
                if (r6.isChecked()) {
                    numLobos++;
                    name6.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name6.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r7.setChecked(t7);
                t7 = !t7;
                if (r7.isChecked()) {
                    numLobos++;
                    name7.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name7.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r8.setChecked(t8);
                t8 = !t8;
                if (r8.isChecked()) {
                    numLobos++;
                    name8.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name8.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r9.setChecked(t9);
                t9 = !t9;
                if (r9.isChecked()) {
                    numLobos++;
                    name9.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name9.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r10.setChecked(t10);
                t10 = !t10;
                if (r10.isChecked()) {
                    numLobos++;
                    name10.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name10.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r11.setChecked(t11);
                t11 = !t11;
                if (r11.isChecked()) {
                    numLobos++;
                    name11.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name11.setTextColor(Color.BLACK);
                    numLobos--;
                }
            }
        });

        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r12.setChecked(t12);
                t12 = !t12;
                if (r12.isChecked()) {
                    numLobos++;
                    name12.setTextColor(Color.rgb(255, 71, 134));
                } else {
                    name12.setTextColor(Color.BLACK);
                    numLobos--;
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
                MainActivity.nomes.wolves.clear();

                MainActivity.nomes.wolves.add(!t1);
                MainActivity.nomes.wolves.add(!t2);
                MainActivity.nomes.wolves.add(!t3);
                MainActivity.nomes.wolves.add(!t4);
                MainActivity.nomes.wolves.add(!t5);
                MainActivity.nomes.wolves.add(!t6);
                MainActivity.nomes.wolves.add(!t7);
                MainActivity.nomes.wolves.add(!t8);
                MainActivity.nomes.wolves.add(!t9);
                MainActivity.nomes.wolves.add(!t10);
                MainActivity.nomes.wolves.add(!t11);
                MainActivity.nomes.wolves.add(!t12);

                if (numLobos == 0) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaLobo.this);
                    if (MainActivity.nomes.tipo == 1)
                        builder1.setMessage("Selecione pelo menos um Lobo.");
                    else if (MainActivity.nomes.tipo == 2)
                        builder1.setMessage("Selecione pelo menos um Assassino.");
                    builder1.setCancelable(true);
                    builder1.show();
                } else {
                    Intent it = new Intent(SelecionaLobo.this, LoboMata.class);
                    startActivity(it);
                }
            }
        });


    }
}
