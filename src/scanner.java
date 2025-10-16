import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        while (numero != 999) {
            System.out.print("Digite um número (ou 999 para finalizar): ");
            numero = scanner.nextInt();

            if (numero == 999) {
                System.out.println("Programa finalizado!");
                break;
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " é um número PAR");
            } else {
                System.out.println(numero + " é um número ÍMPAR");
            }
        }

        scanner.close(); // boa prática
    }
}
