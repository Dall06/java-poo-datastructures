package dall_ex_stacklista;

public class Automovil 
{

    
    int ID;
    String Placas, Modelo, Nombre, Marca;
    Double Precio;
    
    public Automovil(){}
    public Automovil(int ID, String Placas, String Modelo, String Nombre, String Marca, Double Precio) 
    {
        this.ID = ID;
        this.Placas = Placas;
        this.Modelo = Modelo;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = Precio;
    }
    public int getID() 
    {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPlacas() {
        return Placas;
    }

    public void setPlacas(String Placas) {
        this.Placas = Placas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
}
