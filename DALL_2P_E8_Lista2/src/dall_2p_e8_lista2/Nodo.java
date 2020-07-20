package dall_2p_e8_lista2;

public class Nodo 
{
    public Paciente Paciente;
    //Apuntador del siguiente nodo
    public Nodo Siguiente;
    //Constructor
    public Nodo(){ }
    public Nodo(Paciente paciente)
    {
        this.Paciente = paciente;
        this.Siguiente = null;
    }
}
