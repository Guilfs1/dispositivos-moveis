package com.example.listagem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MeuAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> titulos;
    ArrayList<String> subtitulos;

    public MeuAdapter(Context context, ArrayList<String> titulos, ArrayList<String> subtitulos) {
        this.context = context;
        this.titulos = titulos;
        this.subtitulos = subtitulos;
    }

    @Override
    public int getCount() {
        return titulos.size();
    }

    @Override
    public Object getItem(int position) {
        return titulos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false);

        TextView textoTitulo = view.findViewById(R.id.textoTitulo);
        TextView textoSubtitulo = view.findViewById(R.id.textoSubtitulo);

        textoTitulo.setText(titulos.get(position));
        textoSubtitulo.setText(subtitulos.get(position));

        return view;
    }
}
