package dall_poo_pf;
import java.util.Scanner;
import java.io.IOException;

public class DALL_POO_PF 
{
    public static void main(String[] args) throws IOException
    {
        long matrizA[][] =
        {
            {0,3,4,999999999,8,999999999}, 
            {999999999,0,999999999,999999999,5,999999999}, 
            {999999999, 999999999, 0, 999999999, 3, 999999999},
            {999999999,999999999,999999999,0,999999999,999999999}, 
            {999999999, 999999999,999999999, 7, 0, 3}, 
            {999999999, 999999999, 999999999, 2, 999999999, 0}
        };
        
        Caminos ruta= new Caminos();
         System.out.println(ruta.Algoritmo(matrizA));                
    }
}
