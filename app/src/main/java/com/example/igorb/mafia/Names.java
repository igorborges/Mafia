package com.example.igorb.mafia;

import android.widget.TextView;

import java.util.Vector;

/**
 * Created by igorb on 17/01/2016.
 */
public class Names {
    public Names() {
        vet = new Vector<TextView>();
        wolves = new Vector<Boolean>();
        seer = new Vector<Boolean>();
        hooker = new Vector<Boolean>();
        alive = new Vector<Boolean>();
        message = new String();
    }

    Vector<TextView> vet;
    Vector<Boolean> wolves;
    Vector<Boolean> seer;
    Vector<Boolean> hooker;
    Vector<Boolean> alive;
    Integer mortoDaRodada, puta, vidente, rodada = 1, tipo;
    String message;


}
