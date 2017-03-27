package com.example.minecraft.petshop.model;

/**
 * Created by minecraft on 12/03/2017.
 */

public class Mascota {

    private  int id;
    private int imagen;
    private String nombre;
    private int likes;
    private int foto1,foto2,foto3;

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

    public int getFoto3() {
        return foto3;
    }

    public void setFoto3(int foto3) {
        this.foto3 = foto3;
    }

    public Mascota(int imagen, String nombre, int foto1, int foto2, int foto3) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.likes = likes;
        this.foto1=foto1;
        this.foto2=foto2;
        this.foto3=foto3;
    }

    public Mascota(int imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;

    }

    public Mascota(int imagen, String nombre,int likes) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.likes = likes;
    }

    public Mascota(){}

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
