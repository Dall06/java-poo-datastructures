package dall_2p_e1;

public class Pila 
{
    private int pila[], tope;
    
    //CONSTRUCTOR
    public Pila(){}
    public Pila(int tamanio)
    { 
        pila = new int[tamanio]; 
        tope = - 1;
    }
    //METODO PUSH: INGRESA VALORES EN ORDEN
    public void push(int elemnto)
    {
        try
        {
            pila[++tope] = elemnto;
        }
        catch(Exception e)
        {
            System.out.println("**********/PILA LLENA/********");
            tope = --tope;
        }
    }
    //METODO POP: ELIMINA VALOR TOPE
    public int pop()
    {
        int auxiliar = 0;
        if(tope > 0)
        {
            auxiliar = pila[tope];
            pila[tope--] = - 1;
        }
        else
        {
            System.out.println("**********/SIN ELEMENTOS/*********");
        }
        return auxiliar;
    }
}
