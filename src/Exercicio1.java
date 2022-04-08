import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++){
            Scanner leitor = new Scanner(System.in);
            System.out.println( (i+1)+" Digite numero: ");
            vetor[i] = leitor.nextInt();
        }
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i];
            if(i == i){
                System.out.println(vetor[i]+"Esse numero São iguais");
            }
        }
        }
}
