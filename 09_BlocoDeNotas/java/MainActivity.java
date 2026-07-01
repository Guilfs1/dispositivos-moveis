package com.example.notas;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText campoNota;
    Button botaoSalvar;
    Button botaoLimpar;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNota = findViewById(R.id.campoNota);
        botaoSalvar = findViewById(R.id.botaoSalvar);
        botaoLimpar = findViewById(R.id.botaoLimpar);

        preferences = getSharedPreferences("minhasNotas", MODE_PRIVATE);

        String notaSalva = preferences.getString("nota", "");
        campoNota.setText(notaSalva);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = campoNota.getText().toString();
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("nota", texto);
                editor.apply();
                Toast.makeText(MainActivity.this, "Nota salva", Toast.LENGTH_SHORT).show();
            }
        });

        botaoLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campoNota.setText("");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("nota", "");
                editor.apply();
                Toast.makeText(MainActivity.this, "Nota apagada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
