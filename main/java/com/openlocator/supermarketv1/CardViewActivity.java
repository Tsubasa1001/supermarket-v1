package com.openlocator.supermarketv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewActivity extends AppCompatActivity {

    private ImageView imagen;
    private TextView nombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_categoria);
        imagen = findViewById(R.id.imgViewItem);
        nombre = findViewById(R.id.txtViewCategoria);

        nombre.setText("Alimentos");

    }


}
