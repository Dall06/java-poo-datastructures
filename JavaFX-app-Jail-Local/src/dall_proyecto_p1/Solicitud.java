package dall_proyecto_p1;

public class Solicitud
{
    private String Tipo, Area, Fecha, Descripcion;
    private Persona nPersona;

    public Persona getnPersona() {
        return nPersona;
    }

    public void setnPersona(Persona nPersona) {
        this.nPersona = nPersona;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Dia, String Mes, String Anio) {
        this.Fecha = Dia + "/" + Mes + "/" + Anio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
