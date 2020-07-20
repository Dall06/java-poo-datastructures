package dall_2p_e7_lista1;

public class Nodo 
{
    private String Nombre = "";
    private int Prioridad = -1;
    //Apuntador del siguiente nodo
    public Nodo Siguiente;
    //Constructor
    public Nodo(){ }
    public Nodo(String nombre, int prioridad)
    {
        this.Nombre = nombre;
        this.Prioridad = prioridad;
        this.Siguiente = null;
    }
    //Métodos
    public String getNombre(){ return this.Nombre;}
    public void setNombre(String nombre){ this.Nombre = nombre; }
    
    public int getPrioridad() { return this.Prioridad;}
    public void setPrioridad(int prioridad) {this.Prioridad = prioridad;}
}
