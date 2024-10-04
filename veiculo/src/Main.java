import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoBuilder builder = new VeiculoBuilder();

        System.out.print("Escolha o tipo de veículo (Carro, Moto): ");
        String tipo = scanner.nextLine();
        builder.setTipo(tipo);

        System.out.print("Escolha a cor do veículo: ");
        String cor = scanner.nextLine();
        builder.setCor(cor);

        System.out.print("Quantas rodas o veículo tem? ");
        int rodas = scanner.nextInt();
        builder.setRodas(rodas);

        Veiculo veiculo = builder.build();
        System.out.println("\nVeículo: \n" + veiculo);

        scanner.close();
    }
}
