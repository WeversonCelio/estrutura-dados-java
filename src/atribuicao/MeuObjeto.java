package atribuicao;
public class MeuObjeto {
    Integer num;
    

    public MeuObjeto(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
    
    
    
}
