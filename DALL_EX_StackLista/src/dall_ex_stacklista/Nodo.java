package dall_ex_stacklista;

public class Nodo 
{
    public Automovil Automovil;
    public Nodo Siguiente;
    
        public Nodo(){ }
    public Nodo(Automovil automovil)
    {
        this.Automovil = automovil;
        this.Siguiente = null;
    }
}
