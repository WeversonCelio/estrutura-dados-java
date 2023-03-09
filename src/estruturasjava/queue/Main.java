package estruturasjava.queue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        Queue<Carro> carros = new LinkedList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Jepp"));

        System.out.println(carros);

        System.out.println(carros.poll());
        System.out.println(carros);
        System.out.println(carros.peek());
        System.out.println(carros);
        System.out.println(carros.isEmpty());
       

        
    }
    
}
