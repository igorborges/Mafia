package com.example.igorb.mafia;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Votacao extends AppCompatActivity {


    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private TextView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, btnNext;
    private Button b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    private int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, n11 = 0, n12 = 0, vivos = 0, votados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacao);
        setTitle("Votação:");

        name1 = (TextView) findViewById(R.id.textView82);
        name2 = (TextView) findViewById(R.id.textView83);
        name3 = (TextView) findViewById(R.id.textView84);
        name4 = (TextView) findViewById(R.id.textView85);
        name5 = (TextView) findViewById(R.id.textView86);
        name6 = (TextView) findViewById(R.id.textView87);
        name7 = (TextView) findViewById(R.id.textView88);
        name8 = (TextView) findViewById(R.id.textView89);
        name9 = (TextView) findViewById(R.id.textView90);
        name10 = (TextView) findViewById(R.id.textView91);
        name11 = (TextView) findViewById(R.id.textView92);
        name12 = (TextView) findViewById(R.id.textView93);

        btnNext = (Button) findViewById(R.id.button73);

        b1 = (Button) findViewById(R.id.button50);
        b2 = (Button) findViewById(R.id.button51);
        b3 = (Button) findViewById(R.id.button53);
        b4 = (Button) findViewById(R.id.button55);
        b5 = (Button) findViewById(R.id.button57);
        b6 = (Button) findViewById(R.id.button59);
        b7 = (Button) findViewById(R.id.button61);
        b8 = (Button) findViewById(R.id.button63);
        b9 = (Button) findViewById(R.id.button65);
        b10 = (Button) findViewById(R.id.button67);
        b11 = (Button) findViewById(R.id.button69);
        b12 = (Button) findViewById(R.id.button71);

        b13 = (Button) findViewById(R.id.button49);
        b14 = (Button) findViewById(R.id.button52);
        b15 = (Button) findViewById(R.id.button54);
        b16 = (Button) findViewById(R.id.button56);
        b17 = (Button) findViewById(R.id.button58);
        b18 = (Button) findViewById(R.id.button60);
        b19 = (Button) findViewById(R.id.button62);
        b20 = (Button) findViewById(R.id.button64);
        b21 = (Button) findViewById(R.id.button66);
        b22 = (Button) findViewById(R.id.button68);
        b23 = (Button) findViewById(R.id.button70);
        b24 = (Button) findViewById(R.id.button72);

        c1 = (TextView) findViewById(R.id.textView94);
        c2 = (TextView) findViewById(R.id.textView95);
        c3 = (TextView) findViewById(R.id.textView96);
        c4 = (TextView) findViewById(R.id.textView97);
        c5 = (TextView) findViewById(R.id.textView98);
        c6 = (TextView) findViewById(R.id.textView99);
        c7 = (TextView) findViewById(R.id.textView100);
        c8 = (TextView) findViewById(R.id.textView101);
        c9 = (TextView) findViewById(R.id.textView102);
        c10 = (TextView) findViewById(R.id.textView103);
        c11 = (TextView) findViewById(R.id.textView104);
        c12 = (TextView) findViewById(R.id.textView105);

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

        if (!MainActivity.nomes.alive.get(0)) {
            name1.setPaintFlags(name1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b1.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            c1.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(1)) {
            name2.setPaintFlags(name2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b2.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            c2.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(2)) {
            name3.setPaintFlags(name3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b3.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            c3.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(3)) {
            name4.setPaintFlags(name4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b4.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            c4.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(6)) {
            name7.setPaintFlags(name7.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b7.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            c7.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(7)) {
            name8.setPaintFlags(name8.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b8.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
            c8.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(8)) {
            name9.setPaintFlags(name9.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b9.setVisibility(View.INVISIBLE);
            b21.setVisibility(View.INVISIBLE);
            c9.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(9)) {
            name10.setPaintFlags(name10.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b10.setVisibility(View.INVISIBLE);
            b22.setVisibility(View.INVISIBLE);
            c10.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(10)) {
            name11.setPaintFlags(name11.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b11.setVisibility(View.INVISIBLE);
            b23.setVisibility(View.INVISIBLE);
            c11.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(11)) {
            name12.setPaintFlags(name12.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b12.setVisibility(View.INVISIBLE);
            b24.setVisibility(View.INVISIBLE);
            c12.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(4)) {
            name5.setPaintFlags(name5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b5.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            c5.setVisibility(View.INVISIBLE);
        }
        if (!MainActivity.nomes.alive.get(5)) {
            name6.setPaintFlags(name6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            b6.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            c6.setVisibility(View.INVISIBLE);
        }


        if (name1.getText().equals("-")) {
            name1.setVisibility(View.INVISIBLE);
            b1.setVisibility(View.INVISIBLE);
            b13.setVisibility(View.INVISIBLE);
            c1.setVisibility(View.INVISIBLE);
        }
        if (name2.getText().equals("-")) {
            name2.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            b14.setVisibility(View.INVISIBLE);
            c2.setVisibility(View.INVISIBLE);
        }
        if (name3.getText().equals("-")) {
            name3.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
            b15.setVisibility(View.INVISIBLE);
            c3.setVisibility(View.INVISIBLE);
        }
        if (name4.getText().equals("-")) {
            name4.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
            b16.setVisibility(View.INVISIBLE);
            c4.setVisibility(View.INVISIBLE);
        }
        if (name5.getText().equals("-")) {
            name5.setVisibility(View.INVISIBLE);
            b5.setVisibility(View.INVISIBLE);
            b17.setVisibility(View.INVISIBLE);
            c5.setVisibility(View.INVISIBLE);
        }
        if (name6.getText().equals("-")) {
            name6.setVisibility(View.INVISIBLE);
            b6.setVisibility(View.INVISIBLE);
            b18.setVisibility(View.INVISIBLE);
            c6.setVisibility(View.INVISIBLE);
        }
        if (name7.getText().equals("-")) {
            name7.setVisibility(View.INVISIBLE);
            b7.setVisibility(View.INVISIBLE);
            b19.setVisibility(View.INVISIBLE);
            c7.setVisibility(View.INVISIBLE);
        }
        if (name8.getText().equals("-")) {
            name8.setVisibility(View.INVISIBLE);
            b8.setVisibility(View.INVISIBLE);
            b20.setVisibility(View.INVISIBLE);
            c8.setVisibility(View.INVISIBLE);
        }
        if (name9.getText().equals("-")) {
            name9.setVisibility(View.INVISIBLE);
            b9.setVisibility(View.INVISIBLE);
            b21.setVisibility(View.INVISIBLE);
            c9.setVisibility(View.INVISIBLE);
        }
        if (name10.getText().equals("-")) {
            name10.setVisibility(View.INVISIBLE);
            b10.setVisibility(View.INVISIBLE);
            b22.setVisibility(View.INVISIBLE);
            c10.setVisibility(View.INVISIBLE);
        }
        if (name11.getText().equals("-")) {
            name11.setVisibility(View.INVISIBLE);
            b11.setVisibility(View.INVISIBLE);
            b23.setVisibility(View.INVISIBLE);
            c11.setVisibility(View.INVISIBLE);
        }
        if (name12.getText().equals("-")) {
            name12.setVisibility(View.INVISIBLE);
            b12.setVisibility(View.INVISIBLE);
            b24.setVisibility(View.INVISIBLE);
            c12.setVisibility(View.INVISIBLE);
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1 > 0 && n1 < 10) {
                    n1--;
                    c1.setText(String.valueOf(n1));
                } else n1 = 0;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 > 0 && n2 < 10) {
                    n2--;
                    c2.setText(String.valueOf(n2));
                } else n2 = 0;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n3 > 0 && n3 < 10) {
                    n3--;
                    c3.setText(String.valueOf(n3));
                } else n3 = 0;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n4 > 0 && n4 < 10) {
                    n4--;
                    c4.setText(String.valueOf(n4));
                } else n4 = 0;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n5 > 0 && n5 < 10) {
                    n5--;
                    c5.setText(String.valueOf(n5));
                } else n5 = 0;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n6 > 0 && n6 < 10) {
                    n6--;
                    c6.setText(String.valueOf(n6));
                } else n6 = 0;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n7 > 0 && n7 < 10) {
                    n7--;
                    c7.setText(String.valueOf(n7));
                } else n7 = 0;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n8 > 0 && n8 < 10) {
                    n8--;
                    c8.setText(String.valueOf(n8));
                } else n8 = 0;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n9 > 0 && n9 < 10) {
                    n9--;
                    c9.setText(String.valueOf(n9));
                } else n9 = 0;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n10 > 0 && n10 < 10) {
                    n10--;
                    c10.setText(String.valueOf(n10));
                } else n10 = 0;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n11 > 0 && n11 < 10) {
                    n11--;
                    c11.setText(String.valueOf(n11));
                } else n11 = 0;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n12 > 0 && n12 < 10) {
                    n12--;
                    c12.setText(String.valueOf(n12));
                } else n10 = 0;
            }
        });

        //===========================================================================================

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1 >= 0 && n1 < 9) {
                    n1++;
                    c1.setText(String.valueOf(n1));
                } else n1 = 9;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 >= 0 && n2 < 9) {
                    n2++;
                    c2.setText(String.valueOf(n2));
                } else n2 = 9;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n3 >= 0 && n3 < 9) {
                    n3++;
                    c3.setText(String.valueOf(n3));
                } else n3 = 9;
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n4 >= 0 && n4 < 9) {
                    n4++;
                    c4.setText(String.valueOf(n4));
                } else n4 = 9;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n5 >= 0 && n5 < 9) {
                    n5++;
                    c5.setText(String.valueOf(n5));
                } else n5 = 9;
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n6 >= 0 && n6 < 9) {
                    n6++;
                    c6.setText(String.valueOf(n6));
                } else n6 = 9;
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n7 >= 0 && n7 < 9) {
                    n7++;
                    c7.setText(String.valueOf(n7));
                } else n7 = 9;
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n8 >= 0 && n8 < 9) {
                    n8++;
                    c8.setText(String.valueOf(n8));
                } else n8 = 9;
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n9 >= 0 && n9 < 9) {
                    n9++;
                    c9.setText(String.valueOf(n9));
                } else n9 = 9;
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n10 >= 0 && n10 < 9) {
                    n10++;
                    c10.setText(String.valueOf(n10));
                } else n10 = 9;
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n11 >= 0 && n11 < 9) {
                    n11++;
                    c11.setText(String.valueOf(n11));
                } else n11 = 9;
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n12 >= 0 && n12 < 9) {
                    n12++;
                    c12.setText(String.valueOf(n12));
                } else n12 = 9;
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.nomes.rodada++;
                Intent it = new Intent(Votacao.this, CidadeMata.class);
                votados = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12;
                int maior[] = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12};
                vivos = 0;


                int temp = -2, morto = 0, temp2 = -1;
                for (int i = 0; i < 12; i++) {
                    if (temp < maior[i]) {
                        temp2 = temp;
                        temp = maior[i];
                        morto = i;
                    }
                    if (MainActivity.nomes.alive.get(i))
                        vivos++;
                }

                if (votados > vivos) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Votacao.this);
                    builder1.setMessage("Número de votos maior que número de pessoas vivas.");
                    builder1.setCancelable(true);
                    builder1.show();
                } else if (votados == 0) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Votacao.this);
                    builder1.setMessage("Ninguém votou.");
                    builder1.setCancelable(true);
                    builder1.show();
                } else{
                    MainActivity.nomes.mortoDaRodada = morto;
                    MainActivity.nomes.alive.set(morto, false);
                    startActivity(it);
                }
            }
        });


    }
}
