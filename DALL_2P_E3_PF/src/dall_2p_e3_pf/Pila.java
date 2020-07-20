package dall_2p_e3_pf;

public class Pila 
{
    public int tope;
    private double[] pila;
    
    //CONSTRUCTOR
    public Pila(){}
    public Pila(int tamanio)
    { 
        pila = new double[tamanio];
        tope = -1;
    }
    //METODO PUSH: INGRESA VALORES EN ORDEN
    public void push(double elemento)
    {
        tope++;
        pila[tope] = elemento;
    }
    //METODO POP: ELIMINA VALOR TOPE
    public double pop()
    {
        double auxiliar;
        
        auxiliar = pila[tope];
        pila[tope--] = ' ';
        
        return auxiliar;
    }
}
