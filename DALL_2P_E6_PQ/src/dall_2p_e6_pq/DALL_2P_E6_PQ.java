package dall_2p_e6_pq;

import java.util.Scanner;

public class DALL_2P_E6_PQ 
{   
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int sel1, sel2, cant; boolean aux = false;
        
        System.out.println("Bienvenido al sistema de fila de PepeFon\n...CARGANDO...");
        System.out.println("Este sistema soporta hasta 10 personas en la fila de espera por turno");
        cant = 10;
        System.out.print("1-Ingresar Cliente\n2-Eliminar Cliente\n3-Ingresar Izquierda\nSeleccion: ");
        sel1 = scan.nextInt();
        
        BiQueueRE cola = new BiQueueRE(cant);
        Cliente auxiliar = new Cliente();
        
            switch(sel1)
            {
                case 1:
                {
                    do
                    {
                        System.out.println("--INGRESAR--");
                        auxiliar = IngresarCliente();
                        cola.EnQueueR(auxiliar);
                        cola.Mostrar();
                        System.out.print("Desea continuar ingresando?\n1-SI\n2-NO\nSeleccion: ");
                        sel2 = scan.nextInt();
                    }while(sel2 != 2);
                }
                case 2:
                {
                    do
                    {
                        System.out.println("--ELIMINAR--");
                        cola.DeQueue();
                        cola.Mostrar();
                        System.out.print("Desea continuar eliminando?\n1-SI\n2-NO\nSeleccion: ");
                        sel2 = scan.nextInt();
                        aux = true;
                    }while(sel2 != 2);
                }
                case 3:
                {
                    if(aux = true)
                    {
                        do
                        {
                            System.out.println("--INGRESAR A LA IZQUIERDA--");
                            auxiliar = IngresarCliente();
                            cola.EnQueueL(auxiliar);
                            cola.Mostrar();
                            System.out.print("Desea continuar ingresando?\n1-SI\n2-NO\nSeleccion: ");
                            sel2 = scan.nextInt();
                        }while(sel2 != 2);                    
                    }
                }
            }
    }
    
    public static Cliente IngresarCliente()
    {  
        Scanner lector = new Scanner(System.in);
        Scanner lector1 = new Scanner(System.in);
        Scanner lector2 = new Scanner(System.in);
        Scanner lector3 = new Scanner(System.in);
        Scanner lector4 = new Scanner(System.in);
        
        Cliente clienteObj = new Cliente();
        int op1, op2, tel, usr;
        
        System.out.print("Ingresa el nombre: "); clienteObj.setNombre(lector.nextLine());
        System.out.print("Ingresa el proposito de visita: "); clienteObj.setProposito(lector1.nextLine());
        System.out.print("Cuenta con telefono?\n1-Si\n2-No\nSeleccion: ");
        op1 = lector2.nextInt();
        
        if(op1 == 1)
        {
            System.out.print("Ingresa el telefono: "); 
            tel = lector3.nextInt(); clienteObj.setTelefono(tel);
            
        }
        else
        {
            tel = 0;
            clienteObj.setTelefono(tel);
        }
        System.out.print("Es usuario de la compañia?\n1-Si\n2-No\nSeleccion: ");
        op2 = lector4.nextInt();
        if(op2 == 1)
        {
            usr = 126 + tel;
            System.out.print("Usuario: " + usr);
            clienteObj.setCuenta(usr);
        }
        else
        { 
            clienteObj.setCuenta(0);
        }
        
        System.out.print("Ingresa la fecha de visita: "); clienteObj.setFecha(lector3.nextLine());
        
        
        return clienteObj;
    }
}
