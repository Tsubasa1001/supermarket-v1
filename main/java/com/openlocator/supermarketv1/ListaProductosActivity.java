package com.openlocator.supermarketv1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.openlocator.supermarketv1.modelos.Carrito;
import com.openlocator.supermarketv1.modelos.Categoria;
import com.openlocator.supermarketv1.modelos.Producto;

import java.util.ArrayList;


public class ListaProductosActivity extends AppCompatActivity {

    private ListView lvProductos;
    private ProductoAdapter adapter;
    private ArrayList<Producto> listaProductos;
    private Categoria categoria;
    private String nombreCategoria;


    private Button btn_añadirCarrito;
    private Button btn_irACarrito;
    // private final View.OnClickListener onClickListener;

//    public ListaProductosActivity(View.OnClickListener onClickListener) {
//        this.onClickListener = onClickListener;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        btn_añadirCarrito = findViewById(R.id.btn_añadir_carrito);
        btn_irACarrito = findViewById(R.id.btn_ir_carrito);
        lvProductos = findViewById(R.id.lv_productos);
        listaProductos = new ArrayList<>();

        btn_añadirCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Productos añadidos", Toast.LENGTH_LONG).show();
            }
        });


        btn_irACarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaProductosActivity.this, ListaCarrito.class));
            }
        });


        //categoria = new Categoria("Hogar", "productos del hogar",0);

        nombreCategoria = getIntent().getStringExtra("categoria");

        if (nombreCategoria.equals("Hogar")) {
            listaProductos.add(new Producto("Licuadora", R.drawable.licuadora, "Licuadora Roja", "Disponible", "50$"));
            listaProductos.add(new Producto("Lavadora", R.drawable.lavadora, "Lavadora 10kgr", "Vendido", "200$"));
            listaProductos.add(new Producto("Sillon", R.drawable.sillon, "Sillon rojo + taburete", "Disponible", "3500$"));
            listaProductos.add(new Producto("Juego mesa y sillas", R.drawable.juego_mesa_sillas, "Juego de mesa con sillas para cocina", "Disponible", "2659$"));

            adapter = new ProductoAdapter(this, listaProductos);
            lvProductos.setAdapter(adapter);
            lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    System.out.println(position);
                }
            });
        } else {
            if (nombreCategoria.equals("Deportes")) {
                listaProductos.add(new Producto("Camiseta", R.drawable.camiseta_futbol, "Camiseta amarilla nike", "Disponible", "30$"));
                listaProductos.add(new Producto("Chuteras", R.drawable.chuteras, "Chuteras marca nike", "Vendido", "50bs"));
                listaProductos.add(new Producto("Pelota de futbol", R.drawable.pelotafutbol, "Pelota de futbol marca nike", "Disponible", "50bs"));
                listaProductos.add(new Producto("Raqueta", R.drawable.raqueta, "Raqueta color negro con anaranjado", "Disponible", "70bs"));

                adapter = new ProductoAdapter(this, listaProductos);
                lvProductos.setAdapter(adapter);
            } else {
                if (nombreCategoria.equals("Carnes/Embutidos")) {
                    listaProductos.add(new Producto("Jamon", R.drawable.jamon, "jamon sofia", "Disponible", "20bs"));
                    listaProductos.add(new Producto("Alitas de pollo", R.drawable.categoria_carnes_embutidos, "Alitas de pollo", "Vendido", "25bs"));

                    adapter = new ProductoAdapter(this, listaProductos);
                    lvProductos.setAdapter(adapter);

                } else {
                    if (nombreCategoria.equals("Cereales")) {
                        listaProductos.add(new Producto("Choco KRISPIS", R.drawable.cereal1, "cereal de kris", "Disponible", "20bs"));
                        listaProductos.add(new Producto("Zucaritas", R.drawable.cereal3, "cereal de kellogg's", "Vendido", "35bs"));

                        adapter = new ProductoAdapter(this, listaProductos);
                        lvProductos.setAdapter(adapter);
                    } else {
                        if (nombreCategoria.equals("Electronicos")) {
                            listaProductos.add(new Producto("Auriculares L", R.drawable.auriculares, "Auriculares negros", "vendido", "120bs"));
                            listaProductos.add(new Producto("Auriclares b", R.drawable.auriculares2, "Auriculares wireless violetas", "Disponible", "135bs"));
                            listaProductos.add(new Producto("Camara Lumix", R.drawable.camara, "Camara color negro lumix", "Disponible", "325bs"));

                            adapter = new ProductoAdapter(this, listaProductos);
                            lvProductos.setAdapter(adapter);
                        } else {
                            if (nombreCategoria.equals("Lacteos")) {
                                listaProductos.add(new Producto("Leche natural", R.drawable.lacteo1, "Leche natural PIL", "Disponible", "10s"));
                                listaProductos.add(new Producto("Crema de leche", R.drawable.lacteo2, "Crema leche PIL", "Disponible", "12bs"));
                                listaProductos.add(new Producto("Queso chedar", R.drawable.lacteo_queso, "Camara color negro lumix", "Disponible", "25bs"));

                                adapter = new ProductoAdapter(this, listaProductos);
                                lvProductos.setAdapter(adapter);

                            }else{
                                listaProductos.add(new Producto("-50%", R.drawable.carnes_promo, "alitas de pollo -50%", "Disponible", "12,99bs"));
                                listaProductos.add(new Producto("2x1", R.drawable.promocion1_2x1, "Jamon marca sofia", "Disponible", "20bs"));
                                listaProductos.add(new Producto("-20%", R.drawable.raqueta_20, "Raqueta W -20%", "Disponible", "57,99bs"));

                                adapter = new ProductoAdapter(this, listaProductos);
                                lvProductos.setAdapter(adapter);


                            }
                        }
                    }
                }
            }


        }



    }
    public void setNombreCategoria () {
    }
}
