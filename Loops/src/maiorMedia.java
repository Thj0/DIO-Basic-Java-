import java.util.Scanner;

//Esse exercício foi feito com a intenção de que o "do-while", fosse utilizado.


public class maiorMedia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe cinco números.");

        int contador = 1; // Váriavel que nos dará controle sobre a situação exigida. 

        int numero;       // É responsável por guardar os números informados.
        int maior = 0;    // Onde é guardado o maior número digitado, entre os 5.
        int soma = 0;     // Soma tem a literal função, onde guarda o total dos 5 números digitados.
        double media;     // Média nos informará o resultado da divisão da soma.


        do  { 

            System.out.println("Digite o " + contador + "° numero: ");
            numero = sc.nextInt(); // Aqui é onde digitaremos os números que o programa pede.

            soma += numero; 

            if (contador == 1){  // condição para conferir se o contador é igual a 1
                maior = numero;

            } else if (numero > maior) { // caso não seja e, número for maior(>) que maior 
                maior = numero;          // maior recebe o valor de número 

            }

            
            contador++;          /// E a cada iteração do loop, é somado 1 à contador.
        } while (contador <=5);  // Enquanto contador for menor igual a 5. 
        
        media = soma / 5.0;      // Como dito, após a operação, média tem a função de dividir o valor total da soma dos números.

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);


        sc.close(); //E aqui o sistema de leitura é encerrado 
            
    }
}