public class App {
    public static void main(String[] args) throws Exception {
       int[] numeros = { 10, 0 , -5 , 5 , 15 , 2};
        runBubbleSort();
    }
    public static void runBubbleSort(){
        System.out.println("Metodo Burbuja: ");
        int [] numeros = {-5,10,2,0,7};
        // Instancia de la clase
        BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglos(numeros);
        // System.out.println("");
        // System.out.println("Ascendente:");
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglos(numeros);
        // System.out.println("");
        // System.out.println("Descendente:");
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("ANTES");
        bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("Descendente");
        bubbleSort.sort(numeros, true);
        bubbleSort.printArreglos(numeros);
        System.out.println("");
        System.out.println("Ascendente");
        bubbleSort.sort(numeros, false);
        bubbleSort.printArreglos(numeros);

    }
}
