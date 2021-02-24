package com.openlocator.supermarketv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IniciarSesionActivity extends AppCompatActivity {

    private Button iniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        iniciarSesion = findViewById(R.id.btn_okIniciarSession);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IniciarSesionActivity.this, RecyclerViewActivity.class));
            }
        });


    }



}
