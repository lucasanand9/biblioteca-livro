package br.com.senai.model;

import java.util.ArrayList;

public class Biblioteca {
    private int id;
    private String nome;

    private ArrayList<Livro> livros;


    public Biblioteca(int id,String nome){
        this.id = id;
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

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String lista(){
        String saida = "biblioteca: " + id +
        "\nNome: " + nome+
        "\n\n";
        for (int i = 0; i < livros.size();i++){
            saida += livros.get(i).lista() + "\n";
            //saida += livros.get(i).getNome() + "; Editora: "+ livros.get(i).getAutor() + "\n";
        }
        return saida;
    }

}
