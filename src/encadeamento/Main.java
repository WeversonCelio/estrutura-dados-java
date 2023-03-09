package encadeamento;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo no 1");
        No<String> no2 = new No<>("conteudo no 2");
        no1.setProximo(no2);
        
        No<String> no3 = new No<>("Conteudo no 3");
        no2.setProximo(no3);

        No<String> no4 = new No<>("Conteudo no 4");
        no3.setProximo(no4);

        

        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no1.getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo());
        System.out.println(no1.getProximo().getProximo().getProximo().getProximo());


        No<Integer> no5 = new No<>(1);
        No<Integer> no6 = new No<>(2);
        no5.setProximo(no6);
        
        No<Integer> no7 = new No<>(3);
        no6.setProximo(no7);

        No<Integer> no8 = new No<>(4);
        no7.setProximo(no8);

        System.out.println(no5);
        System.out.println(no5.getProximo());
        System.out.println(no5.getProximo().getProximo());
        System.out.println(no5.getProximo().getProximo().getProximo());
        System.out.println(no5.getProximo().getProximo().getProximo().getProximo());
    }
    
}
