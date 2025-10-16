import java.util.Scanner;
public class tabuadaloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int contador = 1;

        System.out.print("Digite o numero da tabuada desejada: ");
        num = scanner.nextInt();

        while (contador <= 10){
            System.out.println(contador + " x " +num+ " = " + (contador*num));
            contador ++ ;
        }
    }
}
