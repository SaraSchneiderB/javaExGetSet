package Livro;

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private double valor;

    //construtor = identifica
    public Livro(String t, String a, String e, double v) {
        this.titulo = t;
        this.autor = a;
        this.editora = e;
        this.valor = v;
    }

    //Método get = puxa
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public double getValor() {
        return valor;
    }

    //Método set = inclui
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public void setEditora(String e) {
        this.editora = e;
    }

    public void setValor(double v) {
        this.valor = v;
    }
}
