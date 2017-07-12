package com.example.igorb.mafia;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Vector;


public class MainActivity extends AppCompatActivity {

    private EditText nameToAdd;
    private Button btnAdd, btnStart, btnList;
    private TextView name1, name2, name3, name4, name5, name11;
    private TextView name6, name7, name8, name9, name10, name12;
    private ImageView x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12;
    public Vector<ImageView> xs = new Vector<ImageView>();
    public static Names nomes = new Names();
    public String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Mafia";

    //    public BufferedReader br;
//    public BufferedWriter bw;
    public String linha;

    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Adicionar Jogadores");
        setContentView(R.layout.activity_main);

        nameToAdd = (EditText) findViewById(R.id.addName);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnList = (Button) findViewById(R.id.button79);

        File dir = new File(path);
        dir.mkdir();
//        file = new File(String.valueOf(getResources().openRawResource(R.raw.nomes)));
//        br = new BufferedReader(file);
//        bw = new BufferedWriter(new InputStreamReader(getResources().openRawResource(R.raw.nomes)));


        name1 = (TextView) findViewById(R.id.name1);
        name2 = (TextView) findViewById(R.id.name2);
        name3 = (TextView) findViewById(R.id.name3);
        name4 = (TextView) findViewById(R.id.name4);
        name5 = (TextView) findViewById(R.id.name5);
        name6 = (TextView) findViewById(R.id.name6);
        name7 = (TextView) findViewById(R.id.name7);
        name8 = (TextView) findViewById(R.id.name8);
        name9 = (TextView) findViewById(R.id.name9);
        name10 = (TextView) findViewById(R.id.name10);
        name11 = (TextView) findViewById(R.id.name11);
        name12 = (TextView) findViewById(R.id.name12);

        nomes.vet.addElement(name1);
        nomes.vet.addElement(name2);
        nomes.vet.addElement(name3);
        nomes.vet.addElement(name4);
        nomes.vet.addElement(name5);
        nomes.vet.addElement(name6);
        nomes.vet.addElement(name7);
        nomes.vet.addElement(name8);
        nomes.vet.addElement(name9);
        nomes.vet.addElement(name10);
        nomes.vet.addElement(name11);
        nomes.vet.addElement(name12);

        x1 = (ImageView) findViewById(R.id.x1);
        x2 = (ImageView) findViewById(R.id.x2);
        x3 = (ImageView) findViewById(R.id.x3);
        x4 = (ImageView) findViewById(R.id.x4);
        x5 = (ImageView) findViewById(R.id.x5);
        x6 = (ImageView) findViewById(R.id.x6);
        x7 = (ImageView) findViewById(R.id.x7);
        x8 = (ImageView) findViewById(R.id.x8);
        x9 = (ImageView) findViewById(R.id.x9);
        x10 = (ImageView) findViewById(R.id.x10);
        x11 = (ImageView) findViewById(R.id.x11);
        x12 = (ImageView) findViewById(R.id.x12);

