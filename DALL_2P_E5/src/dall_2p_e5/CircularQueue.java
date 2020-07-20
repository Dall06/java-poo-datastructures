package dall_2p_e5;

public class CircularQueue 
{
    private double cola[];
    private int Frente = -1, Final = -1;
    public int tope;
    
    //CONSTRUCOT
    public CircularQueue(int tamanio)
    {
        cola = new double[tamanio];
    }
    
    public void Enqueue(double elemento)
    {
        if(Llena() == true)
        {
            System.out.println("LLENA");
        }
        else if(Final == cola.length -1 && Final > 0)
        {
            cola[Final] = elemento;
            Final = 0;
        }
        else
        {
            cola[Final++] = elemento;
            Frente = 0;
        }
    }
    
    public double Dequeue()
    {
        double aux = 0;
        
        if(Vacia() == true)
            System.out.println("VACIA");
        else
        {
            aux = cola[Frente];
            
            if(Frente == Final)
            {
                Frente=-1;
                Final=-1;
            }
            else
                Frente++;
        }
        return aux;
    }
    
    public boolean Llena()
    {
        if(Final == cola.length - 1 && Frente == 0 || Frente == Final + 1 )
            return true;
        else
            return false;
    }
    
    public boolean Vacia()
    {
        if(Final == -1 && Frente == 0)
            return true;
        else
            return false;
    }
    
    public void Consultar()//Imprime parte de frente y final, es decir elementos de la cola
    {
        for(int i = 0; i < cola.length; i++)
        {
            System.out.println(cola[i]);
        }
    }
}
