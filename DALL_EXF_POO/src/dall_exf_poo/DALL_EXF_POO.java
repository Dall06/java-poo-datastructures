package dall_exf_poo;
import java.util.Scanner;

public class DALL_EXF_POO 
{
    public static void main(String[] args) 
    {
        end();
    }
    
    public static Juguete IngresarJuguete()
    {
        Juguete juguete = new Juguete();
        Scanner lector = new Scanner(System.in);
        System.out.println("****Ingresar****");
        System.out.print("Clave = "); juguete.Clave = lector.nextInt();
        lector.nextLine();
        System.out.print("Nombre = "); juguete.Nombre = lector.nextLine();
        System.out.print("Precio = "); juguete.Precio = lector.nextDouble();
        System.out.println("********");
        return juguete;
    }
    
    public static void end()
    {
        Scanner lector = new Scanner(System.in);
        int opcion2;
        
        System.out.println("CARGANDO...");
        System.out.println("Bienvenido al sistema de la Jugueteria 'Cri-cri'");
        System.out.print("iNGRESA LA CANTIDAD DE PRODUCTOS:");
        
        PriorityQueue cola = new PriorityQueue(lector.nextInt());
        System.out.println("CARGANDO...");
        
        do
        {
            System.out.print("Seleccione una opción\n [1]-Ingresar juguete\n [2]-Eliminar juguete\n [3]-Consultar lista\n [Seleccion]: ");
            switch(lector.nextInt())
            {
                case 1:
                {
                    do
                    {
                        System.out.println("\n***INGRESAR***");
                        cola.Enqueue(IngresarJuguete());
                        System.out.print("\nDesea continuar Ingresando?\n [1]-Si\n [2]-No\n [Seleccion]: ");
                        opcion2 = lector.nextInt();
                    }while(opcion2 != 2);
                    cola.Ordenar();
                    cola.Consultar();
                    break;
                }
                case 2:
                {
                    do
                    {
                        System.out.println("\n***ELIMINAR***");
                        cola.Dequeue();
                        cola.Consultar();
                        System.out.print("\nDesea continuar Eliminando?\n [1]-Si\n [2]-No\n [Seleccion]: ");
                        opcion2 = lector.nextInt();
                    }while(opcion2 != 2);
                    break;
                }
                case 3:
                {
                    do
                    {
                        System.out.println("\n***MOSTRAR***");
                        cola.Consultar();
                        System.out.print("\nDesea continuar en la Consulta?\n [1]-Si\n [2]-No\n [Seleccion]: ");
                        opcion2 = lector.nextInt();
                    }while(opcion2 != 2);
                    break;
                }
            }
            System.out.print("\n\nDesea continuar realizando las opciones?\n [1]-Si\n [2]-No\n [Seleccion]: ");
            opcion2 = lector.nextInt();
            
        }while(opcion2 != 2);
    }
}
