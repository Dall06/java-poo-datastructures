package dall_3p_e2_arboles;
import java.util.Scanner;

public class DALL_3P_E2_Arboles 
{
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa el nivel del arbol: ");
        int nivel = lector.nextInt(), i = 0, nodo = 0, lado, aux = 0;
        nivel = (nivel * 2) + 1;
        System.out.println("Numero de nodos posibles: " + nivel);
        Arbol arbol = new Arbol(nivel);
        
        System.out.println("*****Ingresa la raiz*****");
        arbol.Raiz(Ingresar());
        System.out.print("Hijo Izquierdo? (1-Si\t2-No): ");
        if(lector.nextInt() == 1)
            arbol.setIzquierda(Ingresar(), aux);
        System.out.print("Hijo Derecho? (1-Si\t2-No): ");
        if(lector.nextInt() == 1)
            arbol.setDerecha(Ingresar(), aux);
        aux++;
        
        do
        {
            System.out.print("Hijo Izquierdo en nodo " + aux + "? (1-Si\t2-No): ");
            if(lector.nextInt() == 1)
                arbol.setIzquierda(Ingresar(), aux);
            System.out.print("Hijo Derecho en nodo " + aux + "? (1-Si\t2-No): ");
            if(lector.nextInt() == 1)
                arbol.setDerecha(Ingresar(), aux);
            aux++;
            System.out.println("\nSalir (1-Si\t2-No): ");
        }while(lector.nextInt() != 1);
        arbol.Imprimir();
        System.out.println("\nPreOrder");
        arbol.preOrder(0);
        System.out.println("\nInOrder");
        arbol.inOrder(0);
        System.out.println("\nPostOrder");
        arbol.PostOrder(0);
    }
    
    public static Coche Ingresar()
    {
        Coche raiz = new Coche();
        Scanner lector = new Scanner(System.in);
        System.out.println("*****Crea coche*****");
        System.out.print("Modelo: "); raiz.setModelo(lector.nextLine());
        System.out.print("Marca: "); raiz.setMarca(lector.nextLine());
        
        return raiz;
    }
}
