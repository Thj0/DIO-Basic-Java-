import java.util.Scanner;

//Esse exercício foi feito com a intenção de utilizar o "while".

public class obtenhaNota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe um número");


        System.out.println("Seu número é: ");
        int zeroDez = sc.nextInt();

        while (zeroDez <= 0 || zeroDez > 10) {
            System.out.println("Informe corretamente!");
            System.out.println("Tente novamente: ");

            zeroDez = sc.nextInt();

        }

        sc.close();
            
        

    }
}
