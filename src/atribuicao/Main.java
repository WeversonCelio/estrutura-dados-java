package atribuicao;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Primitivo");
        int c = 1;
        int d = c;
        System.out.println("a: "+ c + " b: "+ d);
        d = 2;
        System.out.println("a: "+ c + " b: "+ d);

        System.out.println("Objeto");
       MeuObjeto a = new MeuObjeto(1);
       MeuObjeto b =a;
       System.out.println("a: "+ a + " b: "+ b);
       b.setNum(2);
       System.out.println("a: "+ a + " b: "+ b);
    }
}
