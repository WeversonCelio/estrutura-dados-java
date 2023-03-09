package arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    public void exibirInOrdem() {
        System.out.println("\n\tEXIBINDO IN-ORDEM\t");
        exibirInOrdem(this.raiz);
    }

    public void exibirPosOrdem() {
        System.out.println("\n\tEXIBINDO POS-ORDEM\t");
        exibirPosOrdem(this.raiz);
    }

    public void exibirPreOrdem() {
        System.out.println("\n\tEXIBINDO PRE-ORDEM\t");
        exibirPreOrdem(this.raiz);

    }


    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("(ERROR TRY) Conteudo nao encontrado");
            }

            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("(ERROR CATCH) Conteudo nao encontrado");
        }
    }

    private void exibirPreOrdem(BinNo<T> atualNo) {
        if (atualNo != null) {
            System.out.print(atualNo.getConteudo() + ", ");
            exibirPosOrdem(atualNo.getNoEsq());
            exibirInOrdem(atualNo.getNoDir());
        }
    }

    private void exibirPosOrdem(BinNo<T> atualNo) {
        if (atualNo != null) {
            exibirPosOrdem(atualNo.getNoEsq());
            exibirPosOrdem(atualNo.getNoDir());
            System.out.print(atualNo.getConteudo() + ", ");
        }
    }

    private void exibirInOrdem(BinNo<T> atualNo) {
        if (atualNo != null) {
            exibirInOrdem(atualNo.getNoEsq());
            System.out.print(atualNo.getConteudo() + ", ");
            exibirInOrdem(atualNo.getNoDir());
        }

    }

    private BinNo<T> inserir(BinNo<T> atualNo, BinNo<T> novoNo) {
        if (atualNo == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atualNo.getConteudo()) < 0) {
            atualNo.setNoEsq(inserir(atualNo.getNoEsq(), novoNo));
        } else {
            atualNo.setNoDir(inserir(atualNo.getNoDir(), novoNo));
        }
        return atualNo;
    }

}
