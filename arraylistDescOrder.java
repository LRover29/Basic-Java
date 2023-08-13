import java.util.ArrayList;
import java.util.Collections;
public class Test {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());
	//       Collections.sort(list);
        // 	 Print the sorted list
	// 	 List Descending Order
        for (String item : list) {
            System.out.println(item);
        }
    }
}