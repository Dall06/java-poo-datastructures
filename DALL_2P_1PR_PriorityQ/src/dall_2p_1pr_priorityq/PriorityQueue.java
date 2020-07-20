package dall_2p_1pr_priorityq;


public class PriorityQueue extends Sorting
{
    private Paciente cola[];
    private int Frente = -1, Final = -1;
    public int tope;
    
    //CONSTRUCOT
    public PriorityQueue(int tope)
    {
        cola = new Paciente[tope];
    }
    
    public void Enqueue(Paciente paciente)
    {
        if(Final == Frente && Frente == -1)
        {
            Frente++; Final++;
            cola[Final] = paciente;
        }
        else if(Frente < cola.length - 1)
        {
            cola[++Final] = paciente;
        }
        else
        {
            System.out.println("LLENO");
        }
    }
    public void Dequeue()
    {
        Paciente aux;
        if(Frente ==-1)
        {
            System.out.println("COLA VACIA");
        }
        else
        {
            Frente = Frente +1;
            aux = cola[Frente];
            System.out.println("--PACIENTE ELIMINADO");
            Ordenar();
        }
        
    }   
    public void Consultar()//Imprime parte de frente y final, es decir elementos de la cola
    {
        for(int i = Frente; i <= Final; i++)
        {
            System.out.println("\n------\nPrioridad: " + cola[i].Prioridad +  "\n" 
                    + "Nombre: " + cola[i].Nombre + "\n"
                    + "Apellido Paterno: " + cola[i].ApPaterno + "\n"
                    + "Apellido Materno: " + cola[i].ApMaterno + "\n"
                    + "Edad: " + cola[i].Edad + "\n"
                    + "Telefono: " + cola[i].Telefono + "\n"
                    + "Domicilio: " + cola[i].Domicilio + "\n"
                    + "Motivo: " + cola[i].Padecimiento + "\n"
                    + "Fecha de ingreso: " + cola[i].FechaIngreso);
            System.out.println("*************");
        }
    }   
    public void Ordenar()
    {
        if(Frente >= 1 || Final > 0)
            selectionSort(cola);
        else
            System.out.println("Faltan elementos para odenar");
    }
}
