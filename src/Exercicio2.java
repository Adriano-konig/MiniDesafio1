import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Reajuste();
    }
    public static void Reajuste(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário atual: ");
        double salario = leitor.nextDouble();

        double calculo = salario * 0.07;

        double resultado = calculo + salario;

        System.out.println("Reajusta o salário em 7%: "+resultado);
    }
}
