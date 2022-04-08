import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        semana();
    }
    public static  void semana() {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.println("escolhe um numero 1 a 7 e vai apresentar qual dia de semana:");
            int dia = leitor.nextInt();

            if (dia == 1) {
                System.out.println("Segunda dia de preguiça");
            } else if (dia == 2) {
                System.out.println("Terça melhor que segunda");
            } else if (dia == 3) {
                System.out.println("Quartya estamos metade dia util");
            } else if (dia == 4) {
                System.out.println("Quinta Animado");
            } else if (dia == 5) {
                System.out.println("Sextou bora beber");
            } else if (dia == 6) {
                System.out.println("Sabadouu bora festa");
            } else if (dia == 7) {
                System.out.println("Domingo dia de descansar");
            } else {
                System.out.println("Esse numero não existe");
            }
        }
    }
}
