package edu.thj.anatomiadasclasses;
public class MinhaClasse {
    public static void main(String [] args) {
        
        String nome = "Jhonata";
        String  sobrenome = "Andrade";

        String nomeCompleto = nomeCompleto (nome, sobrenome);
        System.out.println(nomeCompleto);
    }
        
    public static String nomeCompleto(String nome, String sobrenome) {
        
        return "Resultado do método: " + nome.concat(" ").concat(sobrenome);


    }

}
