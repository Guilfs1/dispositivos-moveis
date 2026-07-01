package com.example.listagem;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaViagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaViagens = findViewById(R.id.listaViagens);

        ArrayList<String> titulos = new ArrayList<>();
        ArrayList<String> subtitulos = new ArrayList<>();

        titulos.add("Sao Paulo");
        subtitulos.add("Brasil");

        titulos.add("Rio de Janeiro");
        subtitulos.add("Brasil");

        titulos.add("Paris");
        subtitulos.add("Franca");

        titulos.add("Toquio");
        subtitulos.add("Japao");

        MeuAdapter adapter = new MeuAdapter(this, titulos, subtitulos);
        listaViagens.setAdapter(adapter);
    }
}
