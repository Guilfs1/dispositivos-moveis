package com.example.imcduas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView textoResultado;
    ImageView imagemPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textoResultado = findViewById(R.id.textoResultado);
        imagemPerfil = findViewById(R.id.imagemPerfil);

        Bundle bundle = getIntent().getExtras();
        double peso = bundle.getDouble("peso");
        double altura = bundle.getDouble("altura");

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
}
