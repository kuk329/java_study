package codingTest;

import java.util.ArrayList;
import java.util.Collections;

public class ex {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
    //    System.out.println(list);
        String remove = list.remove(1);
        boolean aaa = list.remove("aaa");
//        System.out.println(remove);
//        System.out.println(aaa);
//


        System.out.println(list);
        boolean aaa1 = list.contains("aaa");
        boolean ddd = list.contains("ddd");
        System.out.println(aaa1);
        System.out.println(ddd);

    }



}
