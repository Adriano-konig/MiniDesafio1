import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        valores();
    }
    public static void valores() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor x: ");
        int x = leitor.nextInt();
        System.out.println("Digite o valor y: ");
        int y = leitor.nextInt();

        System.out.println("Digite o valor Z para verifique se pertence de x e y: ");
        int z = leitor.nextInt();

        if(x >= y || y>=x){
            if(z <= x || z <=y){
                System.out.println("numero "+z+" está pertence");
            }
        }
            System.out.println("numero "+z+" não está pertence");

    }
}
