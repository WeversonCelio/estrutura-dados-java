package estruturasjava.list;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Jepp"));

        System.out.println(carros);

        System.out.println(carros.indexOf(new Carro("Jepp")));
        System.out.println(carros);
        System.out.println(carros.get(2));
        System.out.println(carros);
        System.out.println(carros.isEmpty());
       

        
    }
    
}
