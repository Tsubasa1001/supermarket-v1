package com.openlocator.supermarketv1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.openlocator.supermarketv1.modelos.Categoria;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {


    private List<Categoria> categorias;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        rv = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        inicialDatos();
        iniciarAdaptador();

    }


    private void inicialDatos(){
        categorias = new ArrayList<>();
        categorias.add(new Categoria("Carnes/Embutidos","Carnes variadas y embutidos variados",R.drawable.categoria_carnes_embutidos));
        categorias.add(new Categoria("Hogar","Artefactos para el hogar",R.drawable.categoria_hogar));
        categorias.add(new Categoria("Cereales","Cereales para toda ocasion",R.drawable.categoria_cereales));
        categorias.add(new Categoria("Deportes","Artefactos para todo tipo de deporte",R.drawable.categoria_deportes));
        categorias.add(new Categoria("Electronicos","Diferentes dispositivos electronicos",R.drawable.categoria_electronicos));
        categorias.add(new Categoria("Promociones","Las mejores promociones",R.drawable.categoria_promociones));
        categorias.add(new Categoria("Lacteos","Todo tipo de lacteos",R.drawable.categoria_lacteos));
    }

    private void iniciarAdaptador(){
        CategoriaAdapter adapter = new CategoriaAdapter(categorias,this);
        rv.setAdapter(adapter);

    }
}
