package dall_2p_e6_pq;

public class BiQueueRE 
{
    private int Izquierda = -1, Derecha = -1; //Frente es Izquierda y Final Derecha
    public int Tope = 0;
    public Cliente cola[];
    
    public BiQueueRE(int Tope)
    {
        cola = new Cliente[Tope];
    }
    
    public void EnQueueR(Cliente cliente)
    {
        if((Izquierda == 0 && Derecha == Tope -1) || (Izquierda == Derecha + 1))
        {
            System.out.print("LLENA");
            return;
        }
        if(Izquierda == -1)
        {
            Izquierda = 0;
            Derecha = 0;
        }
        else if(Derecha == Tope -1)
            Derecha = 0;
        else
            Derecha = Derecha + 1;
        //Agregar
        cola[Derecha] = cliente;
    }
    
    public void EnQueueL(Cliente cliente)
    {
        if((Izquierda == 0 && Derecha == Tope -1) || (Izquierda == Derecha + 1))
        {
            System.out.println("LLENA");
            return;
        }
        if(Izquierda == -1)
        {
            Izquierda = 0;
            Derecha = 0;
        }
        else if(Izquierda == 0)
            Izquierda = Tope -1;
        else
            Izquierda = Izquierda - 1;
        
        cola[Izquierda] = cliente;
    }
    
    public void DeQueue()
    {
        if(Izquierda == -1)
        {
            System.out.println("Vacia");
            return;
        }
        if(Izquierda == Derecha)
        {
            Izquierda = -1;
            Derecha = -1;
        }
        else if(Izquierda == Tope - 1)
            Izquierda = 0;
        else
            Izquierda = Izquierda + 1;
    }
    
    public void Mostrar()
    {
        int Frente = Izquierda, Final = Derecha;
        
        if(Izquierda == -1)
        {
            System.out.println("VACIA");
            return;
        }
        if(Frente <= Final)
            while(Frente <= Final)
            {
                Info(Frente);
                Frente++;
            }
        else
        {
            while(Frente <= Tope -1)
            {
                Info(Frente);
                Frente++;
            }
            Frente = 0;
            while(Frente <= Final)
            {
                Info(Frente);
                Frente++;
            }
        }
    }
    public void Info(int Frente)
    {
        System.out.println("Nombre: " + cola[Frente].getNombre());
                System.out.println("Proposito: " + cola[Frente].getProposito());
                System.out.println("Telefono: " + cola[Frente].getTelefono());
                System.out.println("Cuenta: "+ ""+(126  +cola[Frente].getTelefono())+"" + cola[Frente].getCuenta());
                System.out.println("Fecha: " + cola[Frente].getFecha());
    }
}
