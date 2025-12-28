import java.util.Scanner;

public class nomeIdade { 

//Esse exercício foi feito com a intenção de utilizar o "while".

    public static void main(String[] args) {
        
        String nome = "Jhonata";
        String sobrenome = "de Andrade";
        String nascimento = "2006";

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seus dados.");

        System.out.println("Meu nome é: " + nome + " " + sobrenome);
        System.out.println("Meu ano de nascimento é: " + nascimento);
        
        
        if (sc.hasNextInt()){            
            int idade= sc.nextInt();
            System.out.println("Eu tenho " + idade + " " + "anos. ");

        } else {
            System.out.println("Informe corretamente.");
        

        
        }

        sc.close();
    }
}
