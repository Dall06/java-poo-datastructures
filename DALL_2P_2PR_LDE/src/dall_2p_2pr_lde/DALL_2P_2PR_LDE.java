package dall_2p_2pr_lde;

import java.util.Scanner;

public class DALL_2P_2PR_LDE 
{
    public static void main(String[] args) 
    {
        ListaDoble lista = new ListaDoble();
        Scanner lector = new Scanner(System.in);
        int aux= 0, aux2 = 0;
        do
        {
            System.out.print("Seleccione una opcion\n [1] - Ingresar\n [2] - Eliminar\n [3] - Consultar\n [4] - Salir\n Seleccion: ");
            switch(lector.nextInt())
            {
                case 1:
                {
                    System.out.println("---INGRESAR---");
                    do
                    {
                       lista.Insertar(IngresaDatos());
                       System.out.print("¿Desea continuar ingresando?\n [1] - Si\n [2] - No\n Selección: "); 
                    }while(lector.nextInt() != 2);
                    lista.Consultar();
                    break;
                }
                case 2:
                {
                    System.out.println("---ELIMINAR---");
                    do
                    {
                        lista.Eliminar();
                        lista.Consultar();
                       System.out.print("¿Desea continuar eliminando?\n [1] - Si\n [2] - No\n Selección: "); 
                    }while(lector.nextInt() != 2);
                    break;
                }
                case 3:
                {
                    System.out.println("---CONSULTAR---");
                    do
                    {
                        lista.Consultar();
                       System.out.print("¿Desea salir de la consulta?\n [1] - Si\n [2] - No\n Selección: "); 
                    }while(lector.nextInt() != 1);
                    break;
                }
                case 4:
                {
                    aux = 1;
                    break;
                }
            }
            System.out.println("Desea continuar con el programa?\n [1] - Si\n [2] - No\n Seleccion: ");
            aux2 = lector.nextInt();
        }while(aux != 0 || aux2 != 2);
    } 
    
    public static Pisto IngresaDatos()
    {
        Pisto pisto = new Pisto();
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingresa ID: "); pisto.ID = lector.nextInt();
        System.out.print("Ingresa Precio: "); pisto.Precio = lector.nextDouble();
        lector.nextLine();
        System.out.print("Ingresa Nombre: "); pisto.Nombre = lector.nextLine();
        
        return pisto;
    }
}
