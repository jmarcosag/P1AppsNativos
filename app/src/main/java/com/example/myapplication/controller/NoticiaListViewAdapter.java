package com.example.myapplication.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.model.Noticia;

import java.util.List;

public class NoticiaListViewAdapter extends BaseAdapter {

    private List<Noticia> cardNoticiaList;

    public NoticiaListViewAdapter(List<Noticia> cardNoticiaList) {
        this.cardNoticiaList = cardNoticiaList;
    }

    @Override
    public int getCount() {
        return this.cardNoticiaList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.cardNoticiaList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.cardNoticiaList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.noticia_item, viewGroup, false);
        }

        Noticia cardNoticia = (Noticia) getItem(i);
        ImageView imageViewIcone = view.findViewById(R.id.item_imagem);
        imageViewIcone.setImageResource(cardNoticia.getFoto());
        TextView textViewTitulo = view.findViewById(R.id.item_titulo);
        textViewTitulo.setText(cardNoticia.getTitulo());
        TextView textViewResumo = view.findViewById(R.id.item_descricao);
        textViewResumo.setText(cardNoticia.getIntroducao());
        TextView textViewHora = view.findViewById(R.id.item_hora);
        textViewHora.setText(cardNoticia.getHorario());

        return view;
    }
}
