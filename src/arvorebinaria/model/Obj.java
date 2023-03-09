package arvorebinaria.model;

public class Obj extends ObjArvore<Obj>{

    private Integer meuValor;

    

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }





    @Override
    public String toString() {
        return meuValor.toString();
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((meuValor == null) ? 0 : meuValor.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (meuValor == null) {
            if (other.meuValor != null)
                return false;
        } else if (!meuValor.equals(other.meuValor))
            return false;
        return true;
    }




    @Override
    public int compareTo(Obj outro) {
        if(this.getMeuValor()> outro.getMeuValor()){
           return 1;
        } else if(this.getMeuValor()<outro.getMeuValor()){
            return -1;
        }
        return 0;
    }




    public Integer getMeuValor() {
        return meuValor;
    }




    public void setMeuValor(Integer meuValor) {
        this.meuValor = meuValor;
    }

    
    


    
}
