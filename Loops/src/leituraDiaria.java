import java.util.Scanner;

public class leituraDiaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int paginasPorDia = 3; //antes: paginasLidas (nome confundia)
        int dias = 0;          // começa em 0, pois ainda não passou nenhum dia
        int totalLido = 0;     // acumulador de páginas lidas
        
        System.out.println("Quantas páginas esse livro possui?");
        int totalPaginas = leitor.nextInt();  // erro de sintaxe corrigido

        do {
          
          dias++;                     // passou 1 dia
          totalLido += paginasPorDia; // leu 3 páginas nesse dia 
          
          
        } while (totalLido < totalPaginas); // condição lógica corrigida
        
        System.out.println("\nQuantidade de páginas: " + totalPaginas);
        System.out.println("Páginas lidas por dia: " + paginasPorDia);
        System.out.println("Quantidade de dias para terminar: " + dias);
        
        leitor.close();
    }
}

