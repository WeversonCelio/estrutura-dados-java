package lista.circular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;

    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return (this.tamanhoLista == 0 ? true : false);

    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public void remove(int index) {
        verificarTamanhoLista(index);
        No<T> noAuxiliar = cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--;

    }

    public void add(T conteudo){

        No<T> novNo = new No<T>(conteudo);

        if(this.isEmpty()){
            this.cabeca = novNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        } else{
          novNo.setNoProximo(this.cauda);  
          this.cabeca.setNoProximo(novNo);
            this.cauda = novNo;

        }

        this.tamanhoLista++;
    }

    private void verificarTamanhoLista(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O indice e maior da lista");
        }
    }

    

    @Override
    public String toString() {
       String strRetorno ="";

       No<T> noAuxiliar = this.cauda;
       for (int i = 0; i < this.size(); i++) {
        strRetorno += "No[Conteudo{"+noAuxiliar.getConteudo()+"}] -->";
        noAuxiliar = noAuxiliar.getNoProximo();
       }
       strRetorno += (this.isEmpty()?"[]":"(retorna ao incio)");


       
       return strRetorno;
    }

    private No<T> getNo(int index) {

        verificarListaVazia();

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;

    }

    private void verificarListaVazia() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }
    }

}
