package com.droidpe.init.conocehuaycan.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.widget.ListView;

import com.droidpe.init.conocehuaycan.R;
import com.droidpe.init.conocehuaycan.adapter.LugarAdapter;
import com.droidpe.init.conocehuaycan.model.Lugar;

import java.util.ArrayList;
import java.util.List;

public class MainConoceHuaycan extends AppCompatActivity {

    RecyclerView listaRestaurantes;
    LugarAdapter lugarAdapter;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Lugar> lugare = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_conoce_huaycan);

        listaRestaurantes = findViewById(R.id.list_lugares);

        Lugar lugar = new Lugar("El arte del cafe","huaycan","Cafeteria",921803515,5);
        Lugar lugar2 = new Lugar("El arte del cafe","huaycan","Cafeteria",921803515,5);
        Lugar lugar3 = new Lugar("El arte del cafe","huaycan","Cafeteria",921803515,5);

        lugare.add(lugar);
        lugare.add(lugar2);
        lugare.add(lugar3);


        listaRestaurantes.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        listaRestaurantes.setLayoutManager(mLayoutManager);
        listaRestaurantes.setItemAnimator(new DefaultItemAnimator());


        mAdapter = new LugarAdapter(lugare);
        listaRestaurantes.setAdapter(mAdapter);

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(listaRestaurantes);


    }
}
