package ABNT;

public class Abnt {

    private String titulo;
    private String autores;
    private String editora;
    private int anoPublicacao;
    private int numPaginas;

    public Abnt(String titulo, String autores, String editora, int anoPublicacao, int numPaginas) {
        this.titulo = titulo;
        this.autores = formatarNomeAutor(autores);
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String formatarNomeAutor(String nomeCompleto) {
        String[] partesNome = nomeCompleto.split(" ");
        return partesNome[1] + "," + partesNome[0];
    }

    public String formatarABNT() {
        StringBuilder sb = new StringBuilder();

        String[] autoresArray = autores.split(",");
        StringBuilder autoresFormatados = new StringBuilder();

        sb.append(autores).append(". ");
        sb.append(titulo).append(". Ed.");
        sb.append(editora).append(", ");
        sb.append(anoPublicacao).append(". p.");
        sb.append(numPaginas).append(" .");

        return sb.toString();
    }
}
