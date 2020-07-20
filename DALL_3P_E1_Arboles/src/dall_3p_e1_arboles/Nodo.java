package dall_3p_e1_arboles;

public class Nodo 
{
    String Nombre;
    int Edad;
    Nodo Izq, Der;
    
    public Nodo (int edad, String nombre)
    {
        Edad = edad;
        Nombre = nombre;
        Izq = null;
        Der = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}
