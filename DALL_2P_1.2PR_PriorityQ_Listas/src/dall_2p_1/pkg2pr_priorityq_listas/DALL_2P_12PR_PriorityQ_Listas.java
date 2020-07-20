package dall_2p_1.pkg2pr_priorityq_listas;

import java.util.Scanner;

public class DALL_2P_12PR_PriorityQ_Listas 
{
    public static void main(String[] args) 
    {
        end();
    }
    
    public static void end()
    {
        PriorityList lista = new PriorityList();
        
        Scanner lector = new Scanner(System.in);
        
        int opcion, opcion2;
        
        System.out.println("CARGANDO...");
        System.out.println("Bienvenido al sistema de Sala de emergencias del Hospital");
        do
        {
            System.out.print("Seleccione una opción\n1.-Ingresar paciente\n2.-Eliminar paciente\n3.-Consultar lista de espera\nSeleccion: ");
            switch(lector.nextInt())
            {
                case 1:
                {
                    System.out.println("\n***INGRESAR PACIENTE***");
                    do
                    {
                        lista.InsertarFinal(IngresarDatos());
                        System.out.print("\nDesea continuar Ingresando?\n1.-Si\t2.-No\nSeleccion: ");
                        opcion = lector.nextInt();
                    }while(opcion != 2);
                    lista.Ordenar();
                    lista.MostrarLista();
                    break;
                }
                case 2:
                {
                    System.out.println("***ELIMINAR PACIENTE***");
                    lista.MostrarLista();
                    do
                    {
                        System.out.println("Desea Eliminar al paciente en el tope de la lista?"
                                + "\n1.-Si\n2.-No"
                                + "\nSeleccion: ");
                        if(lector.nextInt() == 1)
                        {
                           Nodo aux = lista.EliminarInicial();
                           System.out.println("Paciente eliminado: " 
                                   + aux.Paciente.Nombre + " " 
                                   + aux.Paciente.ApPaterno + " " 
                                   + aux.Paciente.ApMaterno + " " 
                                   + aux.Paciente.Prioridad);
                           lista.MostrarLista();
                        }
                        System.out.print("\nYa atendio al siguiente paciente?\n1.-Si\t2.-No\nSeleccion: ");
                        opcion = lector.nextInt();
                    }while(opcion != 1);
                     break;
                }
                case 3:
                {
                    System.out.println("***CONSULTAR LISTA***");
                    do
                    {
                        lista.MostrarLista();
                        System.out.print("\nDesea continuar en la Consulta?\n1.-Si\t2.-No\nSeleccion: ");
                        opcion = lector.nextInt();
                    }while(opcion != 2);
                }
            }
            System.out.print("\n\nDesea continuar realizando las opciones?\n1.-Si\t2.-No\nSeleccion: ");
            opcion2 = lector.nextInt();
        }while(opcion2 != 2);
    }
    
    
    public static Paciente IngresarDatos()
    {
        Paciente paciente = new Paciente();
        Scanner lector = new Scanner(System.in);
        int valor = 0, aux = 0, aux2 = 0;
        String var;
        
        System.out.print("Nombre: "); paciente.Nombre = lector.nextLine();
        System.out.print("Apellido paterno: "); paciente.ApPaterno = lector.nextLine();
        System.out.print("Apellido materno: "); paciente.ApMaterno = lector.nextLine();
        System.out.print("Edad: "); paciente.Edad = lector.nextInt();
        if(paciente.Edad < 15)
            aux = 2;
        else if(paciente.Edad < 65)
            aux = 1;
        else if(paciente.Edad > 80)
            aux = 0;
        lector.nextLine();
        System.out.print("Tipo sanguineo(A+, A-, AB+, AB-, B+, B-, O+, O-): ");
        var = lector.nextLine();
        switch(var)
        {
            case "A+":
            {
                aux2 = 2; 
                paciente.Sangre = var;
                break;
            }
            case "A-": 
            {
                paciente.Sangre = var;
                aux2 = 3; break;
            }
            case "AB+": 
            {
                paciente.Sangre = var;
                aux2 = 1; break;
            }
            case "AB-":
            {
                paciente.Sangre = var;
                aux2 = 4; break;
            }
            case "B+": 
            {
                paciente.Sangre = var;
                aux2 = 2; break;
            }
            case  "B-": 
            {
                paciente.Sangre = var;
                aux2 = 3; break;
            }
            case "O+":
            {
                paciente.Sangre = var;
                aux2 = 5; break;
            }
            case "O-": 
            {
                paciente.Sangre = var;
                aux2 = 6; break;
            }
            default:
            {
                System.out.println("No aceptado"); 
                break;
            }
        }
        
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
        
        switch(lector.nextLine())
        {
            case "a":
            {
                paciente.Padecimiento = "Paro cardiorespiratorio";
                paciente.Prioridad = 6 + + aux + aux2;
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
                paciente.Prioridad = 4 + + aux + aux2;
                break;
            }
            case "d":
            {
                paciente.Padecimiento = "Intoxicación por farmacos o drogas";
                paciente.Prioridad = 3 + + aux + aux2;
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
                paciente.Prioridad = 1 + + aux + aux2;
                break;
            }
            default:
            {
                System.out.println("Padecimiento no encontrado");
                break;
            }
        }
        System.out.println("***********************");
        return paciente;
    }
}
