import com.implementation.hashmap.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.insert(1, "Prakhar");
        hm.insert(2, "Prakhar");
        hm.insert(3, "Prakhar");

        System.out.println(hm);

        hm.remove(2);

        System.out.println(hm);

        System.out.println(hm.contains(6));
        System.out.println(hm.contains(1));

    }
}
