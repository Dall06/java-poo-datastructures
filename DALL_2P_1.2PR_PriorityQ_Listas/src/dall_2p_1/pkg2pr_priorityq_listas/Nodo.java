package dall_2p_1.pkg2pr_priorityq_listas;

public class Nodo 
{
    public Paciente Paciente;
    public Nodo Siguiente;
    
    public Nodo(){ }
    public Nodo(Paciente paciente)
    {
        this.Paciente = paciente;
        this.Siguiente = null;
    }
}
