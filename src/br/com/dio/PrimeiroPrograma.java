package br.com.dio;

import model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
    gato gato = new gato();

        System.out.println(gato);

        livro livro1 = new livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    /*public static void main(String[] args) {
    int a = 5;
    int b = 3;
        System.out.println("hello world " + (a+b));*/
     }
}

class livro{
    private String nome;
    private Integer numPagigas;

    public livro(String nome, Integer numPagigas) {
        this.nome = nome;
        this.numPagigas = numPagigas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagigas() {
        return numPagigas;
    }

    public void setNumPagigas(Integer numPagigas) {
        this.numPagigas = numPagigas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPagigas=" + numPagigas +
                '}';
    }
}

