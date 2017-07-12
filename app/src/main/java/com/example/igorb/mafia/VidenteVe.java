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

public class VidenteVe extends AppCompatActivity {

    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, btnNext;
    private String s = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidente_ve);
        if (MainActivity.nomes.tipo == 1)
            setTitle("Vidente escolhe alguém");
        else if (MainActivity.nomes.tipo == 2)
            setTitle("Detetive escolhe alguém");


        name1 = (TextView) findViewById(R.id.textView43);
        name2 = (TextView) findViewById(R.id.textView44);
        name3 = (TextView) findViewById(R.id.textView45);
        name4 = (TextView) findViewById(R.id.textView46);
        name5 = (TextView) findViewById(R.id.textView47);
        name6 = (TextView) findViewById(R.id.textView48);
        name7 = (TextView) findViewById(R.id.textView49);
        name8 = (TextView) findViewById(R.id.textView50);
        name9 = (TextView) findViewById(R.id.textView51);
        name10 = (TextView) findViewById(R.id.textView52);
        name11 = (TextView) findViewById(R.id.textView65);
        name12 = (TextView) findViewById(R.id.textView66);

        b1 = (Button) findViewById(R.id.button20);
        b2 = (Button) findViewById(R.id.button21);
        b3 = (Button) findViewById(R.id.button22);
        b4 = (Button) findViewById(R.id.button23);
        b5 = (Button) findViewById(R.id.button24);
        b6 = (Button) findViewById(R.id.button25);
        b7 = (Button) findViewById(R.id.button26);
        b8 = (Button) findViewById(R.id.button27);
        b9 = (Button) findViewById(R.id.button28);
        b10 = (Button) findViewById(R.id.button29);
        b11 = (Button) findViewById(R.id.button42);
        b12 = (Button) findViewById(R.id.button43);

        btnNext = (Button) findViewById(R.id.button44);

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

        if (MainActivity.nomes.seer.get(0)) name1.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(1)) name2.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(2)) name3.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(3)) name4.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(4)) name5.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(5)) name6.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(6)) name7.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(7)) name8.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(8)) name9.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(9)) name10.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(10)) name11.setTextColor(Color.rgb(102, 153, 0));
        if (MainActivity.nomes.seer.get(11)) name12.setTextColor(Color.rgb(102, 153, 0));

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
        }
        if (!MainActivity.nomes.alive.get(1)) {
            name2.setPaintFlags(name2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(2)) {
            name3.setPaintFlags(name3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(3)) {
            name4.setPaintFlags(name4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(4)) {
            name5.setPaintFlags(name5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(5)) {
            name6.setPaintFlags(name6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(6)) {
            name7.setPaintFlags(name7.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(7)) {
            name8.setPaintFlags(name8.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(8)) {
            name9.setPaintFlags(name9.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(9)) {
            name10.setPaintFlags(name10.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(10)) {
            name11.setPaintFlags(name11.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        if (!MainActivity.nomes.alive.get(11)) {
            name12.setPaintFlags(name12.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }

        MainActivity.nomes.alive.set(MainActivity.nomes.mortoDaRodada, false);
        MainActivity.nomes.message = "Que pena,\n" + MainActivity.nomes.vet.get(MainActivity.nomes.mortoDaRodada).getText().toString() + "\nmorreu!";


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(0)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(0)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(0).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                } else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(0)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(0)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(0).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(1)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(1)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(1).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(1)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(1)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(1).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(2)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(2)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(2).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(2)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(2)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(2).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(3)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(3)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(3).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(3)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(3)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(3).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(4)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(4)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(4).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(4)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(4)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(4).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(5)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(5)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(5).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(5)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(5)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(5).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(6)) {

                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(6)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(6).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(6)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(6)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(6).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(7)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(7)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(7).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(7)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(7)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(7).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(8)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(8)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(8).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(8)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(8)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(8).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(9)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(9)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(9).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(9)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(9)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(9).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(10)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(10)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(10).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(10)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(10)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(10).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.nomes.tipo == 1) {
                    if (MainActivity.nomes.hooker.get(11)) {
                        s = "PUTA";
                    } else if (MainActivity.nomes.wolves.get(11)) {
                        s = "LOBO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Vidente revela que " + MainActivity.nomes.vet.get(11).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }else if (MainActivity.nomes.tipo == 2) {
                    if (MainActivity.nomes.hooker.get(11)) {
                        s = "ANJO";
                    } else if (MainActivity.nomes.wolves.get(11)) {
                        s = "ASSASSINO";
                    } else s = "VÍTIMA";
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(VidenteVe.this);
                    builder1.setMessage("Detetive revela que " + MainActivity.nomes.vet.get(11).getText() + " é... " + s);
                    builder1.setCancelable(true);
                    builder1.show();
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(VidenteVe.this, VidenteDorme.class);
                startActivity(it);
            }
        });
    }
}
