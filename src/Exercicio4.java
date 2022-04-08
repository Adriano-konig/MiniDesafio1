import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n1 = leitor.nextInt();
        System.out.println("digite um numero: ");
        int n2 = leitor.nextInt();
        multiplicacao(n1,n2);
    }
    public static int multiplicacao(int n1, int n2){
        int multi = n1 * n2;
        System.out.println("Multiplicação = "+multi);
        return multi;

    }
}
