package lista.duplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size() {
        return tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();

    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        this.tamanhoLista++;

    }

    public void add(int index, T conteudo) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoProximo().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;

        } else {
            novoNo.getNoAnterior().setNoProximo(novoNo);
        }

        this.tamanhoLista++;

    }

    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
                ;
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoAnterior(noAuxiliar.getNoAnterior());
            } else{
               ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    



    @Override
    public String toString() {
      String strRetorno ="LISTA --> ";
      NoDuplo<T> noAuxiliar = primeiroNo;

      for (int i = 0; i < size(); i++) {
        strRetorno += "no[conteudo{"+noAuxiliar.getConteudo()+"}]-->";
        noAuxiliar = noAuxiliar.getNoProximo();
        
      }
      strRetorno += "null";



      return strRetorno;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; ((i < index) && (noAuxiliar != null)); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();

        }
        return noAuxiliar;

    }

}
