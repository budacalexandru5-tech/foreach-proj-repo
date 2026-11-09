public class Ex4 {
    public static void main() {
        double numere[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double rez = 0;
        int i;
        for(i = 0; i < 5; i++)
            rez += numere[i];
            System.out.println("Media tabloului numere e egala cu " + rez / 5);

    }
}
