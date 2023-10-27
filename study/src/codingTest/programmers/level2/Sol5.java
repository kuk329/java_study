package codingTest.programmers.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * 의상
 */
public class Sol5 {
    public static void main(String[] args) {

        Solution5 sol = new Solution5();
        String[] strArr = new String[] {
           "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
        };
        int solution = sol.solution(3, strArr);
        System.out.println(solution);

    }
}


class Solution5 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();

        if(cacheSize==0){
            return cities.length*5;
        }

        for(int i=0; i<cities.length; i++){
            cities[i] = cities[i].toUpperCase(); // 문자열 대문자로 변경
            if(list.contains(cities[i])){ // 이미 있을때
                answer++; // hit
                list.remove(cities[i]); // 기존 값 삭제
                list.add(cities[i]); // 맨 뒤에 추가

            }else{
                answer+=5; // miss
                if(list.size()==cacheSize){
                    list.remove(0); // 가장 첫번째 값 삭제
                    list.add(cities[i]); // 맨 뒤에 추가
                }else{
                    list.add(cities[i]);
                }
            }
        }
        return answer;
    }
}