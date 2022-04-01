package br.com.senai.model;

public class Endereco {
    private String nomerua;
    private String cep;
    private int numero;
    private int id;

    public Endereco(){}
    public Endereco(String nomerua, String cep, int numero, int id){
        this.nomerua = nomerua;
        this.id = id;
        this.numero = numero;
        this.cep = cep;
    }

    public String getNomerua() {
        return nomerua;
    }

    public void setNomerua(String nomerua) {
        this.nomerua = nomerua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String imprimir() {
        return "   Endereco: " +
                "\n     Nome da Rua: " + nomerua +
                "\n     CEP: " + cep +
                "\n     Numero; " + numero +
                "\n     id: " + id;
    }
}
