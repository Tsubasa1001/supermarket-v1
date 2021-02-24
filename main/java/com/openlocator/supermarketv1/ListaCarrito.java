package com.openlocator.supermarketv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.openlocator.supermarketv1.modelos.Carrito;

import java.util.ArrayList;

public class ListaCarrito extends AppCompatActivity {

    private ListView lvCarrito;
    private CarritoAdapter adapter;
    private ArrayList<Carrito> listaListaCarrito;
    private Carrito listaCarrito;

    private Button btn_emitirCompra;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        lvCarrito = findViewById(R.id.lv_carrito);
        btn_emitirCompra = findViewById(R.id.btn_emitirCompra);


        btn_emitirCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaCarrito.this, DatosFacturaPedidoActivity.class));
            }
        });

        listaListaCarrito = new ArrayList<>();


            listaListaCarrito.add(new Carrito("Licuadora", "Disponible", "50$"));
            listaListaCarrito.add(new Carrito("Auricuares b","Disponible","135bs"));
            listaListaCarrito.add(new Carrito("Alitas de pollo -50%","Disponible","12,99$"));

            adapter = new CarritoAdapter(this, listaListaCarrito);
            lvCarrito.setAdapter(adapter);

        }






}
