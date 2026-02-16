package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*Dada as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo: 
(nome - idade - cor);

Gato 1 = nome: Jon, idadde: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: laranja
Gato 3 = nome: Jon, idade: 12, cor: amarelo

 */
public class ExemploOrdenaçãoList {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{

            add(new Gato("Gon", 13,"Laranja"));
            add(new Gato("Yuji", 16, "Cinza"));
            add(new Gato("Zed", 17, "Preto"));
        }};
        System.out.println(meusGatos);



        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //System.out.println("--\tOrdem Idade\t---");

        //System.out.println("--\tOrdem cor\t---");

        //System.out.println("--\tOrdem Nome/Cor/Idade\t---");

    }
}


class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){ 
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }


    public String getNome() { 
    return nome;
    }

    public Integer getIdade() { 
    return idade;
    }

    public String getCor() {
    return cor;
    }

    @Override
    public String toString() {

        return "{" + 
                "nome='" + nome + '\'' + 
                ", idade=" + idade + 
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) { 
        return this.getNome().compareToIgnoreCase(gato.getNome());

    }
}

    
