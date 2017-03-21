package com.example.minecraft.petshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.minecraft.petshop.Adaptadores.MascotaAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    //private GridLayoutManager lManager;
    private StaggeredGridLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar Animes
        List<Mascota> items = new ArrayList<>();

        items.add(new Mascota(R.drawable.mascota1, "Boby", 230));
        items.add(new Mascota(R.drawable.mascota2, "Brandon", 456));
        items.add(new Mascota(R.drawable.mascota3, "Pablito", 342));
        items.add(new Mascota(R.drawable.mascota4, "Max", 645));
        items.add(new Mascota(R.drawable.mascota5, "Zack", 459));
        items.add(new Mascota(R.drawable.mascota6, "El Maykol", 459));
        items.add(new Mascota(R.drawable.mascota7, "Tom", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.rvMascotas);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        //lManager = new GridLayoutManager(this,1);
        lManager = new StaggeredGridLayoutManager(1,1);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new MascotaAdapter(items);

        recycler.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.acerca:

                Intent i = new Intent(this,DetalleMascota.class);
                startActivity(i);

            break;

            case R.id.contacto:

                Intent in = new Intent(this,ListadoMascotas.class);
                startActivity(in);

                break;

            case R.id.detalleMascota:

                Intent inr = new Intent(this,ListadoMascotas.class);
                startActivity(inr);

                break;


        }




        return super.onOptionsItemSelected(item);
    }
}
