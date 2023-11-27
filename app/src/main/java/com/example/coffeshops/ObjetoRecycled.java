package com.example.coffeshops;

public class ObjetoRecycled {
    private int imagenId; // Para recursos Drawable, usa int. Para URLs, usa String.
    private String titulo;
    private String ubicacion;

    // Constructor
    public ObjetoRecycled(int imagenId, String titulo, String ubicacion) {
        this.imagenId = imagenId;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
