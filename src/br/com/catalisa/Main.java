package br.com.catalisa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        menu();
    }
        public static void menu() {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite numero:");
            int n1 = leitor.nextInt();
            System.out.println("Digite outro numero:");
            int n2 = leitor.nextInt();

            for (int i = 0; i < 1000; i++) {
                System.out.println("\n****MENU****");
                System.out.println("Qual operações gostaria fazer calculo");
                System.out.println("1 = [+]\n" +
                        "2 = [-]\n" +
                        "3 = [*]\n" +
                        "4 = [/]\n" +
                        "5 = [SAIR]"+
                        "");
                int menu = leitor.nextInt();
                if (menu == 1) {
                    int soma = n1 + n2;
                    System.out.println("soma: "+soma);
                }
                if(menu == 2){
                    int subtrsação = n1 - n2;
                    System.out.println("subtrsação: "+subtrsação);
                }
                if(menu == 3) {
                    int Multiplicação = n1 * n2;
                    System.out.println("Multiplicação: "+Multiplicação);
                }
                if(menu == 4){
                    int Divisão = n1 / n2;
                    System.out.println("Divisão: "+Divisão);
                }
                if(menu == 5){
                    System.out.println("Encerrando sucesso =D\n");
                    System.exit(0);
                }
            }

        }
    }

