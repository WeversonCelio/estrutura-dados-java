package fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return (refNoEntradaFila == null ? true : false);
    }

    public void enqueue(T obj) {
        No<T> novoNo = new No<>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() !=null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    return primeiroNo.getObject();
                }
            }
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo()!=null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    return primeiroNo.getObject();
                }
            }

        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = null;
        No<T> noAuxiliar = refNoEntradaFila;
        stringRetorno = "     FILA --> ";

        if (!isEmpty()) {
            while (true) {
                stringRetorno += "no[objeto{ " + noAuxiliar.getObject() + "}] --> ";
                noAuxiliar = noAuxiliar.getRefNo();
                if (noAuxiliar.getRefNo() == null) {
                    stringRetorno += "no[objeto{ " + noAuxiliar.getObject() + "}]\n=============";
                    return stringRetorno;
                }
            }
        }

        return stringRetorno += "null";

    }

}
