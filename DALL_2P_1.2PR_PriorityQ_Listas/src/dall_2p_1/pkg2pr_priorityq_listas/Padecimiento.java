package dall_2p_1.pkg2pr_priorityq_listas;

public class Padecimiento 
{
    public int Prioridad;
    public String Padecimiento;
    
    public Padecimiento(){ }
    public Padecimiento(String padecimiento, int prioridad)
    { 
        this.Padecimiento = padecimiento; 
        this.Prioridad = prioridad;
    }
    
    public String getPadecimiento(){return this.Padecimiento;}
    public void setPadecimiento(String padecimiento){this.Padecimiento = padecimiento;}
    
    public int getPrioridad(){return this.Prioridad;}
    public void setPrioridad(int prioridad){this.Prioridad = prioridad;}
}
