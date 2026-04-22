public class App {

    public static void main(String[] args) {
        runMetodoBurbujaAvanzado();
    }

    public static void runMetodoBurbujaAvanzado() { 
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};
        MetodoBurbujaAvanzado metodoBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        metodoBurbujaAvanzado.printArreglo();
        metodoBurbujaAvanzado.sort(true);  
        metodoBurbujaAvanzado.printArreglo();
        metodoBurbujaAvanzado.sort(false);
        metodoBurbujaAvanzado.printArreglo();
    }
}