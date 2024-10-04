public class Pizza {
    private String massa;
    private String tamanho;
    private String ingredientes;

    public Pizza(String massa, String tamanho, String ingredientes) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "\n" + "Massa: " + massa + "\n" +
                "Tamanho: " + tamanho + "\n" +
                "Ingredientes: " + ingredientes;
    }
}
