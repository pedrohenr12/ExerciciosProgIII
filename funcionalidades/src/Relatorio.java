public class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    public Relatorio(String titulo, String corpo, String rodape) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        sb.append(corpo).append("\n");
        if (rodape != null && !rodape.isEmpty()) {
            sb.append(rodape).append("\n");
        }
        return sb.toString();
    }
}

