package java_study.ch6;

// JDK 1.5부터 함수의 매개변수를 동적으로 지정 가능. -> 가변인자
// 가변인자는 '타입... 변수명' 과 같은 형식으로 선헌한다.
public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100","200","300"};
        System.out.println(concatenate("","apple","banana","melon"));
        System.out.println(concatenate("-","h","e","l","o"));
        System.out.println( concatenate(":",strArr));


    }

    static String concatenate(String delim, String... args){
        String result="";

        for(String str:args){
            result+=str+delim;
        }
        return result;
    }
}
