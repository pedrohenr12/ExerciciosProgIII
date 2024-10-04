public class PizzaBuilder {
    private String massa;
    private String tamanho;
    private StringBuilder ingredientes;

    public PizzaBuilder() {
        ingredientes = new StringBuilder();
    }

    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder addIngrediente(String ingrediente) {
        if (ingredientes.length() > 0) {
            ingredientes.append(", ");
        }
        ingredientes.append(ingrediente);
        return this;
    }

    public Pizza build() {
        return new Pizza(massa, tamanho, ingredientes.toString());
    }
}
