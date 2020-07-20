package dall_proyecto_p1;

public class Persona
{
    private String Nombre, Fecha, Sangre, Genero, Religion, Telefono;
    private int Edad;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre, String ApP, String ApM) {
        this.Nombre = Nombre + " " + ApP + " " + ApM;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Dia, String Mes, String Anio) {
        this.Fecha = Dia + "/" + Mes + "/" + Anio;
    }

    public String getSangre() {
        return Sangre;
    }

    public void setSangre(String Sangre) {
        this.Sangre = Sangre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}
