public class ordemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] select = {13, 18, 20, 24, 27, 28, 30};  //Determinamos um vetor do tipo inteiro com 7 elementos 
        
        System.out.println("O vetor possui " + select.length + " elementos.");      // Nessa linha, informamos a quantidade de elementos que o vetor possui.
        

        int control = 0;                              // Control serve como um contador. 

        System.out.println("Que são eles: ");
        while (control < select.length){              // Enquanto control for menor que o tamanho do vetor, o laço continua executando.
            System.out.print(select[control] + " ");  // Saída do código que mostra o vetor na posição de control 
            control++;                                // Incrementa control em 1 a cada iteração do laço.

        }

        System.out.println("\nImpressão na ordem inversa.");   // Mensagem de saída do for   
        for (int tip = (select.length -1); tip >= 0; tip --){    // Para tip, ele recebe o último índice com length -1, enquanto tip for maior ou igual a 0, decremente 
            System.out.print(select[tip] + " ");                 // Saída do resultado de for 


        }
    }
}