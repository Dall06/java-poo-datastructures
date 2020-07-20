package dall_poo_pf;

public class BiQueue
{
    private int Izquierda = -1, Derecha = -1; //Frente es Izquierda y Final Derecha
    public int Tope = 0;
    public Pasajero cola[];
    
    public BiQueue(int Tope)
    {
        cola = new Pasajero[Tope];
    }
    
    public void EnQueueR(Pasajero pas)
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
        cola[Derecha] = pas;
    }
    
    public void EnQueueL(Pasajero pas)
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
        
        cola[Izquierda] = pas;
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
        System.out.println("Proposito: " + cola[Frente].getAsiento());
    }
}
