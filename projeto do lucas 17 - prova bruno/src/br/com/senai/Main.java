package br.com.senai;

import br.com.senai.model.Biblioteca;
import br.com.senai.model.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca(1, "Biblioteca do Senai");
        Biblioteca biblioteca2 = new Biblioteca(2, "Biblioteca publica de Santa Catarina");

        ArrayList<Livro> livrosDaBiblio1 = new ArrayList<>();
        livrosDaBiblio1.add(new Livro(1, "harry potter e a pedra filosofal","J.K. Rowling", "Rocco"));
        livrosDaBiblio1.add(new Livro(2, "harry potter e a camera secreta","J.K. Rowling", "Rocco"));
        livrosDaBiblio1.add(new Livro(3, "harry potter e o prisioneiro de azkaban","J.K. Rowling", "Rocco"));
        livrosDaBiblio1.add(new Livro(4, "harry potter e o calice de fogo","J.K. Rowling", "Rocco"));
        livrosDaBiblio1.add(new Livro(5, "harry potter e a ordem da fênix","J.K. Rowling", "Rocco"));

        biblioteca1.setLivros(livrosDaBiblio1);
        System.out.println(biblioteca1.lista());

        ArrayList<Livro> livrosDaBiblio2 = new ArrayList<>();
        livrosDaBiblio2.add(new Livro(6, "Percy Jackson e o Ladrão de Raios","Rick Riordan", "Intrínseca"));
        livrosDaBiblio2.add(new Livro(7, "Percy Jackson e o mar de monstros","Rick Riordan", "Intrínseca"));
        livrosDaBiblio2.add(new Livro(8, "Percy Jackson e a maldiçao do titã","Rick Riordan", "Intrínseca"));
        livrosDaBiblio2.add(new Livro(9, "Percy Jackson e a batalha do labirinto","Rick Riordan", "Intrínseca"));
        livrosDaBiblio2.add(new Livro(10, "Percy Jackson e o último olimpiano","Rick Riordan", "Intrínseca"));

        biblioteca2.setLivros(livrosDaBiblio2);
        System.out.println(biblioteca2.lista());


    }


}
