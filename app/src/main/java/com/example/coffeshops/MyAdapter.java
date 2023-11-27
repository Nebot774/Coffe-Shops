package com.example.coffeshops;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ObjetoRecycled> listaObjetos;

    //constructor para crear objetos
    public MyAdapter() {
        listaObjetos = new ArrayList<>();
        // Añadir datos de ejemplo a la lista
        listaObjetos.add(new ObjetoRecycled(R.drawable.images, "Antico Caffè Greco", "St. Italy,Rome"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images1, "Coffe Room", "St. Germany,Berlin"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images2, "Coffe Ibiza", "St. Colon,Madrid"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images3, "Pudding Coffe Shop", "St. Diagonal,Barcelona"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images4, "L´Express", "St. Picadilly Circus,London"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images5, "Coffe Room", "St. Àngel Guimerà,Valencia"));
        listaObjetos.add(new ObjetoRecycled(R.drawable.images6, "Sweet Cup", "St. Kinkerstraat,Amsterdam"));


    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjetoRecycled objetoActual = listaObjetos.get(position);
        holder.tvTitulo.setText(objetoActual.getTitulo());
        holder.tvDireccion.setText(objetoActual.getUbicacion());

        holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                holder.tvRating.setText(String.valueOf(rating));
            }
        });



        // Establecer la imagen
        holder.imageN.setImageResource(objetoActual.getImagenId());
    }





    @Override
    public int getItemCount() {
        // Retorna la cantidad de ítems en tu lista
        return listaObjetos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageN;
        TextView tvTitulo;
        TextView tvDireccion;

        TextView tvRating;
        RatingBar ratingBar;

        ViewHolder(View itemView) {
            super(itemView);
            imageN = itemView.findViewById(R.id.imageN);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDireccion = itemView.findViewById(R.id.tvDireccion);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            tvRating = itemView.findViewById(R.id.tvRating);
        }
    }
}
