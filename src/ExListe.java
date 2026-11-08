import java.util.ArrayList;
import java.util.List;

public class ExListe {
    public static void main() {
        List<Integer> lists = new ArrayList<Integer>();

        lists.add(1);
        lists.add(3);


        for (Integer value : lists) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println(lists.get(0)); // get - retureaza elementul cu indexul din paranteze
        System.out.println();
        lists.remove(lists.get(0));
        for (Integer value : lists) {
            System.out.println(value);
        }
        System.out.println("Alta metoda: ");
        int [] numbers = new int[] {3, 2, 1};
        for(int nr : numbers){
            System.out.println(nr);
        }

    }
}
