package br.com.senai.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Biblioteca {
    private int id;
    private String nome;
    private Endereco endereco;
    private ArrayList<Livro> livros;


    public Biblioteca(int id,String nome, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;

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
        "\n" + endereco.imprimir() +
        "\n\n";
        for (int i = 0; i < livros.size();i++){
            saida += livros.get(i).lista() + "\n";
            //saida += livros.get(i).getNome() + "; Editora: "+ livros.get(i).getAutor() + "\n";
        }
        return saida;
    }

    Random aleatorio = new Random();
    public String livroA(){
        String livroA = "Está em duvida em qual livro ler? leia: " + livros.get(aleatorio.nextInt(5)).getNome() + "\n";
        return livroA;
    }


    public void livrosautor(Autor autor){
        System.out.println("Livros Da(o) " + autor.getNome() + ", livros: ");
        for (int i = 0; i < livros.size(); i++){
            if(livros.get(i).getAutor() == autor)
                System.out.println(livros.get(i).getNome());
            else
                System.out.println("-Não ha livros desse autor(a) nessa biblioteca-");

        }
    }





  /*  public String mesmoautor(String autor){
        String livrosI = "livros do " + autor + ": ";
        for (int i = 0; i < livros.size(); i++) {
            if (autor.equals(livros.get(i).getAutor())) {
                livrosI += "\n" + livros.get(i).getNome();
            }else{
                livrosI += "erro ";
            }
        }
        return livrosI;
    }*/


}
