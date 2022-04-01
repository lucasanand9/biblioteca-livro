package br.com.senai;

import br.com.senai.model.Autor;
import br.com.senai.model.Biblioteca;
import br.com.senai.model.Endereco;
import br.com.senai.model.Livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("J.K. Rowling", new Endereco("Rua XYZ", "88025-500", 123, 1),1);
        Autor autor2 = new Autor("Rick Riordan", new Endereco("Rua ABC", "45453-696", 1234, 2),2);

        Biblioteca biblioteca1 = new Biblioteca(1, "Biblioteca do Senai",new Endereco("Rua HIJ", "12312-666", 12345, 3));
        Biblioteca biblioteca2 = new Biblioteca(2, "Biblioteca publica de Santa Catarina",new Endereco("Rua EFG", "88058-020", 123456, 4));

        ArrayList<Livro> livrosDaBiblio1 = new ArrayList<>();
        livrosDaBiblio1.add(new Livro(1, "harry potter e a pedra filosofal",autor1, "Rocco"));
        livrosDaBiblio1.add(new Livro(2, "harry potter e a camera secreta",autor1, "Rocco"));
        livrosDaBiblio1.add(new Livro(3, "harry potter e o prisioneiro de azkaban",autor1, "Rocco"));
        livrosDaBiblio1.add(new Livro(4, "harry potter e o calice de fogo",autor1, "Rocco"));
        livrosDaBiblio1.add(new Livro(5, "harry potter e a ordem da fênix",autor1, "Rocco"));

        biblioteca1.setLivros(livrosDaBiblio1);
        System.out.println(biblioteca1.lista());

        ArrayList<Livro> livrosDaBiblio2 = new ArrayList<>();
        livrosDaBiblio2.add(new Livro(6, "Percy Jackson e o Ladrão de Raios",autor2, "Intrínseca"));
        livrosDaBiblio2.add(new Livro(7, "Percy Jackson e o mar de monstros",autor2, "Intrínseca"));
        livrosDaBiblio2.add(new Livro(8, "Percy Jackson e a maldiçao do titã",autor2, "Intrínseca"));
        livrosDaBiblio2.add(new Livro(9, "Percy Jackson e a batalha do labirinto",autor2, "Intrínseca"));
        livrosDaBiblio2.add(new Livro(10, "Percy Jackson e o último olimpiano",autor2, "Intrínseca"));

        biblioteca2.setLivros(livrosDaBiblio2);
        System.out.println(biblioteca2.lista());

        //bonus de 1 de abril
        System.out.println("Biblioteca 1: " + biblioteca1.livroA());
        System.out.println("Biblioteca 2: " + biblioteca2.livroA());

        biblioteca1.livrosautor(autor1);
        biblioteca2.livrosautor(autor2);

    }


}
