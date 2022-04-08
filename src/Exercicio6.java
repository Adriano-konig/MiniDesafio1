public class Exercicio6 {
    public static void main(String[] args) {
    soma();
    }
    public static void soma(){
        int soma = 0;
        int vetor[] = new int[16];

        for(int i = 1;i<vetor.length;i++){
             soma = soma + i;
             System.out.println("soma numeros de 1 a 15"+soma);
        }
    }
}
