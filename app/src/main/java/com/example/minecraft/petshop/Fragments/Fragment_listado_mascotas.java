package com.example.minecraft.petshop.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minecraft.petshop.Adaptadores.MascotaAdapter;
import com.example.minecraft.petshop.Pojo.Mascota;
import com.example.minecraft.petshop.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ameza on 21/03/2017.
 */

public class Fragment_listado_mascotas extends Fragment {


    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private StaggeredGridLayoutManager lManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_listado_mascotas,container,false);

        List<Mascota> items = new ArrayList<>();

        items.add(new Mascota(R.drawable.mascota1, "Boby", 230));
        items.add(new Mascota(R.drawable.mascota2, "Brandon", 456));
        items.add(new Mascota(R.drawable.mascota3, "Pablito", 342));
        items.add(new Mascota(R.drawable.mascota4, "Max", 645));
        items.add(new Mascota(R.drawable.mascota5, "Zack", 459));
        items.add(new Mascota(R.drawable.mascota6, "El Maykol", 459));
        items.add(new Mascota(R.drawable.mascota7, "Tom", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.rvMascotas);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        //lManager = new GridLayoutManager(this,1);
        lManager = new StaggeredGridLayoutManager(1,1);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new MascotaAdapter(items);
        recycler.setAdapter(adapter);


        return v;
    }
}
