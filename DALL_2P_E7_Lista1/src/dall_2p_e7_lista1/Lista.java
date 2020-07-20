package dall_2p_e7_lista1;

public class Lista 
{
    public Nodo ListaInicio;
    
    public void InsertarElemento(String nombre, int prioridad)
    {
        Nodo nodoNuevo = new Nodo(nombre, prioridad); 
        Nodo auxiliar;
        
        if(ListaInicio == null)
        {
            System.out.println("VACIA");
            ListaInicio = nodoNuevo;
        }
        else
        {
            auxiliar = ListaInicio;
            while(auxiliar.Siguiente != null)
            {
                auxiliar = auxiliar.Siguiente;
            }
            auxiliar.Siguiente = nodoNuevo;
        }
    }
    public void MostrarLista()
    {
        Nodo auxiliar = ListaInicio;
        while(auxiliar != null)
        {
            System.out.println(auxiliar.getNombre() + " " + auxiliar.getPrioridad());
            auxiliar = auxiliar.Siguiente;
        }
    }
}
