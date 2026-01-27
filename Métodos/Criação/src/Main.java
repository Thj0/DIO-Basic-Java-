public class Main {
    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(7, 3);
        Calculadora.subtracao(9, 1.0);
        Calculadora.multiplicacao(7, 7);
        Calculadora.divisao(5, 2.5);

        System.out.println(" ");
        
        //Mensagem 
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(21);

        System.out.println(" ");

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
