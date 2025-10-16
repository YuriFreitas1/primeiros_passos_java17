import java.util.Scanner;

public class treino1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        String maior = "maior de idade";
        String menor = "menor de idade";
        String situacao;

            if (idade >= 18) {
                situacao = maior;
            }
            else {
                situacao = menor;
            }

        System.out.printf("Seu nome é %s.%nSua idade é: %d.%nE você é %s. ",nome, idade, situacao);

        scanner.close();
    }
}

