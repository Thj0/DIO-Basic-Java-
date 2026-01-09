import java.util.Scanner;

/*Objetivo: Fazer um programa que peça N números inteiros, que calcule e mostre,
a quantidade de números ímpares e números pares. */

public class imparOuPar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar? ");
        int n = sc.nextInt(); // n faz a função de guardar a quantidade de números digitados pelo usuário.

        int impares = 0;           // ímpares tem a função de contar os números ímpares
        int pares = 0;             // pares tem a função de contar os números pares
        int contador = 1;          // contador tem a função de organizar o código, controlando o número de iterações.

        do { 
            System.out.println("Digite o " + contador + "° número.");
            int numero = sc.nextInt(); // É onde o usuário digita o número que deseja, de acordo com o que o programa pede.

            if (numero % 2 == 0) { //Se numero for divisível por 2 e o resto for 0 
                pares++;           // O número é par 

            } else {               // Se não 
                impares++;         // É ímpar
            }

            contador++; // Dentro do 'do', é acrescentado 1 a contador, à cada iteração do programa 
        } while (contador <= n);  // Enquanto contador for menor igual(<=) à n
        
        System.out.println("\nQuantidade de números ímpares: " + impares);
        System.out.println("Quantidade de números pares: " + pares);

        
        sc.close();
    }

}
