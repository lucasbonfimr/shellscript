package appfiladin;

public class FilaDin {
    No inicio, fim;
    
    public FilaDin(){
        inicio = fim = null;
    }
    
    public boolean isEmpty() {
        return (inicio == null);
    }
    //teste teste denovo 
    public void enqueue(int valor) {
        No novoNo = new No(valor);
        if(isEmpty()){
            inicio = fim = novoNo;
        }else{
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }
    
    public int peek() throws FilaException{
        if(inicio == null)
            throw new FilaException("Fila Vazia!");
        return inicio.getDado();
    }

    public int dequeue() throws FilaException {
        if(isEmpty())
            throw new FilaException("Fila Vazia!");
        int valor = inicio.getDado();
        
        if(inicio == fim){ //tem um único valor na fila
            inicio = fim = null;
        }else{//tem mais de um valor na fila
            inicio = inicio.getProximo();
        }
        
        return valor;
    }

    public String show() {
        No aux;
        String valores = "";
        
        aux = inicio;
        while(aux != null){
            valores += aux.getDado() + ";" ;
            aux = aux.getProximo();
        }
        return valores;
    }

}
