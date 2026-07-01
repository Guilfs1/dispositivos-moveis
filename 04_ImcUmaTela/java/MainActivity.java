package com.example.imcuma;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText campoPeso;
    EditText campoAltura;
    Button botaoCalcular;
    TextView textoResultado;
    ImageView imagemPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPeso = findViewById(R.id.campoPeso);
        campoAltura = findViewById(R.id.campoAltura);
        botaoCalcular = findViewById(R.id.botaoCalcular);
        textoResultado = findViewById(R.id.textoResultado);
        imagemPerfil = findViewById(R.id.imagemPerfil);

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
                double imc = peso / (altura * altura);

                String perfil;
                if (imc < 18.5) {
                    perfil = "Abaixo do peso";
                    imagemPerfil.setImageResource(R.drawable.abaixo);
                } else if (imc < 25) {
                    perfil = "Peso normal";
                    imagemPerfil.setImageResource(R.drawable.normal);
                } else if (imc < 30) {
                    perfil = "Sobrepeso";
                    imagemPerfil.setImageResource(R.drawable.sobrepeso);
                } else {
                    perfil = "Obesidade";
                    imagemPerfil.setImageResource(R.drawable.obesidade);
                }

                textoResultado.setText("IMC: " + String.format("%.2f", imc) + "\n" + perfil);
            }
        });
    }
}
