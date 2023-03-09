package fila;

public class Main {
   public static void main(String[] args) {
 
    Fila<String> minhFila = new Fila<>();

    minhFila.enqueue("Primeiro");
    minhFila.enqueue("Segundo");
    minhFila.enqueue("Terceiro");
    minhFila.enqueue("Quarto");
    System.out.println(minhFila);
    System.out.println("dequeue: " + minhFila.dequeue());
    System.out.println(minhFila);
    System.out.println("first: "+ minhFila.first());
    System.out.println(minhFila);
    minhFila.enqueue("Ultimo");
    System.out.println(minhFila);

   }
}
