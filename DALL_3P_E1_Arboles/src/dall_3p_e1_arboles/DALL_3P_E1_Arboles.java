package dall_3p_e1_arboles;

import java.util.Scanner;

public class DALL_3P_E1_Arboles 
{
    public static void main(String[] args) 
    {
        End();
    }
    public static void End()
    {
        Scanner lector = new Scanner(System.in);
        Arbol arbol = new Arbol();
        do
        {
            System.out.print("Bienvenido\n [1]-Ingresar\n [2]-Eliminar\n [3]-Orden\n [Seleccion]: ");
            switch(lector.nextInt())
            {
                case 1:
                {
                    do
                    {
                        System.out.print("Ingresa Edad: "); int edad = lector.nextInt();
                        lector.nextLine();
                        System.out.print("Ingresa Nombre: "); String nombre = lector.nextLine();
                        arbol.Insertar(edad, nombre);
                        System.out.print("Continuar ingresando?\n [1]-Si\n [2]-No\n Seleccion: ");
                    }while(lector.nextInt() != 2);
                    break;
                }
                case 2:
                {
                    do
                    {
                        System.out.print("Ingresa Edad a eliminar del campo: "); int edad = lector.nextInt();
                        arbol.Eliminar(edad);
                        System.out.print("Continuar eliminando?\n [1]-Si\n [2]-No\n Seleccion: ");
                    }while(lector.nextInt() != 2);
                    break;
                }
                case 3:
                {
                    do
                    {
                        System.out.println("Preorden: *********");
                        arbol.Preorden(arbol.Raiz);

                        System.out.println("Inorden: *********");
                        arbol.Inorden(arbol.Raiz);

                        System.out.println("Posrden: *********");
                        arbol.Postorden(arbol.Raiz);
                        System.out.print("Continuar en la consulta?\n [1]-Si\n [2]-No\n Seleccion: ");
                    }while(lector.nextInt() != 2);
                    break;
                }   
            }     
            System.out.print("Desea continuar en el programa?\n [1]-Si\n [2]-No\n [Seleccion]: ");
        }while(lector.nextInt() != 2);
    }
}
