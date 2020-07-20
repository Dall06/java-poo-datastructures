package dall_2p_e4_cola;

public class Queue 
{
    private double cola[];
    private int Frente = -1, Final = -1;
    public int tope;
    
    //CONSTRUCOT
    public Queue(int tope)
    {
        cola = new double[tope];
    }
    
    public void Enqueue(double elemento)
    {
        if(Final == Frente && Frente == -1)
        {
            Frente++;
            cola[++Final] = elemento;
        }
        else if(Frente < cola.length - 1)
        {
            cola[++Final] = elemento;
        }
        else
        {
            System.out.println("LLENO");
        }
    }
    public double Dequeue()
    {
        if(cola != null && Frente <= Final)
            return cola[Frente++];
        else
        {
            System.out.println("VACIO"); return -1.3;
        }
    }
    public void Consultar()//Imprime parte de frente y final, es decir elementos de la cola
    {
        for(int i = Frente; i <= Final; i++)
        {
            System.out.println(cola[i]);
        }
    }
}
