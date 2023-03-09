package pilha;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tInteger\t");
        Pilha<Integer> minhaPilha = new Pilha<>();
        System.out.println(minhaPilha.isEmpty());


        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);

      

        System.out.println(minhaPilha);
        System.out.println("POP: "+minhaPilha.pop());
        System.out.println(minhaPilha);
        System.out.println(minhaPilha.isEmpty());
        System.out.println("TOP: "+ minhaPilha.top());
        System.out.println(minhaPilha);
        minhaPilha.push(99);
        System.out.println(minhaPilha);

        System.out.println("\tSTRING\t");
        Pilha<String> minhaPilhaString = new Pilha<>();
        System.out.println("Esta vazio? "+ minhaPilhaString.isEmpty());


        minhaPilhaString.push("A");
        minhaPilhaString.push("B");
        minhaPilhaString.push("C");
        minhaPilhaString.push("D");
        minhaPilhaString.push("E");
        minhaPilhaString.push("F");
       

        System.out.println(minhaPilhaString);
        System.out.println("POP: "+minhaPilhaString.pop());
        System.out.println(minhaPilhaString);
        System.out.println("Esta vazio? "+ minhaPilhaString.isEmpty());
        System.out.println("TOP: "+ minhaPilhaString.top());
        System.out.println(minhaPilhaString);
        minhaPilhaString.push("W");
        System.out.println(minhaPilhaString);
        
    }
    
}
