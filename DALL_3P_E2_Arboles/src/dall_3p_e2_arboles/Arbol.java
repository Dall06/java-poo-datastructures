/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dall_3p_e2_arboles;

/**
 *
 * @author Dell
 */
public class Arbol 
{
    Coche Raiz;
    Coche[] str;
    
    public Arbol(int tamanio)
    {
        str = new Coche[tamanio + 1];
    }
    
    public void Raiz(Coche coche)
    {
        str[0] = coche;
    }
    public void setIzquierda(Coche key, int raiz)
    {
        int t = raiz*2 + 1;
        
        if(str[raiz] == null)
        {
            System.out.print("No se puede");
        }
        else
            str[t] = key;
    }
    public void setDerecha(Coche key, int raiz)
    {
        int t = raiz*2 + 2;
        
        if(str[raiz] == null)
        {
            System.out.print("No se puede");
        }
        else
            str[t] = key;
    }
    public void Imprimir()
    {
        System.out.println("*****Impresion*****");

        for(int i = 0; i < str.length; i++)
        {
            if(str[i] != null)
                System.out.println("Modelo: " + str[i].getModelo() + "\n" +
                        "Marca: " + str[i].getMarca());
            else
                System.out.print("-");
        }
    }
    
    public void preOrder(int index) 
    {
        try
        {
            if (index >= str.length) 
            {
                return;
            }
            System.out.println("Modelo: " + str[index].getModelo() + "\n" +
                            "Marca: " + str[index].getMarca());
            preOrder((2 * index)+1);
            preOrder((2 * index)+2);
        }
        catch(Exception e){}
        
    }
    
    public void inOrder(int index) 
    {
        try
        {
            if (index >= str.length) 
            {
                return;
            }
            inOrder((2 * index)+1);
            System.out.println("Modelo: " + str[index].getModelo() + "\n" +
                            "Marca: " + str[index].getMarca());
            inOrder((2 * index)+2);
        }
        catch(Exception e){}
    }
    
    public void PostOrder(int index) 
    { 
        try
        {
            if (index >= str.length) 
            {
                return;
            }
            PostOrder((2 * index)+1);
            System.out.println("Modelo: " + str[index].getModelo() + "\n" +
                            "Marca: " + str[index].getMarca());
            PostOrder((2 * index)+2);
        }
        catch(Exception e){}
    }   
}
