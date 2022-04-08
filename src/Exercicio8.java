import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        numerosPares();
    }
    public static void numerosPares(){
        Scanner leitor = new Scanner(System.in);

        int numeros[] = new int[20];
        System.out.println("Digite 20 numeros para comparar quantos numeros são pares");

        for(int i = 0;i < numeros.length; i++){
            System.out.println("Digite numero "+(i+1)+": ");
            numeros[i] = leitor.nextInt();
        }
        for(int i = 0;i < numeros.length; i++){
           if(numeros[i] %2 == 0){
               System.out.println("numeros par é : "+numeros[i]);

              // System.out.println("quantos numeros pares:"+numeros[i]);
           }
        }
    }
}
