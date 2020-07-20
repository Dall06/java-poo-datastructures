package dall_2p_e4_cola;
import java.util.Scanner;

public class DALL_2P_E4_Cola 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de datos a ingresar: ");
        int tamanio = lector.nextInt();
        double valor;
        int seleccion;
        
        Queue cola = new Queue(tamanio);
        
        for(int i = 0; i < tamanio; i++)
        {
            System.out.print("Ingresa el valor: ");
            valor = lector.nextDouble();
            cola.Enqueue(valor);
        }
        cola.Consultar();
        
        do
        {
            System.out.println("Eliminar");
            cola.Dequeue();
            cola.Consultar();
            System.out.print("Desea continuar eliminando?: \n1-Si\n2-No\nSeleccion: ");
            seleccion = lector.nextInt();
        }while(seleccion == 1);
    }
    
}
