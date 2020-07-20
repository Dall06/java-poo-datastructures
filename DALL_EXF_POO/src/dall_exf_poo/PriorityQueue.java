package dall_exf_poo;

public class PriorityQueue extends Sorting
{
    private Juguete cola[];
    private int Frente = -1, Final = -1;
    public int tope;
    
    //CONSTRUCOT
    public PriorityQueue(int tope)
    {
        cola = new Juguete[tope];
    }
    
    public void Enqueue(Juguete juguete)
    {
        if(Final == Frente && Frente == -1)
        {
            Frente++; Final++;
            cola[Final] = juguete;
        }
        else if(Frente < cola.length - 1)
        {
            cola[++Final] = juguete;
        }
        else
        {
            System.out.println("LLENO");
        }
    }
    public void Dequeue()
    {
        Juguete aux;
        if(Frente ==-1)
        {
            System.out.println("COLA VACIA");
        }
        else
        {
            Frente = Frente +1;
            aux = cola[Frente];
            System.out.println("--PACIENTE ELIMINADO");
        }
        
    }   
    public void Consultar()//Imprime parte de frente y final, es decir elementos de la cola
    {
        for(int i = Frente; i <= Final; i++)
        {
            System.out.println("------");
            System.out.println("Clave" + cola[i].Clave + "\n" +
                    "Nombre" + cola[i].Nombre + "\n" +
                    "Precio" + cola[i].Precio);
            System.out.println("*************");
        }
    }   
    public void Ordenar()
    {
        sort(cola);
    }
}
