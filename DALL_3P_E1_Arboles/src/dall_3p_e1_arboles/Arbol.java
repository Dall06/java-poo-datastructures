package dall_3p_e1_arboles;

public class Arbol
{
    Nodo Raiz;
    public Arbol()
    {
        Raiz = null;
    }
    
    public void Insertar(int edad, String nombre)
    {
        Nodo nuevo = new Nodo(edad, nombre);
        if(Raiz == null)
            Raiz = nuevo;
        else
        {
            Nodo ant = null;
            Nodo auxiliar;
            auxiliar = Raiz;
            while(auxiliar != null)
            {
                ant = auxiliar;
                if(edad < auxiliar.getEdad())
                    auxiliar = auxiliar.Izq;
                else
                    auxiliar = auxiliar.Der;
            }
            if(edad < ant.getEdad())
                ant.Izq = nuevo;
            else
                ant.Der = nuevo;
        }
    }
    
    public void Eliminar(int edad) 
    { 
        Raiz = deleteRec(Raiz, edad); 
    }
    
    private Nodo deleteRec(Nodo root, int edad) 
    {
        if (root == null)  return root; 

        if (edad < root.Edad) 
            root.Izq = deleteRec(root.Izq, edad); 
        else if (edad > root.Edad) 
            root.Der = deleteRec(root.Der, edad); 
        else
        { 
            if (root.Izq == null) 
                return root.Der; 
            else if (root.Der == null) 
                return root.Izq; 
            
            root.Edad = minValue(root.Der); 
  
            root.Der = deleteRec(root.Der, root.Edad); 
        }
        return root; 
    } 
  
    int minValue(Nodo root) 
    { 
        int minv = root.Edad; 
        while (root.Izq != null) 
        { 
            minv = root.Izq.Edad; 
            root = root.Izq; 
        } 
        return minv; 
    }
    
    public void Preorden(Nodo raiz)
    {
        if(raiz != null)
        {
            System.out.println(raiz.getNombre() + " tiene " + raiz.getEdad());
            Preorden(raiz.Izq);
            Preorden(raiz.Der);
        }
    }
    public void Inorden(Nodo raiz)
    {
        if(raiz != null)
        {
            Inorden(raiz.Izq);
            System.out.println(raiz.getNombre() + " tiene " + raiz.getEdad());
            Inorden(raiz.Der);
        }
    }
    public void Postorden(Nodo raiz)
    {
        if(raiz != null)
        {
            Postorden(raiz.Izq);
            Postorden(raiz.Der);
            System.out.println(raiz.getNombre() + " tiene " + raiz.getEdad());
        }
    }
}
