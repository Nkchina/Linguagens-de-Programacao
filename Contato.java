package br.com.newton.agenda;

public class Contato {
    private final String nome;
    private final String numero;
    private final String ddd;

    public Contato(String nome, String numero, String ddd) {
        this.nome = nome;
        this.numero = numero;
        this.ddd = ddd;

    }

    public String getNome(){
        return nome;
    }
    public String getNumero(){
        return numero;
    }
    public String getDdd(){
        return ddd;
    }

}
