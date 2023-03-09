package estruturasjava.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        Set<Carro> carros = new HashSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Mercedes"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Jepp"));


        System.out.println(carros);


        Set<Carro> carros2 = new TreeSet<>();

        carros2.add(new Carro("Ford"));
        carros2.add(new Carro("Jepp"));
        carros2.add(new Carro("Mercedes"));
        carros2.add(new Carro("Chevrolet"));


        System.out.println(carros2);


        
    }
    
}
