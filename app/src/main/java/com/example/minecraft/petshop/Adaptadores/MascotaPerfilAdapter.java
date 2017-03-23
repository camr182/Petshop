package com.example.minecraft.petshop.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.minecraft.petshop.Pojo.Mascota;
import com.example.minecraft.petshop.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by ameza on 21/03/2017.
 */

public class MascotaPerfilAdapter extends RecyclerView.Adapter<MascotaPerfilAdapter.MascotaPerfilViewHolder> {

    private List<Mascota> items;

    public static class MascotaPerfilViewHolder extends RecyclerView.ViewHolder {

        public TextView nombrePerfil;
        public CircularImageView imagenPerfil;
        public ImageView foto1,foto2,foto3;


        public MascotaPerfilViewHolder(View itemView) {
            super(itemView);

            nombrePerfil = (TextView) itemView.findViewById(R.id.tvNombrePerfil);
            imagenPerfil = (CircularImageView) itemView.findViewById(R.id.circularImageView);
            foto1 = (ImageView) itemView.findViewById(R.id.ivFoto1);
            foto2 = (ImageView) itemView.findViewById(R.id.ivFoto2);
            foto3 = (ImageView) itemView.findViewById(R.id.ivFoto3);

        }


    }


    public MascotaPerfilAdapter(List<Mascota> items) {
        this.items = items;
    }

    @Override
    public MascotaPerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_perfil_mascota,parent,false);
        return new MascotaPerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaPerfilViewHolder holder, int position) {

        holder.imagenPerfil.setImageResource(items.get(position).getImagen());
        holder.nombrePerfil.setText(items.get(position).getNombre());
        holder.foto1.setImageResource(items.get(position).getFoto1());
        holder.foto2.setImageResource(items.get(position).getFoto2());
        holder.foto3.setImageResource(items.get(position).getFoto3());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
