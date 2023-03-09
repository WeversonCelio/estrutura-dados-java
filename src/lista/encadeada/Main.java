package lista.encadeada;

public class Main {

    public static void main(String[] args) {
        LIstaEncadeada<String> minhaListaEncadeada = new LIstaEncadeada<>();
     
        minhaListaEncadeada.add("teste 1");
        minhaListaEncadeada.add("teste 2");
        minhaListaEncadeada.add("teste 3");
        minhaListaEncadeada.add("teste 4");
        minhaListaEncadeada.add("teste 5");
        System.out.println("Tamanho = " + minhaListaEncadeada.size());

        System.out.println("\tGET\t");
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        
        System.out.println("\tTOSTRING\t");
        System.out.println(minhaListaEncadeada);

         
        System.out.println("\tREMOVE\t");
        System.out.println(minhaListaEncadeada.remove(2));

            
        System.out.println("\tTOSTRING\t");
        System.out.println(minhaListaEncadeada);


    }
    
}
