import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        numeroUsuarioDigitado();
    }
    public static void numeroUsuarioDigitado(){
        Scanner leitor = new Scanner(System.in);
        int numero[] = new int[20];
        System.out.println("Digite 20 numeros para comparar quantos numeros são maior que 8: ");
        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite numero"+(i+1)+":");
            numero[i] = leitor.nextInt();
        }
        for(int i = 0; i < numero.length; i++){
        if(numero[i] > 8) {
            System.out.println("Numero maior que 8 são: "+numero[i]);
        }
        }
    }
}
