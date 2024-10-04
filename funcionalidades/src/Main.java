import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RelatorioBuilder builder = new RelatorioBuilder();

        System.out.print("Digite o título do relatório: ");
        String titulo = scanner.nextLine();
        builder.setTitulo(titulo);

        System.out.print("Digite o corpo do relatório: ");
        String corpo = scanner.nextLine();
        builder.setCorpo(corpo);

        System.out.print("Deseja adicionar um rodapé? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o rodapé do relatório: ");
            String rodape = scanner.nextLine();
            builder.setRodape(rodape);
        }

        Relatorio relatorio = builder.build();
        System.out.println("\nRelatório:\n" + relatorio);

        scanner.close();
    }
}
