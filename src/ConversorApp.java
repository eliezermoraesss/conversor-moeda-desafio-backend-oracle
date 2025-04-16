import service.CurrencyConverter;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        int opcao;

        while (true) {
            try {
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
                System.out.println();

                if (!leitura.hasNextInt()) {
                    System.out.println("❌ Por favor, digite uma opção válida (1-7).");
                    leitura.next(); // limpa o input inválido
                    System.out.println();
                    continue;
                }

                opcao = leitura.nextInt();

                if (opcao == 7) {
                    System.out.println("Saindo...");
                    break;
                }

                String base = "", target = "";
                switch (opcao) {
                    case 1 -> { base = "USD"; target = "ARS"; }
                    case 2 -> { base = "ARS"; target = "USD"; }
                    case 3 -> { base = "USD"; target = "BRL"; }
                    case 4 -> { base = "BRL"; target = "USD"; }
                    case 5 -> { base = "USD"; target = "COP"; }
                    case 6 -> { base = "COP"; target = "USD"; }
                    default -> {
                        System.out.println("❌ Opção inválida. Tente novamente.");
                        continue;
                    }
                }

                System.out.println("Digite o valor que deseja converter:");
                if (!leitura.hasNextDouble()) {
                    System.out.println("❌ Valor inválido. Digite um número válido (ex: 100.50).");
                    leitura.next(); // limpa o input inválido
                    System.out.println();
                    continue;
                }

                double valor = leitura.nextDouble();
                double result = converter.convert(base, target, valor);

                System.out.printf("✅ Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                        valor, base, result, target);

            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida. Tente novamente.");
                leitura.next(); // limpa o input inválido
            } catch (Exception e) {
                System.out.println("❌ Ocorreu um erro inesperado: " + e.getMessage());
                // Aqui você pode logar, ou continuar se for algo leve
            }
        }

        leitura.close();
    }
}
