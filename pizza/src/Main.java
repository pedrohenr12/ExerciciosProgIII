import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaBuilder builder = new PizzaBuilder();

        System.out.print("Escolha a massa da pizza (Fina, Grossa, Integral): ");
        String massa = scanner.nextLine();
        builder.setMassa(massa);

        System.out.print("Escolha o tamanho da pizza (Pequena, Média, Grande): ");
        String tamanho = scanner.nextLine();
        builder.setTamanho(tamanho);

        System.out.print("Quantos ingredientes você deseja adicionar? ");
        int numIngredientes = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        for (int i = 0; i < numIngredientes; i++) {
            System.out.print("Digite o ingrediente " + (i + 1) + ": ");
            String ingrediente = scanner.nextLine();
            builder.addIngrediente(ingrediente);
        }

        Pizza pizza = builder.build();
        System.out.println("\n   PIZZA! " + pizza);

        scanner.close();
    }
}
