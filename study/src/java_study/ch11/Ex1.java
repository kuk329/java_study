package java_study.ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        // 기본 길이(용량, capacity) 가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList 에는 객체만 저장 가능
        // autoboxing에 의해 기본형이 참조형으로 자동변환
        list1.add(5); // 실제로는 new Integer(5)
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1,list2);

        // 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);


    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : "+list1);
        System.out.println("list2 : "+list2);
        System.out.println();
    }
}
