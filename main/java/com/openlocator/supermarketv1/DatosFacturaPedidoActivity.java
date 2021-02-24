package com.openlocator.supermarketv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DatosFacturaPedidoActivity extends AppCompatActivity {

    private Button btn_enviarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_factura_pedido);

        btn_enviarPedido = findViewById(R.id.btn_enviarPedido);

        btn_enviarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Pedido enviado correctamente",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
