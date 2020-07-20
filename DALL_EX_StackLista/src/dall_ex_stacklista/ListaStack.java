package dall_ex_stacklista;

public class ListaStack 
{
   Nodo Tope;
   int Longitud = -1;
   
   public ListaStack()
   {
       Tope = null;
   }
   
   public void Push(Automovil automovil)
   {
       Nodo auxiliar = new Nodo(automovil);
       
       auxiliar.Siguiente = Tope;
       Tope = auxiliar;
       Longitud++;
   }
   public Automovil Pop(int ID)
   {
       Automovil resultado;
       
       if(Longitud < 0)
           System.out.print("Vacia");
       
       resultado = Tope.Automovil;
       Tope = Tope.Siguiente;
       
       Longitud--;
       
       return resultado;
   }
   
   public void pop2(int key) 
    {  
        Nodo auxiliar = Tope, auxiliar2 = null; 

        if (auxiliar != null && auxiliar.Automovil.ID == key) 
        { 
            Tope = auxiliar.Siguiente; // Se cambia el Tope 
            return; 
        } 

        // Busqueda del parametro ingresado dentro del objeto y sus valores
        // La variable auxiliar2 nos ayuda para realizar el cambio 
        while (auxiliar != null && auxiliar.Automovil.ID != key) 
        { 
            auxiliar2 = auxiliar; 
            auxiliar = auxiliar.Siguiente; 
        }     

        // Si lo que se desea eliminar no se encuentra 
        if (auxiliar == null) return; 

        // Se desconecta el nodo
        auxiliar2.Siguiente = auxiliar.Siguiente; 
    } 
   
       
    public void Mostrar()
    {
        Nodo actual = Tope;
        
        if(Tope == null)
            return;
        while(actual != null)
        {
            System.out.println("ID:" + actual.Automovil.getID() + "\n"
                    + "Placas:" + actual.Automovil.getPlacas() + "\n" 
                    + "Modelo:" + actual.Automovil.getModelo() + "\n"
                    + "Nombre:" + actual.Automovil.getNombre() + "\n"
                    + "Marca:" + actual.Automovil.getMarca() + "\n"
                    + "Precio:" + actual.Automovil.getPrecio());
            actual = actual.Siguiente;
            System.out.println("*************");
        }
        System.out.println(actual);
    }
}
