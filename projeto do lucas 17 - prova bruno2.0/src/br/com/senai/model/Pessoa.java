package br.com.senai.model;

public abstract class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(){
    }

    public Pessoa(String nome, Endereco endereco){
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String imprimir() {
        return "Pessoa: " +
                "\nnome: " + nome  +
                "\n" + imprimir();
    }
}
