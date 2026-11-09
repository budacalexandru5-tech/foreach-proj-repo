import java.util.Arrays;

public class Array {
    public static void main() {
        String [] personInfo = {"a", "b", "c"};
        System.out.println(personInfo[personInfo.length - 1]);


        int [][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println(matrix[0][1]);
        int [] numbers = new int[6];
        int [] nrs = {1,2 ,3 ,4, 5, 6};
        System.out.println(Arrays.toString(nrs));
    }
}
