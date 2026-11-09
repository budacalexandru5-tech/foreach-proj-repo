import java.util.Arrays;

public class Ex3 {
    public static void main() {
        String [] culori = {"albastru", "verde", "galben"};
        System.out.println(Arrays.toString(culori));
        culori[2] = "portocaliu";
        System.out.println(Arrays.toString(culori));
        System.out.println(culori.length);

    }
}
