package com.example.myapplication.controller;

import androidx.annotation.Nullable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.model.Noticia;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        List<Noticia> noticiaList = new ArrayList<>();
        noticiaList.add(new Noticia(1, "Esse conteúdo é o primeiro teste", "Primeiro resumo", "Esse conteúdo é o primeiro teste", "2022/09/20 10:00:00"));
        noticiaList.add(new Noticia(2, "Esse conteúdo é o segundo teste", "Segundo resumo", "Esse conteúdo é o segundo teste", "2022/09/19 10:00:00"));
        noticiaList.add(new Noticia(3, "Esse conteúdo é o terceiro teste", "Terceiro resumo", "Esse conteúdo é o terceiro teste", "2022/09/18 10:00:00"));

        NoticiaListViewAdapter adapter = new NoticiaListViewAdapter(noticiaList);

        ListView listViewNoticia = findViewById(R.id.list_view_noticia);
        listViewNoticia.setAdapter(adapter);

        //listViewNoticia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //
        //    }
        //});

    }
}