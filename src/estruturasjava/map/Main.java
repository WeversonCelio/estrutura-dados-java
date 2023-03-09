package estruturasjava.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String> > lista = new ArrayList<>();

        lista.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("idade", "20");
        aluno2.put("Media", "8.0");
        aluno2.put("Turma", "2a");

        lista.add(aluno2);

        System.out.println(lista);


        System.out.println(aluno.containsKey("Nome"));


        



        


        
    }
    
}
