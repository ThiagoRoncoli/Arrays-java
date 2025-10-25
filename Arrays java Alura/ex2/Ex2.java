package ex2;

import java.util.HashMap;
import java.util.Map;


/*
Sua tarefa é remover o nome “Pedro” da lista. Considere
que a lista inicial possui os seguintes nomes: Joana, Lucas, Pedro e Antônio.
 */

public class Ex2 {

    public static void main(String[] args) {

        Map<Integer, String> estudantes = new HashMap<>();
        estudantes.put(1, "Joana");
        estudantes.put(2, "Lucas");
        estudantes.put(3, "pedro");
        estudantes.put(4, "Antônio");

        System.out.println("Lista Inicial: " + estudantes);

        estudantes.remove(3);

        System.out.println("Lista após a exclusão: " + estudantes);



    }
}

