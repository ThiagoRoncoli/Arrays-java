package ex4;
import java.util.*;

/*
Você é uma pessoa desenvolvedora de software responsável por
otimizar o sistema de gestão de eventos de uma empresa. Recentemente,
a organização relatou um problema: eventos duplicados estão aparecendo
na lista de cadastros, o que pode gerar inconsistências nos relatórios
e dificultar processos administrativos.

Sua tarefa é exibir a lista de eventos sem valores duplicados.
 */

public class Ex4 {

    public static void main(String[] args) {

        Set<String> eventos = new HashSet<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");


        System.out.println("A segunda pessoa da lista é: " + eventos);




    }
}
