package com.example.minecraft.petshop;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListadoMascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_mascotas);


        ActionBar actionBar = getActionBar();
//Escondiendo la Action Bar
        actionBar.hide();

//Mostrando de nuevo la Action Bar
        //actionBar.show();


    }
}
