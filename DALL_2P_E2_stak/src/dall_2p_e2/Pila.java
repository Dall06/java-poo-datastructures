package dall_2p_e2;

public class Pila 
{
    private char pila[];
    private int tope = -1;
    char auxiliar;
    
    //CONSTRUCTOR
    public Pila(){}
    public Pila(int tamanio)
    { 
        pila = new char[tamanio]; 
        tope = - 1;
    }
    //METODO PUSH: INGRESA VALORES EN ORDEN
    public void push(char elemento)
    {
        if (tope == pila.length)  
        { 
            System.out.println("Stack full"); 
        }  
        else 
        { 
            pila[++tope] = elemento; 
        } 
    }
    //METODO POP: ELIMINA VALOR TOPE
    public char pop()
    {
        if(tope == -1)
        {
            return '\0';
        }
        else
        {
            auxiliar = pila[tope];
            pila[tope--] = '$';
        }
        return auxiliar;
    }
    
    public char peek()
    {
        return pila[tope];
    }
    
    public boolean empty()
    {
        return (tope == -1) ? true:false;
        
        /*if(tope == -1)
        {
            return true;
        }
        else
            return false;
        */
    }
}
