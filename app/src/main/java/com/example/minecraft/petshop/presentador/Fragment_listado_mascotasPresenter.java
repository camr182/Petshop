package com.example.minecraft.petshop.presentador;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.example.minecraft.petshop.Adaptadores.MascotaAdapter;
import com.example.minecraft.petshop.R;
import com.example.minecraft.petshop.model.ConstructorMascotas;
import com.example.minecraft.petshop.model.Mascota;

import java.util.ArrayList;

/**
 * Created by minecraft on 26/03/2017.
 */

public class Fragment_listado_mascotasPresenter implements IFragment_listado_mascotasPresenter {


    //private IFragment_listado_mascotasPresenter iFragment_listado_mascotasPresenter;
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private StaggeredGridLayoutManager lManager;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;
    private View v;
    private Activity activity;

    public  Fragment_listado_mascotasPresenter(Context context, View v, Activity activity) {
       // this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        this.v=v;
        this.activity=activity;
        obtenerMascotas();
    }

    @Override
    public void obtenerMascotas() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        //mostrarMacotasRV();

        //ArrayList<Mascota> items = new ArrayList<>();
        // Obtener el Recycler
        recycler = (RecyclerView) v.findViewById(R.id.rvMascotas);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        //lManager = new GridLayoutManager(this,1);
        lManager = new StaggeredGridLayoutManager(1,1);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new MascotaAdapter(mascotas,activity);
        recycler.setAdapter(adapter);


    }

    /*
    @Override
    public void mostrarMacotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(contactos));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }*/
}
