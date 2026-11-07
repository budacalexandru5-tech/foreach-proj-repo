import java.util.Scanner;

public class ForEachEx {
    public static void main() {
//        String[] nameArray = {"Matei", "ALexandra", "Eugen"};
//        for(String name : nameArray){
//            System.out.println(name);
//        }

//        for(int i = 0; i < 100; i++){
//            if(i == 10) break;
//            System.out.println("i: " +  i);
//        }
//        System.out.println("Bucla terminata");
//        int nmax = 26;
//        for(int n = 0; n < nmax; n++){
//            if((n*n)>=nmax) break;
//            System.out.println("n este egal cu " + n + " , n la patrat este egal cu " + n*n);
//        }
//        System.out.println("Sfarsitul buclei");
//        for(int a = 0; a <= 10; a++){
//            if(a % 2 == 0) continue;
//            System.out.println(a);
//        }
//        for(int g = 30; g <= 40; g++){
//            if(g % 2 == 0) System.out.println(g);
//        }
//        int i;
//        for(i = 0; i < 1000; i++){
//            System.out.println(i);
//        }
//        i+=200;
//        System.out.println(i);

        //Lipsa bloc init
//        int j = 0;
//        for(; j < 10; j++){
//            System.out.println(j);
//        }
        //Exemplu cu cateva contoare
//        for(int i = 1, j = 3; i < 5 & j > 0; i++, j--){
//            System.out.println("i = " + i + ", j = " + j);
//        }
//        int suma = 0;
//        String[] luni = {
//                "ianuarie", "februarie", "martie", "aprilie",
//                "mai", "iunie", "iulie", "august",
//                "septembrie", "octombrie", "noiembrie", "decembrie"
//        };
//

//        for(int i = 0; i < 12; i++){
//            int sumaLuna = input.nextInt();
//            suma += sumaLuna;
//        }
//        System.out.println(suma);
//        for(int i = 1; i <=10; i++){
//            System.out.println(i*i);
//        }
        Scanner input = new Scanner(System.in);

        int numar = input.nextInt();

        for(int i = 1; i <= numar; i++)
            System.out.println(i*i);

    }

}
