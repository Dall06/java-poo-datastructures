package dall_2p_2pr_lde;

public class Nodo 
{
    public Pisto Pisto;
    public Nodo Siguiente;
    public Nodo Anterior;
    
    public Nodo(){ }
    public Nodo(Pisto pisto)
    {
        this.Pisto = pisto;
        this.Siguiente = null;
        this.Anterior = null;
    }
}
