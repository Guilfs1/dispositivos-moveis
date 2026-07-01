package com.example.imcduas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText campoPeso;
    EditText campoAltura;
    Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPeso = findViewById(R.id.campoPeso);
        campoAltura = findViewById(R.id.campoAltura);
        botaoCalcular = findViewById(R.id.botaoCalcular);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPeso = campoPeso.getText().toString();
                String textoAltura = campoAltura.getText().toString();

                if (textoPeso.equals("") || textoAltura.equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha peso e altura", Toast.LENGTH_SHORT).show();
                    return;
                }

                double peso = Double.parseDouble(textoPeso);
                double altura = Double.parseDouble(textoAltura);

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("peso", peso);
                bundle.putDouble("altura", altura);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
