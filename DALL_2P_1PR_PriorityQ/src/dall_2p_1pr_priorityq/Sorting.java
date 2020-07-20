package dall_2p_1pr_priorityq;

public class Sorting
{
    public void selectionSort(Paciente[] paciente)
    {
        int min; Paciente aux;
        for(int i = 0; i < paciente.length; i++)
        {
            min = i;
            for(int j = i + 1; j < paciente.length; j++)
            {
                if(paciente[j].Prioridad > paciente[min].Prioridad)
                {
                    min = j;
                }
                else if(paciente[j].Prioridad == paciente[min].Prioridad)
                {
                    if(paciente[j].Nombre.charAt(0) > paciente[min].Nombre.charAt(0))
                        min = j;
                }
            }
            aux = paciente[i];
            paciente[i] = paciente[min];
            paciente[min] = aux;
        }
    }
}
