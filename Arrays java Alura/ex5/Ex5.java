package ex5;

import java.util.*;


/*
Você foi encarregado de desenvolver um sistema para gerenciar
os clientes de uma livraria. Para garantir um controle preciso
dos registros, cada cliente deve possuir um ID único associado ao seu nome.

Para resolver essa tarefa você deve:

Armazenar os clientes através de uma chave e valor: (id, nome)
Cadastrar três clientes
Recuperar o nome do cliente de ID igual a 2
 */

public class Ex5 {

    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Thiago");
        clientes.put(2, "Sofia");
        clientes.put(3, "Pedro");
        clientes.put(4, "Clara");
        clientes.put(5, "Conrado");
        clientes.put(6, "Felipe");


        System.out.println("A segunda pessoa da lista é: " + clientes.get(2));

        
    }
}
