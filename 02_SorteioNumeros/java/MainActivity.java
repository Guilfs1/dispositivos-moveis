package com.example.sorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText campoMinimo;
    EditText campoMaximo;
    Button botaoSortear;
    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoMinimo = findViewById(R.id.campoMinimo);
        campoMaximo = findViewById(R.id.campoMaximo);
        botaoSortear = findViewById(R.id.botaoSortear);
        textoResultado = findViewById(R.id.textoResultado);

        botaoSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoMin = campoMinimo.getText().toString();
                String textoMax = campoMaximo.getText().toString();

                if (textoMin.equals("") || textoMax.equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha os dois campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                int min = Integer.parseInt(textoMin);
                int max = Integer.parseInt(textoMax);

                if (min > max) {
                    Toast.makeText(MainActivity.this, "O minimo deve ser menor que o maximo", Toast.LENGTH_SHORT).show();
                    return;
                }

                Random random = new Random();
                int sorteado = random.nextInt(max - min + 1) + min;
                textoResultado.setText("Resultado: " + sorteado);
            }
        });
    }
}