        xs.addElement(x1);
        xs.addElement(x2);
        xs.addElement(x3);
        xs.addElement(x4);
        xs.addElement(x5);
        xs.addElement(x6);
        xs.addElement(x7);
        xs.addElement(x8);
        xs.addElement(x9);
        xs.addElement(x10);
        xs.addElement(x11);
        xs.addElement(x12);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonEffect(btnStart);
                if (MainActivity.nomes.vet.get(0).getText().equals("-")) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                    builder1.setMessage("Nenhum Participante adicionado.");
                    builder1.setCancelable(true);
                    builder1.show();
                } else {
                    String names[] = {
                            name1.getText().toString(), name2.getText().toString(), name3.getText().toString(), name4.getText().toString(), name5.getText().toString(), name6.getText().toString(), name7.getText().toString(), name8.getText().toString(), name9.getText().toString(), name10.getText().toString(), name11.getText().toString(), name12.getText().toString()
                    };

                    File file = new File(path + "/recentNames.txt");
                    Save(file, names);

                    nameToAdd.setText("");
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();

                    Intent it = new Intent(MainActivity.this, CidadeDorme.class);
                    startActivity(it);
                }
            }
        });

        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name1.getText().toString().equals("-")) {
                    for (int i = 0; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }

                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name2.getText().toString().equals("-")) {
                    for (int i = 1; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name3.getText().toString().equals("-")) {
                    for (int i = 2; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name4.getText().toString().equals("-")) {
                    for (int i = 3; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name5.getText().toString().equals("-")) {
                    for (int i = 4; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name6.getText().toString().equals("-")) {
                    for (int i = 5; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name7.getText().toString().equals("-")) {
                    for (int i = 6; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name8.getText().toString().equals("-")) {
                    for (int i = 7; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name9.getText().toString().equals("-")) {
                    for (int i = 8; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name10.getText().toString().equals("-")) {
                    for (int i = 9; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name11.getText().toString().equals("-")) {
                    for (int i = 10; i < cont - 1; i++) {
                        nomes.vet.get(i).setText(nomes.vet.get(i + 1).getText());
                    }
                    cont--;
                    nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                    xs.get(cont).setVisibility(View.INVISIBLE);
                    if (cont == 11)
                        nomes.vet.get(11).setText("-");
                    else nomes.vet.get(cont).setText("-");
                }
            }
        });

        x12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cont--;
                nomes.vet.get(cont).setVisibility(View.INVISIBLE);
                xs.get(cont).setVisibility(View.INVISIBLE);

            }
        });

        if (MainActivity.nomes.vet.get(0).getText().equals("-")) {
            name1.setVisibility(View.INVISIBLE);
            x1.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(1).getText().equals("-")) {
            name2.setVisibility(View.INVISIBLE);
            x2.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(2).getText().equals("-")) {
            name3.setVisibility(View.INVISIBLE);
            x3.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(3).getText().equals("-")) {
            name4.setVisibility(View.INVISIBLE);
            x4.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(4).getText().equals("-")) {
            name5.setVisibility(View.INVISIBLE);
            x5.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(5).getText().equals("-")) {
            name6.setVisibility(View.INVISIBLE);
            x6.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(6).getText().equals("-")) {
            name7.setVisibility(View.INVISIBLE);
            x7.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(7).getText().equals("-")) {
            name8.setVisibility(View.INVISIBLE);
            x8.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(8).getText().equals("-")) {
            name9.setVisibility(View.INVISIBLE);
            x9.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(9).getText().equals("-")) {
            name10.setVisibility(View.INVISIBLE);
            x10.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(10).getText().equals("-")) {
            name11.setVisibility(View.INVISIBLE);
            x11.setVisibility(View.INVISIBLE);
        }
        if (MainActivity.nomes.vet.get(11).getText().equals("-")) {
            name12.setVisibility(View.INVISIBLE);
            x12.setVisibility(View.INVISIBLE);
        }


        for (int i = 0; i < 12; i++)
            nomes.alive.addElement(true);


        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = new File(path + "/recentNames.txt");
                String[] loadText = Load(file);
                String finalString = "";
                cont = 0;

                name1.setText(loadText[0]);
                name2.setText(loadText[1]);
                name3.setText(loadText[2]);
                name4.setText(loadText[3]);
                name5.setText(loadText[4]);
                name6.setText(loadText[5]);
                name7.setText(loadText[6]);
                name8.setText(loadText[7]);
                name9.setText(loadText[8]);
                name10.setText(loadText[9]);
                name11.setText(loadText[10]);
                name12.setText(loadText[11]);

                name1.setVisibility(View.VISIBLE);
                name2.setVisibility(View.VISIBLE);
                name3.setVisibility(View.VISIBLE);
                name4.setVisibility(View.VISIBLE);
                name5.setVisibility(View.VISIBLE);
                name6.setVisibility(View.VISIBLE);
                name7.setVisibility(View.VISIBLE);
                name8.setVisibility(View.VISIBLE);
                name9.setVisibility(View.VISIBLE);
                name10.setVisibility(View.VISIBLE);
                name11.setVisibility(View.VISIBLE);
                name12.setVisibility(View.VISIBLE);

                x1.setVisibility(View.VISIBLE);
                x2.setVisibility(View.VISIBLE);
                x3.setVisibility(View.VISIBLE);
                x4.setVisibility(View.VISIBLE);
                x5.setVisibility(View.VISIBLE);
                x6.setVisibility(View.VISIBLE);
                x7.setVisibility(View.VISIBLE);
                x8.setVisibility(View.VISIBLE);
                x9.setVisibility(View.VISIBLE);
                x10.setVisibility(View.VISIBLE);
                x11.setVisibility(View.VISIBLE);
                x12.setVisibility(View.VISIBLE);


                if (MainActivity.nomes.vet.get(0).getText().equals("-")) {
                    name1.setVisibility(View.INVISIBLE);
                    x1.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(1).getText().equals("-")) {
                    name2.setVisibility(View.INVISIBLE);
                    x2.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(2).getText().equals("-")) {
                    name3.setVisibility(View.INVISIBLE);
                    x3.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(3).getText().equals("-")) {
                    name4.setVisibility(View.INVISIBLE);
                    x4.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(4).getText().equals("-")) {
                    name5.setVisibility(View.INVISIBLE);
                    x5.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(5).getText().equals("-")) {
                    name6.setVisibility(View.INVISIBLE);
                    x6.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(6).getText().equals("-")) {
                    name7.setVisibility(View.INVISIBLE);
                    x7.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(7).getText().equals("-")) {
                    name8.setVisibility(View.INVISIBLE);
                    x8.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(8).getText().equals("-")) {
                    name9.setVisibility(View.INVISIBLE);
                    x9.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(9).getText().equals("-")) {
                    name10.setVisibility(View.INVISIBLE);
                    x10.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(10).getText().equals("-")) {
                    name11.setVisibility(View.INVISIBLE);
                    x11.setVisibility(View.INVISIBLE);
                    cont++;
                }
                if (MainActivity.nomes.vet.get(11).getText().equals("-")) {
                    name12.setVisibility(View.INVISIBLE);
                    x12.setVisibility(View.INVISIBLE);
                    cont++;
                }
                cont = 12 - cont;

            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                buttonEffect(btnAdd);
                String name = nameToAdd.getText().toString();
                if (!name.isEmpty()) {
                    if (cont > 11) {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                        builder1.setMessage("Número máximo de participantes atingido, exclua alguém para adicionar mais participantes.");
                        builder1.setCancelable(true);
                        builder1.show();
                    } else {
                        nameToAdd.setText("");
                        nomes.vet.get(cont).setText(name);
                        nomes.vet.get(cont).setVisibility(View.VISIBLE);
                        xs.get(cont).setVisibility(View.VISIBLE);

                        cont++;
                    }
                }
                // TODO Auto-generated method stub
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public static void Save(File file, String[] data) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            try {
                for (int i = 0; i < data.length; i++) {
                    fos.write(data[i].getBytes());
                    if (i < data.length - 1) {
                        fos.write("\n".getBytes());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String[] Load(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String test;
        int anzahl = 0;
        try {
            while ((test = br.readLine()) != null) {
                anzahl++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fis.getChannel().position(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] array = new String[anzahl];

        String line;
        int i = 0;
        try {
            while ((line = br.readLine()) != null) {
                array[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void buttonEffect(View btnAdd) {
        btnAdd.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.igorb.mafia/http/host/path")
        );
//        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.igorb.mafia/http/host/path")
        );
//        AppIndex.AppIndexApi.end(client, viewAction);
//        client.disconnect();
    }
}
