package dall_2p_e8_lista2;

public class Lista 
{
    public Nodo ListaInicio;
    
    public void InsertarElemento(Paciente paciente)
    {
        Nodo nodoNuevo = new Nodo(paciente); 
        Nodo auxiliar;
        
        if(ListaInicio == null)
        {
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
            System.out.println();
        }
    }
}
