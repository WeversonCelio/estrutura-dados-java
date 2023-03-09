package estruturasjava.equalshashcode;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listarCarros = new ArrayList<>();

        listarCarros.add(new Carro("Ford"));
        listarCarros.add(new Carro("Chevrolet"));
        listarCarros.add(new Carro("Volkswagem"));

        System.out.println(listarCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());

       Carro car1 = new Carro("Ford");
       Carro car2 = new Carro("Ford");
       Carro car3 = new Carro("Volkswagem");

       System.out.println(car1.equals(car2));
       System.out.println(car1.equals(car3));


        
    }
    
}
