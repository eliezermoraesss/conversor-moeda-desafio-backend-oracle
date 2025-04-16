import service.CurrencyConverter;

import java.io.IOException;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        int opcao;

        try {
            while (true) {
                System.out.println("****************************************");
                System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
                System.out.println("1) Dólar => Peso argentino");
                System.out.println("2) Peso argentino => Dólar");
                System.out.println("3) Dólar => Real brasileiro");
                System.out.println("4) Real brasileiro => Dólar");
                System.out.println("5) Dólar => Peso colombiano");
                System.out.println("6) Peso colombiano => Dólar");
                System.out.println("7) Sair");
                System.out.println("Escolha uma opção válida:");
                System.out.println("****************************************");

                opcao = leitura.nextInt();
                if (opcao == 7) {
                    System.out.println("Saindo...");
                    break;
                }

                System.out.println("Digite o valor que deseja converter:");
                double valor = leitura.nextDouble();

                String base = "", target = "";
                switch (opcao) {
                    case 1 -> {
                        base = "USD";
                        target = "ARS";
                    }
                    case 2 -> {
                        base = "ARS";
                        target = "USD";
                    }
                    case 3 -> {
                        base = "USD";
                        target = "BRL";
                    }
                    case 4 -> {
                        base = "BRL";
                        target = "USD";
                    }
                    case 5 -> {
                        base = "USD";
                        target = "COP";
                    }
                    case 6 -> {
                        base = "COP";
                        target = "USD";
                    }
                    default -> {
                        System.out.println("Opção inválida.");
                        continue;
                    }
                }

                double result = converter.convert(base, target, valor);
                System.out.printf("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                        valor, base, result, target);
            }

            leitura.close();
        } catch (Exception e) {

        }
    }
}
