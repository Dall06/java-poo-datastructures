package dall_2p_e6_pq;

public class Cliente 
{
    //Variables
    private String Nombre, Proposito, Fecha; int Telefono, Cuenta; 
    //Constructor
    public Cliente(){ }
    public Cliente(String Nombre){ this.Nombre = Nombre; }
    //Get_Set
    public String getNombre(){return this.Nombre;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}
    
    public String getProposito(){return this.Proposito;}
    public void setProposito(String Proposito){this.Proposito = Proposito;}
    
    public String getFecha(){return this.Fecha;}
    public void setFecha(String Fecha){this.Fecha = Fecha;}
    
    public int getTelefono(){return this.Telefono;}
    public void setTelefono(int Telefono){this.Telefono = Telefono;}
    
    public int getCuenta(){return this.Cuenta;}
    public void setCuenta(int Cuenta){this.Cuenta = Cuenta;}
}
