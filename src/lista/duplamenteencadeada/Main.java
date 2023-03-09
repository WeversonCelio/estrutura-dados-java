package lista.duplamenteencadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        System.out.println("size= "+minhaLista.size());
        System.out.println(minhaLista);
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        System.out.println(minhaLista);

        minhaLista.remove(3);
        System.out.println(minhaLista);

        minhaLista.add(3, "c99");
        System.out.println(minhaLista);

       System.out.println( minhaLista.get(3));





    }
    
}
