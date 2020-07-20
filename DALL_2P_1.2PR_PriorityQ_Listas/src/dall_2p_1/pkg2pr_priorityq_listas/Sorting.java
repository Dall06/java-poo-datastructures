package dall_2p_1.pkg2pr_priorityq_listas;

public class Sorting 
{
    public Nodo sortedMerge(Nodo a, Nodo b) 
    { 
        Nodo resultado = null; 

        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        if (a.Paciente.Prioridad >= b.Paciente.Prioridad) 
        { 
            resultado = a; 
            resultado.Siguiente = sortedMerge(a.Siguiente, b); 
        } 
        else 
        { 
            resultado = b; 
            resultado.Siguiente = sortedMerge(a, b.Siguiente); 
        } 
        return resultado; 
    } 
  
    public Nodo mergeSort(Nodo h) 
    {
        if (h == null || h.Siguiente == null) 
        { 
            return h; 
        }
        
        Nodo medio = getMedio(h); 
        Nodo continuo = medio.Siguiente; 
        medio.Siguiente = null; 
 
        Nodo izquierda = mergeSort(h);  
        Nodo derecha = mergeSort(continuo);
        
        Nodo sortedlist = sortedMerge(izquierda, derecha); 
        return sortedlist; 
    } 

    public Nodo getMedio(Nodo h) 
    { 
        if (h == null) 
            return h;
        
        Nodo primero = h.Siguiente; 
        Nodo segundo = h; 
  
        while (primero != null) 
        { 
            primero = primero.Siguiente; 
            if (primero != null) 
            { 
                segundo = segundo.Siguiente; 
                primero = primero.Siguiente; 
            } 
        } 
        return segundo; 
    } 

}