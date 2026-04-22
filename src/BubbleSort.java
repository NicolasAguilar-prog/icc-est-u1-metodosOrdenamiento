public class BubbleSort {
    //Constructor
    public BubbleSort(){
        System.out.println("Se creo la clase en el constructor");
       
    }

    public void sortAscendente(int numeros[]){
        for (int i=0; i< numeros.length; i++){
            for (int j=i+1;j< numeros.length;j++){
                //COMPARACION
                if (numeros [i]>numeros[j]){
                    // si cumple -> intercambio
                    int aux = numeros [i];
                    numeros[i] = numeros [j];
                    numeros[j] = aux;


                }
            }
        }
    }

    public void sortDescendente(int numeros[]){
        for (int i=0; i< numeros.length; i++){
            for (int j=i+1;j< numeros.length;j++){
                //COMPARACION
                if (numeros [i]<numeros[j]){
                    // si cumple -> intercambio
                    int aux = numeros [i];
                    numeros[i] = numeros [j];
                    numeros[j] = aux;


                }
            }
        }
    }

    public void printArreglos(int[] numeros) {
        System.out.println(" ");
        for(int i : numeros){
            System.out.print(i + " ");
        }

    }

    ///
    // [asc] true
    /// 
    public void sort(int numeros[], boolean asc){
        if (asc){
            sortDescendente(numeros);
        }else
            {
            sortAscendente(numeros);
        }
    }

}
