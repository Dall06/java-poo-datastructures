package dall_2p_e5;

import java.util.Scanner;

public class DALL_2P_E5 
{

    public static void main(String[] args) 
    {
        int seleccion, seleccion2, seleccion3;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de datos: ");
        int tamanio = lector.nextInt();
        
        double valor;

        CircularQueue cola = new CircularQueue(tamanio);

        for(int i = 0; i < tamanio; i++)
        {
            System.out.print("Ingresa el valor " + (i+1) + ": ");
            valor = lector.nextDouble();
            cola.Enqueue(valor);
        }

        cola.Consultar();
        
        do
        {           
            System.out.println("Selecciona una opcion\n1-Ingresar\n2-Eliminar");
            seleccion2 = lector.nextInt();
            switch(seleccion2)
            {
                case 1:
                {
                    do
                    {
                        System.out.println("Ingresar");
                        System.out.print("Ingresa el valor: ");
                        valor = lector.nextDouble();
                        cola.Enqueue(valor);
                        cola.Consultar();
                        System.out.print("Desea continuar ingresando?: \n1-Si\n2-No\nSeleccion: ");
                        seleccion3 = lector.nextInt();
                    }while(seleccion3 != 2);
                    break;
                }
                case 2:
                {
                    do
                    {
                    System.out.println("Eliminar");
                    cola.Dequeue();
                    cola.Consultar();
                    System.out.print("Desea continuar eliminando?: \n1-Si\n2-No\nSeleccion: ");
                    seleccion3 = lector.nextInt();
                    }while(seleccion3 != 2);
                    break;
                }
            }
            System.out.print("Desea continuar?: \n1-Si\n2-No\nSeleccion: ");
            seleccion = lector.nextInt();
        }while(seleccion != 2);
        System.out.println("Tu Queue es: ");
        cola.Consultar();
    } 
}
