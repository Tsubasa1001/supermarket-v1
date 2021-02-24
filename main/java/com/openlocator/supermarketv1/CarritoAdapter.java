package com.openlocator.supermarketv1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.openlocator.supermarketv1.modelos.Carrito;

import java.util.ArrayList;

public class CarritoAdapter extends ArrayAdapter<Carrito> {
    ArrayList<Carrito> listaListaCarrito;

    public CarritoAdapter( Context context, ArrayList<Carrito> carrito) {
        super(context, 0, carrito);
        listaListaCarrito = new ArrayList<>();
        listaListaCarrito = carrito;
    }


    @Override
    public View getView(int position,@Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_carrito,parent,false);
        }

        TextView nombre = convertView.findViewById(R.id.textViewNombreC);
        TextView precio = convertView.findViewById(R.id.textViewPrecioC);
        TextView disponbilidad = convertView.findViewById(R.id.textViewDisponibilidadC);


        Carrito carrito = listaListaCarrito.get(position);
        nombre.setText(carrito.getNombreC());
        precio.setText(carrito.getPrecioC());
        disponbilidad.setText(carrito.getEstadoC());

        return convertView;
    }
}
