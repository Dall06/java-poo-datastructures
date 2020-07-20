package dall_2p_e8_lista2;

public class Paciente 
{
    public String Nombre, ApPaterno, ApMaterno, FechaIngreso;
    public int Edad, Prioridad;
    //Constructor
    public Paciente(){}
    public Paciente(String nombre){this.Nombre = nombre;}
    //Get y Set
    public String getNombre(){return this.Nombre;}
    public void setNombre(String nombre){this.Nombre = nombre;}
    
    public String getApPaterno(){return this.ApPaterno;}
    public void setApPaterno(String apPaterno){this.ApPaterno = apPaterno;}
    
    public String getApMaterno(){return this.ApMaterno;}
    public void setApMaterno(String apMaterno){this.ApMaterno = apMaterno;}
    
    public int getEdad(){return this.Edad;}
    public void setEdad(int edad){this.Edad = edad;}
    
    public String getFechaI(){return this.FechaIngreso;}
    public void setFechaI(String fechaIngreso){this.FechaIngreso = fechaIngreso;}
    
    public int getPrioridad(){return this.Prioridad;}
    public void setPrioridad(int prioridad){this.Prioridad = prioridad;}
}
