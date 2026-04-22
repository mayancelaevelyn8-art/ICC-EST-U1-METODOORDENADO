public class App {

    public static void main(String[] args) {
        runMetodoBurbujaAvanzado();
        runSeleccion();
    }
    public static void runSeleccion (){
        System.out.println("Metodo Seleccion");
        MetodoSeleccion mSeleccion = new MetodoSeleccion();
        int[] arr = new int[]{1, 10, 7, 9, 0, 1, 3, 4};
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr);
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr);
        mSeleccion.printArreglo(arr);
    }

    public static void runMetodoBurbujaAvanzado() { 
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);  
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }
}