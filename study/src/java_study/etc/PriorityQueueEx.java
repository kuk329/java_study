package java_study.etc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Student("둘리",27));
        priorityQueue.offer(new Student("또치",17));
        priorityQueue.offer(new Student("김은경",28));
        priorityQueue.offer(new Student("김현경",25));



        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        System.out.println("====================");

        PriorityQueue<Student> reversedQ = new PriorityQueue<>(
                (o1, o2) -> o1.age>=o2.age?1:-1
        );

        reversedQ.offer(new Student("둘리",27));
        reversedQ.offer(new Student("또치",17));
        reversedQ.offer(new Student("김은경",28));
        reversedQ.offer(new Student("김현경",25));

        while(!reversedQ.isEmpty()){
            System.out.println(reversedQ.poll());
        }

    }
}


class Student implements Comparable<Student>{

    String name;
    int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student target) { // 나이가 많은게 우선순위가 높은 것.
        return this.age<= target.age?1:-1;

    }

    @Override
    public String toString() {
        return "이름 : "+name+" , 나이 : "+age;
    }
}
