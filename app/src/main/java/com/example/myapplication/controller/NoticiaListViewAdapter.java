package com.example.myapplication.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Noticia;

import java.util.List;

public class NoticiaListViewAdapter extends BaseAdapter {

    private List<Noticia> noticiaList;

    public NoticiaListViewAdapter(List<Noticia> noticiaList) {
        this.noticiaList = noticiaList;
    }

    @Override
    public int getCount() {
        return this.noticiaList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.noticiaList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.noticiaList.get(i).getCodigo();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.noticia_item, viewGroup, false);
        }

        Noticia noticiaItem = (Noticia) getItem(i);
        TextView textViewNome = view.findViewById(R.id.textViewNome);
        textViewNome.setText(noticiaItem.getTitulo());
        return view;
    }
}
