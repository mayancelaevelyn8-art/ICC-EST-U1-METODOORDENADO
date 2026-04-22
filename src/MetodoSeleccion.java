public class MetodoSeleccion {

    public void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n -1 ; i++){
            int indiceDelMenor = i;
            for(int j = i + 1; j < n; j++){
                if ((arr[indiceDelMenor] > arr[j])) {
                    indiceDelMenor = j;
                }
            }
            if ((i != indiceDelMenor)){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
        for(int i = n - 1; i > 0 ; i--){
            int indiceDelMayor = i;
            for(int j = i - 1; j >= 0; j--){
                if ((arr[indiceDelMayor] < arr[j])) {
                    indiceDelMayor = j;
                }
            }
            if ((i != indiceDelMayor)){
                int aux = arr[i];
                arr[i] = arr[indiceDelMayor];
                arr[indiceDelMayor] = aux;
            }
        }

    }

    public void printArreglo(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}