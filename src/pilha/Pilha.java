package pilha;

public class Pilha<T> {
    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        return (refNoEntradaPilha==null? true: false);
    }

    public T top(){
        return refNoEntradaPilha.getDado();
    }

    public  void push(T t){
        No<T> novoNo = new No<>(t);
        No<T> refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);

    }

    public T pop(){
        if(!isEmpty()){
          No<T> noPoped = refNoEntradaPilha;
          refNoEntradaPilha = refNoEntradaPilha.getRefNo();
          return  noPoped.getDado();

        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------\n";
        stringRetorno += "       pilha\n";
        stringRetorno += "---------------\n";
        No<T> noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar !=null){
                stringRetorno +=  "[No{dado = "+ noAuxiliar.getDado() +  "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            } else{
                break;
            }
    
        }
        
        stringRetorno += "===============\n";
        return stringRetorno;

    }

    
    
    
}
