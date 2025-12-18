public class Comentarios {
    public static void main(String[] args) {}
       
        //Olá, eu sou um comentário em uma única linha.

        /* Olá,
        * eu sou um comentário 
        * que posso ser mais detalhado
        * quando necessário
        */

        /**
        * Estas duas estrelinhas acima 
        * é para identificar que você 
        * pretende elaborar um comentário
        * à nível documentação.
        * Muito mídia!
        */
    public void metodo(){
      
    }
    
    // Exemplo de más práticas codificadas.

    /*
    * Este método foi elaborado as pressas
    * por isso abreviamos o nome das variáveis 
    * porém, ele tem a finalidade somar 
    * ou multiplicar dois números.
    */

    //A proposta dos comentários não é a de mitigar/camuflar um método que não foi bem elaborado.
     
    public int somaMultiplica (int n, int x, String m) {
        int r = 0; // r é igual ao resultado 
        if (m == "M"){ // M= Multiplicação 
            r = n * x;

        }else{
            // se não soma mesmo 
            r = n + x;
        }
            return r;
        }
        
    }

    

