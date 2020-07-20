/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dall_2p_e3_pf;

import java.util.Scanner;

public class DALL_2P_E3_PF 
{
    public static void main(String[] args) 
    {
        //INSTANCIAR OBJETO QUE PERMITE LECTURA
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingresa la expresion PostFija: ");
        String cadena = lector.next();
        Pila pila = new Pila(cadena.length());
        System.out.println("Valor total: " + EvaluarPostFija(cadena, pila));
    }
    static double EvaluarPostFija(String cadena, Pila pila)
    {
        double A = 0, B = 0, TOT = 0;
        int i = 0;
        char operador;
        
        while( i < cadena.length())
        {
            //Pila hasta que tenga numeros
            if((cadena.charAt(i) == '+') || (cadena.charAt(i) == '-') || (cadena.charAt(i) == '*') || (cadena.charAt(i) == '/') || (cadena.charAt(i) == '^'))
            {
                operador = cadena.charAt(i);
                A = pila.pop();
                B = pila.pop();
                TOT = operaciones(operador, A, B, pila);
            }
            else
            {
                pila.push(Double.parseDouble(cadena.charAt(i) + ""));
            }
            i++;
        }
        return TOT;
    }
    static double operaciones(char operador, double A, double B, Pila pila)
    {
        double TOT = 0;
        switch(operador)
        {
            case '+':
            {
                TOT = B + A; break;
            }
            case '-':
            {
                TOT = B - A; break;
            }
            case '*':
            {
                TOT = A * B; break;
            }
            case '/':
            {
                TOT = A / B; break;
            }
        }
        pila.push(TOT);
        return TOT;
    }
}
