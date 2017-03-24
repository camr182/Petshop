package com.example.minecraft.petshop.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minecraft.petshop.Adaptadores.MascotaPerfilAdapter;
import com.example.minecraft.petshop.Pojo.Mascota;
import com.example.minecraft.petshop.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ameza on 21/03/2017.
 */

public class Fragment_perfil_mascota extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private StaggeredGridLayoutManager lManager;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil_mascota,container,false);


        List<Mascota> items = new ArrayList<>();

        items.add(new Mascota(R.drawable.mascota1, "Boby",R.drawable.mascota1,R.drawable.mascota1,R.drawable.mascota1));
        items.add(new Mascota(R.drawable.mascota2, "Brandon",R.drawable.mascota2,R.drawable.mascota2,R.drawable.mascota2));
        items.add(new Mascota(R.drawable.mascota3, "Pablito",R.drawable.mascota3,R.drawable.mascota3,R.drawable.mascota3));
        items.add(new Mascota(R.drawable.mascota4, "Max",R.drawable.mascota3,R.drawable.mascota3,R.drawable.mascota4));
        items.add(new Mascota(R.drawable.mascota5, "Zack",R.drawable.mascota4,R.drawable.mascota4,R.drawable.mascota5));
        items.add(new Mascota(R.drawable.mascota6, "El Maykol",R.drawable.mascota5,R.drawable.mascota5,R.drawable.mascota6));
        items.add(new Mascota(R.drawable.mascota7, "Tom",R.drawable.mascota6,R.drawable.mascota6,R.drawable.mascota7));

        // Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.rvMascotaPerfil);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        //lManager = new GridLayoutManager(this,1);
        lManager = new StaggeredGridLayoutManager(1,1);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new MascotaPerfilAdapter(items);
        recycler.setAdapter(adapter);


        return v;
    }
}
