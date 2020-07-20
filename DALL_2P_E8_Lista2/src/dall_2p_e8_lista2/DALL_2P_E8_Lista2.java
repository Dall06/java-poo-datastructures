package dall_2p_e8_lista2;

import java.util.Scanner;

public class DALL_2P_E8_Lista2 
{
    public static void main(String[] args) 
    {
        Lista lista = new Lista();
        Scanner scan = new Scanner(System.in);
        int seleccion;
        System.out.println("Bienvenido");
        System.out.println("---Cargando---\n");
        do
        {
            System.out.println("****INGRESAR***");
            lista.InsertarElemento(IngresaPaciente());
            System.out.print("Desea continuar agregando?\n1-Si\n2-No\nSeleccion: "); seleccion = scan.nextInt();  
        }while(seleccion != 2);
        System.out.println("\n****MOSTRAR***");
        lista.MostrarLista();
    }
    public static Paciente IngresaPaciente()
    {
        Scanner lector = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Paciente paciente = new Paciente();
        
        System.out.print("Introduce el nombre: "); paciente.setNombre(lector.nextLine());
        System.out.print("Introduce el Apellido paterno: "); paciente.setApPaterno(lector.nextLine());
        System.out.print("Introduce el Apellido materno: "); paciente.setApMaterno(lector.nextLine());
        System.out.print("Introduce la Edad: "); paciente.setEdad(lector.nextInt());
        System.out.print("Introduce la Fecha de ingreso: "); paciente.setFechaI(scan.nextLine());
        System.out.print("Introduce la prioridad: "); paciente.setPrioridad(lector.nextInt());
        
        return paciente;
    }
}
