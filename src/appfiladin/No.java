package appfiladin;

public class No {
    private int dado;
    private No proximo;
    
    public No(int valor){
        dado = valor;
        proximo = null;
    }
    
    public void setProximo(No no){
        proximo = no;
    }
    
    public No getProximo(){
        return proximo;
    }
    
    public int getDado(){
        return dado;
    }
}
