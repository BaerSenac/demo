package com.sp.senac.br.demo.model;

public class RepositorioEntity {
    private int  id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String url;
    private String nome;
    private String descricao;
    private String linguagens;

    public String getUrl() {                                        //alt + insert (getter and setter)
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    @Override
    public String toString() {
        return "RepositorioEntity{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", linguagens='" + linguagens + '\'' +
                '}';
    }
}
