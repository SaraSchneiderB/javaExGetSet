package Estudante;

public class Estudante {

    private String nome;
    private String curso;
    private int matricula;

    //construtor
    public Estudante(String n, String c, int m) {
        this.nome = n;
        this.curso = c;
        this.matricula = m;
    }

    //Método get
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }

    //Método set
    public void setNome(String n) {
        this.nome = n;
    }

    public void setCurso(String c) {
        this.curso = c;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }
}
