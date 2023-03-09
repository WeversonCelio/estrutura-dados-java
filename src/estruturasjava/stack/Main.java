package estruturasjava.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> carros = new Stack<>();

        carros.push(new Carro("Ford"));
        carros.push(new Carro("Fiat"));
        carros.push(new Carro("Jepp"));

        System.out.println(carros);

        System.out.println(carros.pop());
        System.out.println(carros);
        System.out.println(carros.peek());
        System.out.println(carros);
        System.out.println(carros.isEmpty());
       

        
    }
    
}
