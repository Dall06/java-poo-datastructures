package dall_2p_e1;
import java.util.Scanner;

public class DALL_2P_E1 
{
    public static void main(String[] args) 
    {
        //INSTANCIAR OBJETO QUE PERMITE LECTURA
        Scanner lector = new Scanner(System.in);
        
        //DECALARCION DE VARIABLE "valor" PARA ASIGNARLE UN VALOR
        int valor, seleccion, i = 0;
        
        //TAMAÑO DEL ARREGLO
        System.out.print("Ingresa el tamanio del arreglo\nTamanio: ");
        int tamanio = lector.nextInt();
        
        //INSTANCIAR OBJETO CON EL TAMAÑO DE LA VARIABLE tamanio
        Pila pila_1 = new Pila(tamanio);
        
        //CICLO WHILE PARA INGRESAR LOS VALORES
        System.out.println("*****METODO PUSH******");
        do
        {
            System.out.print("Ingresa el valor " + (i + 1) + " : ");
            valor = lector.nextInt();
            pila_1.push(valor);
            i++;
            System.out.print("Desea seguir Ingresando datos? 1-Si 2-No\nSeleccion: ");
            seleccion = lector.nextInt();
        }while(seleccion == 1);
        
        //CICLO WHILE PARA QUITAR LOS VALORES
        System.out.println("*****METODO POP******");
        do
        {
            System.out.println("Valor extraido: " + pila_1.pop());
            System.out.print("Desea seguir eliminando? 1-Si 2-No\nSeleccion: ");
            seleccion = lector.nextInt();
        }while(seleccion == 1);
        
        //SALIDA DEL PROGRAMA
        System.out.println("Presiona cualquier boton para salir");
        lector.next();
    }   
}
