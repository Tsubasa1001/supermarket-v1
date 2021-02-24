package com.openlocator.supermarketv1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.openlocator.supermarketv1.modelos.Categoria;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder> {
    List<Categoria> categoriaList;
    Context context;


    public static class CategoriaViewHolder extends RecyclerView.ViewHolder{

         CardView cv;
         TextView nombre;
         ImageView imagen;

         CategoriaViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            nombre = (TextView)itemView.findViewById(R.id.txtViewCategoria);
            imagen = (ImageView) itemView.findViewById(R.id.imgViewItem);
        }
    }
    public CategoriaAdapter(List<Categoria> categoriaList, Context context) {
        this.categoriaList = categoriaList;
        this.context= context;
    }


    @NonNull
    @Override
    public CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_categoria,viewGroup, false);
        CategoriaViewHolder holder = new CategoriaViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoriaViewHolder categoriaViewHolder, int i) {

        categoriaViewHolder.nombre.setText(categoriaList.get(i).getNombre());
        categoriaViewHolder.imagen.setImageResource(categoriaList.get(i).getImagen());

        categoriaViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = (categoriaViewHolder.nombre.getText()).toString();
                Intent intent = new Intent(context,ListaProductosActivity.class);
                intent.putExtra("categoria", nombre);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return categoriaList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);

    }
}
