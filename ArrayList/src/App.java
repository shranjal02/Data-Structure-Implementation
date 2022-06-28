import com.implementation.arraylist.ArrayList;

/**
 * This class contains the working of ArrayList class.
 * 
 * @author Prakhar Shrivastava
 */
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr.size());

        System.out.println(arr);

        try {
            arr.remove(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(arr);

        try {
            arr.remove(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(arr);
    }
}
