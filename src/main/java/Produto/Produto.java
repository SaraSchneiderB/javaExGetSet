/*
Crie uma instância da classe citada em cada um (utilizando seus atributos)
e use os métodos get, set e constructor para manipular os dados.
 */
package Produto;

public class Produto {

    private String nome;
    //  private int quantidade;
    private double valorUn;

    //construtor
    public Produto(String nome, double valorUn) {
        this.nome = nome;
        this.valorUn = valorUn;
    }

    //Método Get
    public String getnome() {
        return nome;
    }

    public double getvalorUn() {
        return valorUn;
    }

    //Método Set
    public void setnome() {
        this.nome = nome;
    }

    public void setvalorUn() {
        this.valorUn = valorUn;
    }
}
