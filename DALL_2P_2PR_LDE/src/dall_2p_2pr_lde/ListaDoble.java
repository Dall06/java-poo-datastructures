package dall_2p_2pr_lde;

public class ListaDoble 
{
    Nodo Inicio = null;
    
    public Nodo Insertar(Pisto pisto)
    {
        Nodo nuevo = new Nodo(pisto);
        Nodo auxiliar;
        
        if (Inicio == null) 
            Inicio = nuevo;  
        
        else if (Inicio.Pisto.ID >= nuevo.Pisto.ID) 
        { 
            nuevo.Siguiente = Inicio;
            nuevo.Siguiente.Anterior = nuevo;
            Inicio = nuevo;
        }
  
        else 
        { 
            auxiliar = Inicio; 
            
            while (auxiliar.Siguiente != null && auxiliar.Siguiente.Pisto.ID < nuevo.Pisto.ID)  
                auxiliar = auxiliar.Siguiente; 

            //HACE CONEXION ENTRE NODOS
            nuevo.Siguiente = auxiliar.Siguiente; 
            
            //AGREGA AL FINAL DE LA LISTA
            if (auxiliar.Siguiente != null)  
                auxiliar.Siguiente.Anterior = nuevo;  

            auxiliar.Siguiente = nuevo;  
            nuevo.Anterior = auxiliar;  

        } 
        return Inicio;
    }
    
    public void Eliminar()
    {
        Nodo auxiliar = Inicio;
        if (Inicio == null || auxiliar == null) 
        { 
            return; 
        }
        if (Inicio == auxiliar) 
        { 
            Inicio = auxiliar.Siguiente; 
        }
        if (auxiliar.Siguiente != null) 
        { 
            auxiliar.Siguiente.Anterior = auxiliar.Siguiente; 
        }
        if (auxiliar.Anterior != null) 
        { 
            auxiliar.Anterior.Siguiente = auxiliar.Siguiente; 
        } 
  
        // Eliminar memoria
        return;
    }
    
    public void Consultar()
    {
        Nodo actual = Inicio;
        
        if(Inicio == null)
            return;
        
        System.out.println("\n---ELEMENTOS EN LA LISTA---");
        
        while(actual != null)
        {
            System.out.println("ID: " + actual.Pisto.ID + "\n" +
                    "Nombre: " + actual.Pisto.Nombre +  "\n" +
                    "Precio: " + actual.Pisto.Precio);
            actual = actual.Siguiente;
            System.out.println("*************");
        }
        System.out.println(actual);
    }
}
