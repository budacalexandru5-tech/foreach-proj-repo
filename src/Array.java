import java.util.Arrays;

public class Array {
    public static void main() {
//        String [] personInfo = {"a", "b", "c"};
//        System.out.println(personInfo[personInfo.length - 1]);
//
//
//        int [][] matrix = {
//                {1, 2},
//                {3, 4}
//        };
//        System.out.println(matrix[0][1]);
//        int [] numbers = new int[6];
//        int [] nrs = {1,2 ,3 ,4, 5, 6};
//        System.out.println(Arrays.toString(nrs));




        int [] arr = new int[5];

        arr[0] = 11;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 99;
        arr[4] = 56;

//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
        arr[0] = 23;
        System.out.println(arr[0]);
        arr[arr.length - 1] = 44;
//        for(int d : arr){
//            System.out.println(d);
//        }
        System.out.println(Arrays.toString(arr));
        int zile_pe_luna[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        zile_pe_luna = new int[12];
//        zile_pe_luna[0] = 31;
//        zile_pe_luna[1] = 28;
//        zile_pe_luna[2] = 31;
//        zile_pe_luna[3] = 30;
//        zile_pe_luna[4] = 31;
//        zile_pe_luna[5] = 30;
//        zile_pe_luna[6] = 31;
//        zile_pe_luna[7] = 31;
//        zile_pe_luna[8] = 30;
//        zile_pe_luna[9] = 31;
//        zile_pe_luna[10] = 30;
//        zile_pe_luna[11] = 31;
        System.out.println("În noiembrie sunt "+zile_pe_luna[10] + " zile.");

    }
}
