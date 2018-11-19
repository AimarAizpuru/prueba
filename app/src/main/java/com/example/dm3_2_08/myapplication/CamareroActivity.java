package com.example.dm3_2_08.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CamareroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camarero);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        HashMap<String, List<String>> item = new HashMap<>();

        ArrayList<String> entrantesGroups = new ArrayList<>();
        entrantesGroups.add("Ensalada");
        entrantesGroups.add("Patatas fritas");
        entrantesGroups.add("Chorizo");
        entrantesGroups.add("Plato seleccion ibérica");

        item.put("Entrantes", entrantesGroups);

        ArrayList<String> primerPlatoGroups = new ArrayList<>();
        primerPlatoGroups.add("Macarrones a la boloñesa");
        primerPlatoGroups.add("Rape a la plancha");
        primerPlatoGroups.add("Filete con patatas");
        primerPlatoGroups.add("Bocadillo de croquetas");

        item.put("Primer plato", primerPlatoGroups);

        ArrayList<String> segundoPlatoGroups = new ArrayList<>();
        segundoPlatoGroups.add("Macarrones a la boloñesa");
        segundoPlatoGroups.add("Rape a la plancha");
        segundoPlatoGroups.add("Filete con patatas");
        segundoPlatoGroups.add("Bocadillo de croquetas");

        item.put("Segundo plato", segundoPlatoGroups);

        ArrayList<String> bebidasGroups = new ArrayList<>();
        bebidasGroups.add("Macarrones a la boloñesa");
        bebidasGroups.add("Rape a la plancha");
        bebidasGroups.add("Filete con patatas");
        bebidasGroups.add("Bocadillo de croquetas");

        item.put("Bebidas", bebidasGroups);

        MyExpandableListAdapter adapter = new MyExpandableListAdapter(item);
        expandableListView.setAdapter(adapter);
    }
}
