package dall_exf_poo;

public class Sorting 
{
    void sort(Juguete arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j].Clave < arr[min_idx].Clave) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            Juguete temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
}
