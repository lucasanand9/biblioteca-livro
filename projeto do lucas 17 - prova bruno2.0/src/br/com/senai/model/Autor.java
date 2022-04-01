package br.com.senai.model;

public class Autor extends Pessoa {
    private int id;
    public Autor(String nome, Endereco endereco,int id){
        super(nome, endereco);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Autor: " +
                "\n   nome: "+ getNome() +
                "\n" + super.getEndereco().imprimir() +
                "\n   id: " + id;
    }
}
