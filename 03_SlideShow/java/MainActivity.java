package com.example.slideshow;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    Button botaoAnterior;
    Button botaoProximo;

    int[] imagens = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};
    int posicao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imagem);
        botaoAnterior = findViewById(R.id.botaoAnterior);
        botaoProximo = findViewById(R.id.botaoProximo);

        botaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                posicao = posicao + 1;
                if (posicao >= imagens.length) {
                    posicao = 0;
                }
                imagem.setImageResource(imagens[posicao]);
            }
        });

        botaoAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                posicao = posicao - 1;
                if (posicao < 0) {
                    posicao = imagens.length - 1;
                }
                imagem.setImageResource(imagens[posicao]);
            }
        });
    }
}
