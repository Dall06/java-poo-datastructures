    /*Descripcion del metodo a usar:
    Para el calculo de los caminos acorde una matriz de adyacencia dada, de 
    un grafo, al igual que sus peso de nodo a nodo, se utilizará el algoritmo
    de Floyd.
     El algoritmo encuentra el camino entre todos los pares de vértices en una 
    única ejecución. El algoritmo de Floyd-Warshall es un ejemplo de 
    programación dinámica.*/

    /*Descripcion del problema:
    
    */

package dall_poo_pf;

public class Caminos 
{
    public double Gasolina;
    public double Costo = 21.3;
    
    public String Algoritmo(long [][] mady)
    {
        int vertices = mady.length;
        long matriz[][]=mady;
        String caminos [][]= new String[vertices][vertices];
        String caminosaux[][]= new String[vertices][vertices];
        String caminoRecorrido= "", cadena = "",caminitos="";
        int i,j,k;
        float t1,t2, t3, t4,minimo;
        // matrices caminosy matriz caminosnada
        for (i = 0; i < vertices; i++) {
            for (j = 0; j< vertices; j++) {
                caminos[i][j]= "";
                caminosaux[i][j]="";
            }
        }
        
        for (k = 0; k < vertices; k++) {
            for (i = 0; i <vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    t1=matriz[i][j];
                    t2=matriz[i][k];
                    t3=matriz[k][j];
                    t4=t2 +t3;
                    minimo = Math.min(t1, t4);
                    if (t2!=t4) {
                        if (minimo==t4) {
                            caminoRecorrido="";
                            caminosaux[i][j]=k+"";
                            caminos[i][j]=caminoR(i,k,caminosaux,caminoRecorrido)+(k+1);
                        }
                    }
                    matriz[i][j]=(long)minimo;
                       
                }
            }
        }
        
        for (i = 0; i < vertices;i ++) {
            for (j = 0; j < vertices;j ++) {
                cadena=cadena+"["+matriz[i][j]+"]";
            }
            cadena = cadena +"\n";
        }
        
        for (i = 0; i < vertices; i++) {
            for ( j = 0; j < vertices; j++) {
                if (matriz[i][j]!=1000000000) {
                    if (i!=j) {
                        if (caminos[i][j].equals("")) {
                            caminitos +="De la parada "+(i+1)+" a la parada "+(j+1)+" Seguir la ruta: "+(j+1)+"\n";
                        }else{
                            caminitos +="De la parada "+(i+1)+" a la parada "+(j+1)+" Seguir la ruta: "+caminos[i][j]+", "+(j+1)+"\n";
                        }
                    }
                    // end first if
                }
                
                
            }
        }
        
     return "La matriz de caminosmas cortos entre los difetentes vertices es: \n"+cadena+
             "\n los diferentes caminos entre vertices son: \n"+caminitos;
    }
    
    public String caminoR(int i, int k ,String[][] caminosaux,String caminorecorrido){
        if (caminosaux[i][k].equals("")) {
            return "";
        }else{
            //recursividad al billon
            
            int c = Integer.parseInt(caminosaux[i][k].toString());
            caminorecorrido +=caminoR(i,c,caminosaux,caminorecorrido)+
                    (Integer.parseInt(caminosaux[i][k].toString())+1+" , ");
        
        }
       return caminorecorrido;     
    }

}
