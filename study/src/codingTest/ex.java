package codingTest;

import java.util.ArrayList;

public class ex {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        Integer remove = arr.remove(2);
        System.out.println(remove);
        System.out.println(arr);
        arr.add(9);
        System.out.println(arr);

    }
}
