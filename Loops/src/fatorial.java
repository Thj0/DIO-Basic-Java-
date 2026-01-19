import java.util.Scanner;

/* Fazer um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. */
/* Nesse exercício vimos também sobre debug, onde aprendemos sobre como o programa se comporta.  */

public class fatorial {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);                   // Inicializando o sistema de leitura 

        System.out.println("Número que deseja:");
        int numero = leitor.nextInt();                             // Onde digitaremos o número desejado no terminal. 

        int valorMultiplicado = 1;                                 // Variável criada para guardar o resultado 

        System.out.println(numero +"! = ");                        // Representação textual  
        for (int fatorial = numero; fatorial >= 1 ; fatorial-- ){  // fatorial é igual a número, enquanto fatorial for maior ou igual que 1, decremente 1.
            valorMultiplicado = valorMultiplicado * fatorial;      // valorMultiplicado recebe ela mesmo multiplicando o fatorial, ou seja, guarda o resultado das operações

        }

        System.out.println(valorMultiplicado);                     // resultado impresso 

        leitor.close();                                            // fechamento do sistema de leitura
    }
}
