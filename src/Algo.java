public class Algo {
    public static void main() {
        int [] array = {3, 1, 2, 5, 4};
        sort(array, array.length);

        for(int nr: array){
            System.out.print(nr + " ");
        }
    }

    public static void sort(int [] array, int n) {
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < n - 1; i++){
                if(array[i] > array[i+1]){
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
