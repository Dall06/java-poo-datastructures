package dall_2p_1pr_priorityq;

public class Paciente extends Padecimiento
{
    String Nombre, ApPaterno, ApMaterno, FechaIngreso, Domicilio, Sangre;
    int Edad, Telefono;
    //Constructor
    public Paciente(){ }
    public Paciente(String nombre)
    { 
        this.Nombre = nombre;
    }
    //Get y set
    public String getNombre(){return this.Nombre;}
    public void setNombre(String nombre){this.Nombre = nombre;}
    
    public String getApPaterno(){return this.ApPaterno;}
    public void setApPaterno(String apPaterno){this.ApPaterno = apPaterno;}
    
    public String getApMaterno(){return this.ApMaterno;}
    public void setApMaterno(String apMaterno){this.ApMaterno = apMaterno;}
    
    public String getDomicilio(){return this.Domicilio;}
    public void setDomicilio(String domicilio){this.Domicilio = domicilio;}
    
    public int getEdad(){return this.Edad;}
    public void setEdad(int edad){this.Edad = edad;}
    
    public String getSangre(){return this.Sangre;}
    public void setSangre(String sangre){this.Sangre = sangre;}
    
    public int getTelefono(){return this.Telefono;}
    public void setTelefono(int telefono){this.Telefono = telefono;}
    
    public String getFechaIngreso(){return this.FechaIngreso;}
    public void setFechaIngreso(String fechaIngreso){this.FechaIngreso = fechaIngreso;}
}
