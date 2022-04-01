package br.com.senai.model;

public class Livro {
    private  int id;
    private String nome;
    private Autor autor;
    private String editora;



    public Livro(int id,String nome, Autor autor, String editora){
        this.id = id;
        this.autor = autor;
        this.editora = editora;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String lista(){
        return "Livro: " +
                "\nNome: " + nome +
                "\n" + autor +
                "\nEditora: " + editora +
                "\nId: " + id + "\n";
    }



}
