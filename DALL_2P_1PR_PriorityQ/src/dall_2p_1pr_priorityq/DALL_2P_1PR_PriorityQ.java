package dall_2p_1pr_priorityq;
import java.util.Scanner;

public class DALL_2P_1PR_PriorityQ 
{
    public static void main(String[] args) 
    {
       end();
    }
    
    public static Paciente IngresarDatos()
    {
        Paciente paciente = new Paciente();
        Scanner lector = new Scanner(System.in);
        int aux = 0, aux2 = 0;
        
        System.out.print("Nombre: "); paciente.Nombre = lector.nextLine();
        System.out.print("Apellido paterno: "); paciente.ApPaterno = lector.nextLine();
        System.out.print("Apellido materno: "); paciente.ApMaterno = lector.nextLine();
        System.out.print("Edad: "); paciente.Edad = lector.nextInt();
        lector.nextLine();
        System.out.print("Tipo sanguineo(A+, A-, AB+, AB-, B+, B-, O+, O-): "); paciente.Sangre = lector.nextLine();
        System.out.print("Domicilio: "); paciente.Domicilio = lector.nextLine();
        System.out.print("Telefono: "); paciente.Telefono = lector.nextInt();
        lector.nextLine();
        System.out.print("Fecha de ingreso: "); paciente.FechaIngreso = lector.nextLine();
        System.out.print("Lista de Padecimientos\n"
                + "\n a .-Paro cardiorespiratorio"
                + "\n b .-Trauma mayor"
                + "\n c .-Déficit neurologico mayor a 6 horas"
                + "\n d .-Intoxicación por farmacos o drogas"
                + "\n e .-Contusion menor"
                + "\n f .-Patologia infecciosa leve"
                + "\nPadecimiento: ");
        
        if(paciente.Edad < 15)
            aux = 2;
        else if(paciente.Edad < 65)
            aux = 1;
        else if(paciente.Edad > 80)
            aux = 0;
        
        if(paciente.Sangre == "A+")
            aux2 = 2;
        else if(paciente.Sangre == "A-")
            aux2 = 3;
        else if(paciente.Sangre == "AB+")
            aux2 = 1;
        else if(paciente.Sangre == "AB-")
            aux2 = 4;
        else if(paciente.Sangre == "B+")
            aux2 = 2;
        else if(paciente.Sangre == "B-")
            aux2 = 3;
        else if(paciente.Sangre == "O+")
            aux2 = 5;
        else if(paciente.Sangre == "O-")
            aux2 = 6;
        
        switch(lector.nextLine())
        {
            case "a":
            {
                paciente.Padecimiento = "Paro cardiorespiratorio";
                paciente.Prioridad = 6 + aux + aux2;
                break;
            }
            case "b":
            {
                paciente.Padecimiento = "Trauma mayor";
                paciente.Prioridad = 5 + aux + aux2;
                break;
            }
            case "c":
            {
                paciente.Padecimiento = "Déficit neurologico";
                paciente.Prioridad = 4 + aux + aux2;
                break;
            }
            case "d":
            {
                paciente.Padecimiento = "Intoxicación por farmacos o drogas";
                paciente.Prioridad = 3 + aux + aux2;
                break;
            }
            case "e":
            {
                paciente.Padecimiento = "Contusion menor";
                paciente.Prioridad = 2 + aux + aux2;
                break;
            }
            case "f":
            {
                paciente.Padecimiento = "Patologia infecciosa leve";
                paciente.Prioridad = 1 + aux + aux2;
                break;
            }
            default:
            {
                System.out.println("Padecimiento no encontrado");
                break;
            }
        }
        System.out.print("***********************");
        return paciente;
    }
    
    public static void end()
    {
        Scanner lector = new Scanner(System.in);
        int opcion2, opcion;
        
        System.out.println("CARGANDO...");
        System.out.println("Bienvenido al sistema de Sala de emergencias del Hospital");
        System.out.print("Ingresa la cantidad de pacientes que se pueden atender: ");
        int cantidad = lector.nextInt();
        PriorityQueue cola = new PriorityQueue(cantidad);
        System.out.println("CARGANDO...");
        
        do
        {
            System.out.print("Seleccione una opción\n1.-Ingresar\n2.-Eliminar\n3.-Consultar\nSeleccion: ");
            opcion = lector.nextInt();
            
            if(opcion == 1)
            {
                do
                {
                    System.out.println("\n***INGRESAR***");
                    cola.Enqueue(IngresarDatos());
                    System.out.print("\nDesea continuar Ingresando?\n1.-Si\t2.-No\nSeleccion: ");
                    opcion2 = lector.nextInt();
                }while(opcion2 != 2);
                cola.Ordenar();
                cola.Consultar();
            }
            else if(opcion == 2)
            {
                do
                {
                    System.out.println("\n***ELIMINAR***");
                    cola.Dequeue();
                    cola.Consultar();
                    System.out.print("\nDesea continuar Eliminando?\n1.-Si\t2.-No\nSeleccion: ");
                    opcion2 = lector.nextInt();
                }while(opcion2 != 2);
            }
            else if(opcion == 3)
            {
                do
                {
                    System.out.println("\n***MOSTRAR***");
                    cola.Consultar();
                    System.out.print("\nDesea continuar en la Consulta?\n1.-Si\t2.-No\nSeleccion: ");
                    opcion2 = lector.nextInt();
                }while(opcion2 != 2);
            }
            
            System.out.print("\n\nDesea continuar realizando las opciones?\n1.-Si\t2.-No\nSeleccion: ");
            opcion2 = lector.nextInt();
            
        }while(opcion2 != 2);
    }
}
