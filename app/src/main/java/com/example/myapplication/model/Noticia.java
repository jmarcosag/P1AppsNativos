package com.example.myapplication.model;

public class Noticia {

    private Integer codigo;
    private int foto;
    private String titulo;
    private String introducao;
    private String conteudo;
    private String horario;

    public Noticia(Integer codigo, int foto, String titulo, String introducao, String conteudo, String horario) {
        this.codigo = codigo;
        this.foto = foto;
        this.titulo = titulo;
        this.introducao = introducao;
        this.conteudo = conteudo;
        this.horario = horario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
