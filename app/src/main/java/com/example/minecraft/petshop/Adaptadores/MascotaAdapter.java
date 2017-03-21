package com.example.minecraft.petshop.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.minecraft.petshop.Mascota;
import com.example.minecraft.petshop.R;

import java.util.List;

/**
 * Created by minecraft on 12/03/2017.
 */

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    private List<Mascota> items;


    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        public ImageView foto;
        public TextView nombre;
        public TextView visitas;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            foto = (ImageView) itemView.findViewById(R.id.ivFoto);
            nombre = (TextView) itemView.findViewById(R.id.tvNombre);
            visitas = (TextView) itemView.findViewById(R.id.tvLike);

        }
    }

    public MascotaAdapter(List<Mascota> items) {
        this.items = items;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position) {

        holder.foto.setImageResource(items.get(position).getImagen());
        holder.nombre.setText(items.get(position).getNombre());
        holder.visitas.setText(String.valueOf(items.get(position).getLikes()));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
