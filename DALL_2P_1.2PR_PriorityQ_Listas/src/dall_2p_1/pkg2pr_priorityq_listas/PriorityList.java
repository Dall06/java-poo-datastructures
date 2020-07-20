package dall_2p_1.pkg2pr_priorityq_listas;

public class PriorityList extends Sorting
{
    Nodo Cabecera = null;
    
    public void InsertarFinal(Paciente paciente)
    {
        Nodo nodoNuevo = new Nodo(paciente);
        Nodo auxiliar;
        
        if(Cabecera == null)
        {
            Cabecera = nodoNuevo;
        }
        else
        {
            auxiliar = Cabecera;
            while(auxiliar.Siguiente != null )
            {
                auxiliar = auxiliar.Siguiente;
            }
            auxiliar.Siguiente = nodoNuevo;
        }
    }
    
    public Nodo EliminarInicial()
    {
        if(Cabecera == null)
            return Cabecera;
        
        Nodo auxiliar = Cabecera;
        Cabecera = Cabecera.Siguiente;
        auxiliar.Siguiente = null;
        return auxiliar;
    }
    
    public void MostrarLista()
    {
        Nodo actual = Cabecera;
        
        if(Cabecera == null)
            return;
        
        System.out.println("\n---ELEMENTOS EN LA LISTA---");
        
        while(actual != null)
        {
            System.out.println("Prioridad: " + actual.Paciente.Prioridad +  "\n" 
                    + "Nombre: " + actual.Paciente.Nombre + "\n"
                    + "Apellido Paterno: " + actual.Paciente.ApPaterno + "\n"
                    + "Apellido Materno: " + actual.Paciente.ApMaterno + "\n"
                    + "Edad: " + actual.Paciente.Edad + "\n"
                    + "Telefono: " + actual.Paciente.Telefono + "\n"
                    + "Domicilio: " + actual.Paciente.Domicilio + "\n"
                    + "Motivo: " + actual.Paciente.Padecimiento + "\n"
                    + "Fecha de ingreso: " + actual.Paciente.FechaIngreso);
            actual = actual.Siguiente;
            System.out.println("*************");
        }
        System.out.println(actual);
    }
    
    public void Ordenar()
    {
        mergeSort(Cabecera);
    }
}
