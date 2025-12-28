import java.util.Scanner;

public class imparOuPar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar? ");
        int n = sc.nextInt();

        int impares = 0;
        int pares = 0;
        int contador = 1;

        do { 
            System.out.println("Digite o " + contador + "° número.");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;

            } else { 
                impares++;
            }

            contador++;
        } while (contador <= n); 
        
        System.out.println("\nQuantidade de números ímpares: " + impares);
        System.out.println("Quantidade de números pares: " + pares);

        
        sc.close();
    }

}
