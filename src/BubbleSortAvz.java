public class BubbleSortAvz {
    //Variable global
    int [] array;// tiene valor? no
    //donde le doy valor?
    
    boolean  huboIntercambio;

    public BubbleSortAvz(int[] arreglo){
        //1ra forma
        //array= new int[]{10,5,0};
        //2da forma darle valor en base a parametro
        this.array = arreglo;
        
    }

    public void sort(boolean asc){

        
        if (asc){
            int numeroComparaciones=0;
            int tam = array.length;
        for(int i=0; i<tam-1; i++){
            huboIntercambio=false;
            for(int j=0; j<tam-1 -i;j++){
                numeroComparaciones++;
                if(array[j]>array[j+1]){
                    huboIntercambio=true;
                    int aux=array[j];
                    array[j] = array [j+1];
                    array[j+1]= aux;
                }
            }
            if (!huboIntercambio){
                break;
            }
        }
        System.out.println("");
        System.out.println("Numero de comparaciones Asc: "+numeroComparaciones);
        }else{
            int numeroComparacionesss=0;
             int tam = array.length;
            for(int i=0; i<tam-1; i++){
                huboIntercambio=false;
                for(int j=0; j<tam-1 -i;j++){
                    numeroComparacionesss++;
                    if(array[j]<array[j+1]){
                        huboIntercambio=true;
                        int aux=array[j];
                        array[j] = array [j+1];
                        array[j+1]= aux;
                }
            }
            //es pa que no siga haciendo coparaciones depues de terminar de ordenar
            if (!huboIntercambio){
                break;
            }
        }    
        System.out.println("");
        System.out.println("Numero de comparaciones descendente: "+numeroComparacionesss);
        }

    
    }

        public void printArreglos(int[] array) {
        System.out.println(" ");
        for(int i : array){
            System.out.print(i + " ");
        }

    }
}
