package dall_ex_stacklista;

import java.util.Scanner;

public class DALL_EX_StackLista 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        ListaStack lista = new ListaStack();
        int ID, AUX1, AUX2;
        
        System.out.println("Bienvenido a la agencia de autos");
        
        do
        {
            System.out.print("Elige una opcion\n [1]-Ingresar\n [2]-Eliminar\n Seleccion: ");
            switch(lector.nextInt())
            {
                case 1:
                {
                    System.out.println("Ingresar");
                    do
                    {
                        lista.Push(Ingresar());
                        System.out.print("Desea continuar Ingreando? \n [1]-Si\n [2]-No\n Seleccion: ");
                        AUX2 = lector.nextInt();
                    }while(AUX2 != 2);
                    lista.Mostrar();
                    break;
                }
                case 2:
                {
                    System.out.println("Eliminar");
                    do
                    {
                        System.out.print("Ingresa el ID a eliminar: ");
                        ID = lector.nextInt();
                        lista.pop2(ID);
                        System.out.print("Desea continuar Eliminando? \n [1]-Si\n [2]-No\n Seleccion: ");
                        AUX2 = lector.nextInt();
                    }while(AUX2 != 2);
                    lista.Mostrar();
                    break;
                }
            }
            System.out.print("Desea continuar en el programa? \n [1]-Si\n [2]-No\n Seleccion: ");
            AUX1 = lector.nextInt();
        }while(AUX1 != 2);
        
        
    }
    public static Automovil Ingresar()
    {
        Automovil automovil = new Automovil();
        Scanner lector = new Scanner(System.in);
        
        System.out.print("ID: "); automovil.setID(lector.nextInt());
        System.out.print("Placas: "); automovil.setPlacas(lector.nextLine());
        lector.nextLine();
        System.out.print("Modelo: "); automovil.setModelo(lector.nextLine());
        System.out.print("Nombre: "); automovil.setNombre(lector.nextLine());
        System.out.print("Marca: "); automovil.setMarca(lector.nextLine());
        System.out.print("Precio: "); automovil.setPrecio(lector.nextDouble());
        
        return automovil;
    }
}
