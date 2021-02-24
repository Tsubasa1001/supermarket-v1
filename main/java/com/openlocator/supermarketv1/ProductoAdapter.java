package com.openlocator.supermarketv1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openlocator.supermarketv1.modelos.Producto;

import java.util.ArrayList;

public class ProductoAdapter extends ArrayAdapter<Producto> {
    ArrayList<Producto> listaProducto;

    public boolean select = false;

    public ProductoAdapter(@NonNull Context context, ArrayList<Producto> productos) {
        super(context,0, productos);

        listaProducto = new ArrayList<>();
        listaProducto = productos;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_producto,parent,false);

        }

        ImageView imagen = convertView.findViewById(R.id.img_producto);
        TextView nombre = convertView.findViewById(R.id.textViewNombreProducto);
        TextView descripcion = convertView.findViewById(R.id.textDescripcion);
        TextView precio = convertView.findViewById(R.id.textViewPrecio);
        TextView disponibilidad = convertView.findViewById(R.id.textViewDisponibilidad);
//        CheckBox agregarNoAgregar = convertView.findViewById(R.id.checkBox_producto);
//
        final Producto producto = listaProducto.get(position);
        imagen.setImageResource(producto.getImagen());
        nombre.setText(producto.getNombre());
        descripcion.setText(producto.getDescripcion());
        precio.setText(producto.getPrecio());
        disponibilidad.setText(producto.getEstado());


        //        if(agregarNoAgregar.isChecked()){
//            producto.setSeleccionado(true);
//        }

//        agregarNoAgregar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                producto.setSeleccionado(isChecked);
//                select = isChecked;
//            }
//        });


        return convertView;


    }


    public  boolean getSelect(){
        return select;
    }


}
