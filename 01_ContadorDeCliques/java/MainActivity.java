package com.example.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int contador = 0;
    TextView textoContador;
    Button botaoClique;
    Button botaoZerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoContador = findViewById(R.id.textoContador);
        botaoClique = findViewById(R.id.botaoClique);
        botaoZerar = findViewById(R.id.botaoZerar);

        botaoClique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = contador + 1;
                textoContador.setText(String.valueOf(contador));
            }
        });

        botaoZerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = 0;
                textoContador.setText("0");
            }
        });
    }
}
