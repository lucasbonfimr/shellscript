package tests;

import appfiladin.FilaDin;
import appfiladin.FilaException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import org.junit.Test;

public class FilaDinTest {
    private FilaDin fila;
    
    @Before
    public void setup(){
        fila = new FilaDin();
    }
    
    @Test
    public void testFilaVazia(){
        boolean vazia = fila.isEmpty();
        assertTrue(vazia);
    }
    
    @Test
    public void testInserirUmValor() throws FilaException{
        fila.enqueue(1);
        boolean vazia = fila.isEmpty();
        assertFalse(vazia);
        int valor = fila.peek();
        assertEquals(1, valor);
    }

    @Test
    public void testInserirDoisValores() throws FilaException{
        fila.enqueue(1);
        fila.enqueue(2);
        boolean vazia = fila.isEmpty();
        assertFalse(vazia);
        int valor = fila.peek();
        assertEquals(1, valor);
    }
    //Ao tentar obter um valor da fila, estando a fila vazia,
    //o teste deve levantar uma exceção
    @Test(expected = FilaException.class)
    public void testObterValorFilaVazia() throws FilaException{
        int valor = fila.peek();
    } 
    
    @Test
    public void testRemoverUmValor() throws FilaException{
        fila.enqueue(1);
        int valor = fila.dequeue();
        assertEquals(1, valor);
        boolean vazia = fila.isEmpty();
        assertTrue(vazia);
    }
    
    @Test
    public void testRemoverDoisValores() throws FilaException{
        fila.enqueue(1);
        fila.enqueue(2);
        int valor1 = fila.dequeue();
        int valor2 = fila.dequeue();
        assertEquals(1, valor1);
        assertEquals(2, valor2);
        boolean vazia = fila.isEmpty();
        assertTrue(vazia);
    }    
    
    @Test(expected = FilaException.class)
    public void testRemoverComFilaVazia() throws FilaException{
        int valor = fila.dequeue();
    }
    
    @Test
    public void testExibirTodosValores(){
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        String valores = fila.show();
        assertEquals("1;2;3;", valores);
    }
    
    @Test
    public void testExibirFilaVazia(){
        String valores = fila.show();
        assertEquals("", valores);
    }
}
