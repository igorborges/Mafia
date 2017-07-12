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

public class SelecionaVidente extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
    private boolean t1 = true, t2 = true, t3 = true, t4 = true, t5 = true, t6 = true, t7 = true, t8 = true;
    private boolean t9 = true, t10 = true, t11 = true, t12 = true, erro1 = false, erro2 = false;
    private Button btnNext;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleciona_vidente);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Selecionar Vidente:");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Selecionar Detetive:");


        btnNext = (Button) findViewById(R.id.button46);

        name1 = (TextView) findViewById(R.id.textView68);
        name2 = (TextView) findViewById(R.id.textView69);
        name3 = (TextView) findViewById(R.id.textView70);
        name4 = (TextView) findViewById(R.id.textView71);
        name5 = (TextView) findViewById(R.id.textView72);
        name6 = (TextView) findViewById(R.id.textView73);
        name7 = (TextView) findViewById(R.id.textView74);
        name8 = (TextView) findViewById(R.id.textView75);
        name9 = (TextView) findViewById(R.id.textView76);
        name10 = (TextView) findViewById(R.id.textView77);
        name11 = (TextView) findViewById(R.id.textView78);
        name12 = (TextView) findViewById(R.id.textView79);

        r1 = (RadioButton) findViewById(R.id.radioButton24);
        r2 = (RadioButton) findViewById(R.id.radioButton25);
        r3 = (RadioButton) findViewById(R.id.radioButton26);
        r4 = (RadioButton) findViewById(R.id.radioButton27);
        r5 = (RadioButton) findViewById(R.id.radioButton28);
        r6 = (RadioButton) findViewById(R.id.radioButton29);
        r7 = (RadioButton) findViewById(R.id.radioButton30);
        r8 = (RadioButton) findViewById(R.id.radioButton31);
        r9 = (RadioButton) findViewById(R.id.radioButton32);
        r10 = (RadioButton) findViewById(R.id.radioButton33);
        r11 = (RadioButton) findViewById(R.id.radioButton34);
        r12 = (RadioButton) findViewById(R.id.radioButton35);

        if (MainActivity.nomes.tipo == 1){
            r1.setText("Vidente");
            r2.setText("Vidente");
            r3.setText("Vidente");
            r4.setText("Vidente");
            r5.setText("Vidente");
            r6.setText("Vidente");
            r7.setText("Vidente");
            r8.setText("Vidente");
            r9.setText("Vidente");
            r10.setText("Vidente");
            r11.setText("Vidente");
            r12.setText("Vidente");
        } else if (MainActivity.nomes.tipo == 2){
            r1.setText("Detetive");
            r2.setText("Detetive");
            r3.setText("Detetive");
            r4.setText("Detetive");
            r5.setText("Detetive");
            r6.setText("Detetive");
            r7.setText("Detetive");
            r8.setText("Detetive");
            r9.setText("Detetive");
            r10.setText("Detetive");
            r11.setText("Detetive");
            r12.setText("Detetive");
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
                if (r1.isChecked())
                    name1.setTextColor(Color.rgb(255, 71, 134));
                else name1.setTextColor(Color.BLACK);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2.setChecked(t2);
                t2 = !t2;
                if (r2.isChecked())
                    name2.setTextColor(Color.rgb(255, 71, 134));
                else name2.setTextColor(Color.BLACK);
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r3.setChecked(t3);
                t3 = !t3;
                if (r3.isChecked())
                    name3.setTextColor(Color.rgb(255, 71, 134));
                else name3.setTextColor(Color.BLACK);
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r4.setChecked(t4);
                t4 = !t4;
                if (r4.isChecked())
                    name4.setTextColor(Color.rgb(255, 71, 134));
                else name4.setTextColor(Color.BLACK);
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r5.setChecked(t5);
                t5 = !t5;
                if (r5.isChecked())
                    name5.setTextColor(Color.rgb(255, 71, 134));
                else name5.setTextColor(Color.BLACK);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r6.setChecked(t6);
                t6 = !t6;
                if (r6.isChecked())
                    name6.setTextColor(Color.rgb(255, 71, 134));
                else name6.setTextColor(Color.BLACK);
            }
        });

        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r7.setChecked(t7);
                t7 = !t7;
                if (r7.isChecked())
                    name7.setTextColor(Color.rgb(255, 71, 134));
                else name7.setTextColor(Color.BLACK);
            }
        });

        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r8.setChecked(t8);
                t8 = !t8;
                if (r8.isChecked())
                    name8.setTextColor(Color.rgb(255, 71, 134));
                else name8.setTextColor(Color.BLACK);
            }
        });

        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r9.setChecked(t9);
                t9 = !t9;
                if (r9.isChecked())
                    name9.setTextColor(Color.rgb(255, 71, 134));
                else name9.setTextColor(Color.BLACK);
            }
        });

        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r10.setChecked(t10);
                t10 = !t10;
                if (r10.isChecked())
                    name10.setTextColor(Color.rgb(255, 71, 134));
                else name10.setTextColor(Color.BLACK);
            }
        });

        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r11.setChecked(t11);
                t11 = !t11;
                if (r11.isChecked())
                    name11.setTextColor(Color.rgb(255, 71, 134));
                else name11.setTextColor(Color.BLACK);
            }
        });

        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r12.setChecked(t12);
                t12 = !t12;
                if (r12.isChecked())
                    name12.setTextColor(Color.rgb(255, 71, 134));
                else name12.setTextColor(Color.BLACK);
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
                MainActivity.nomes.seer.clear();
                erro1 = false;
                erro2 = false;

                MainActivity.nomes.seer.add(r1.isChecked());
                MainActivity.nomes.seer.add(r2.isChecked());
                MainActivity.nomes.seer.add(r3.isChecked());
                MainActivity.nomes.seer.add(r4.isChecked());
                MainActivity.nomes.seer.add(r5.isChecked());
                MainActivity.nomes.seer.add(r6.isChecked());
                MainActivity.nomes.seer.add(r7.isChecked());
                MainActivity.nomes.seer.add(r8.isChecked());
                MainActivity.nomes.seer.add(r9.isChecked());
                MainActivity.nomes.seer.add(r10.isChecked());
                MainActivity.nomes.seer.add(r11.isChecked());
                MainActivity.nomes.seer.add(r12.isChecked());
                cont = 0;
                for (int i = 0; i < 12; i++) {
                    if (MainActivity.nomes.seer.get(i)) {
                        cont++;
                        MainActivity.nomes.vidente = i;
                        if (MainActivity.nomes.wolves.get(i)) erro1 = true;
                        if (MainActivity.nomes.hooker.get(i)) erro2 = true;
                    }
                }

//                if(cont>=2){
//                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaVidente.this);
//                    builder1.setMessage("Só é possível selecionar um Vidente.");
//                    builder1.setCancelable(true);
//                    builder1.show();
                //}else
                if (!erro1 && !erro2) {
                    Intent it = new Intent(SelecionaVidente.this, VidenteVe.class);
                    startActivity(it);
                } else if (erro1) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaVidente.this);
                    if (MainActivity.nomes.tipo == 1)
                        builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Lobo.");
                    else if (MainActivity.nomes.tipo == 2)
                        builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Assassino.");
                    builder1.setCancelable(true);
                    builder1.show();
                } else if (erro2) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SelecionaVidente.this);
                    if (MainActivity.nomes.tipo == 1)
                        builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Lobo.");
                    else if (MainActivity.nomes.tipo == 2)
                        builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Assassino.");
                    builder1.setMessage("Não pode selecionar essa pessoa, pois ela já é Puta.");
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
    }
}
