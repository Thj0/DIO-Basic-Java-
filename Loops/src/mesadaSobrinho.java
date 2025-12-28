import java.util.Scanner;

public class mesadaSobrinho {
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();    
        int mesada = 50;
        int mes = 1;
        

        System.out.println("Digite a quantidade de meses que você não gastou a mesada: " + entrada);

        if (mes <=1){
            mes++;
        }


        while (mes <= entrada) { 
            int total = mesada * mes;
            System.out.println("Em " + mes + " meses, você terá guardado: " + total + " reais.");
            
            mes++;
            

        }
        
        leitor.close();
    }
}
    
    

