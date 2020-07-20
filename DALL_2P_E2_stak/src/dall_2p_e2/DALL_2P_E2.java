package dall_2p_e2;
import java.util.Scanner;

public class DALL_2P_E2 
{
    public static void main(String[] args) 
    {
        //INSTANCIAR OBJETO QUE PERMITE LECTURA
          Scanner lector = new Scanner(System.in);
          
          //INSTANCIAR OBJETO CON EL TAMAÑO DE LA VARIABLE tamanio
          Pila pila_1 = new Pila(100);

          System.out.print("Ingresa la cadena: ");
          String cadena = lector.next();
          
          if(BlanceParentesis(cadena, pila_1) == true)
            System.out.println("Balanceado ");
          else
            System.out.println("No Balanceado ");
      }

      static boolean BlanceParentesis(String cadena, Pila pila_1)
      {
        for(int i=0;i<cadena.length();i++) 
        { 
            if (cadena.charAt(i) == '{' || cadena.charAt(i) == '(' || cadena.charAt(i) == '[') 
              pila_1.push(cadena.charAt(i)); 

            if (cadena.charAt(i) == '}' || cadena.charAt(i) == ')' || cadena.charAt(i) == ']') 
            {
                if (pila_1.empty()) 
                { 
                    return false; 
                }  
                else if ( !BalancePar(pila_1.pop(), cadena.charAt(i)) ) 
                { 
                    return false; 
                } 
            }    
        } 
        if (pila_1.empty()) 
         return true; /*balanced*/
        else
        {   
            return false; 
        }  
    }  
      
      
      static boolean BalancePar(char character1, char character2)
      {
        if (character1 == '(' && character2 == ')') 
            return true; 
        else if (character1 == '{' && character2 == '}') 
            return true; 
        else if (character1 == '[' && character2 == ']') 
            return true; 
        else
           return false; 
      }
}
