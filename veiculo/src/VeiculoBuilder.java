public class VeiculoBuilder {
    private String tipo;
    private String cor;
    private int rodas;

    public VeiculoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public VeiculoBuilder setRodas(int quantidade) {
        this.rodas = quantidade;
        return this;
    }

    public Veiculo build() {
        return new Veiculo(tipo, cor, rodas);
    }
}
