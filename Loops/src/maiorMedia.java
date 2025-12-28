import java.util.Scanner;

//Esse exercício foi feito com a intenção de que o "do-while", fosse utilizado.

public class maiorMedia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe cinco números.");

        int contador = 1;

        int numero;
        int maior = 0;
        int soma = 0;
        double media;


        do  { 

            System.out.println("Digite o " + contador + "° numero: ");
            numero = sc.nextInt();

            soma += numero; 

            if (contador == 1){ 
                maior = numero;

            } else if (numero > maior) {
                maior = numero;

            }

            
            contador++;
        } while (contador <=5);
        
        media = soma / 5.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);


        sc.close();
            
    }
}