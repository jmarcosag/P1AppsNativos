package com.example.myapplication.controller;

import androidx.annotation.Nullable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.model.Noticia;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    ListView btnNoticia;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        btnNoticia = findViewById(R.id.listView);
        btnNoticia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, NoticiaActivity.class);
                startActivity(intent);
            }
        });

        List<Noticia> noticiaList = new ArrayList<>();

        noticiaList.add(new Noticia(1, R.drawable.icone,"Esse titulo é o primeiro teste", "Primeiro resumo", "Esse conteúdo é o primeiro teste", "20/09/2022 10:00:00"));
        noticiaList.add(new Noticia(2, R.drawable.icone,"Esse titulo é o segundo teste", "Segundo resumo", "Esse conteúdo é o segundo teste", "19/09/19 2022:00:00"));
        noticiaList.add(new Noticia(3, R.drawable.icone,"Esse titulo é o terceiro teste", "Terceiro resumo", "Esse conteúdo é o terceiro teste", "18/09/2022 10:00:00"));

        NoticiaListViewAdapter adapter = new NoticiaListViewAdapter(noticiaList);

        ListView listViewNoticia = findViewById(R.id.listView);
        listViewNoticia.setAdapter(adapter);


    }
}