package codingTest.programmers.level2;

/**
 * 다음 큰 숫자
 */
public class Sol3 {
    public static void main(String[] args) {
        Solution3 sol3 = new Solution3();
        int result = sol3.solution(78);
        System.out.println(result);

    }
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;

        int count1 = count_one(n);

        while(true){
            n+=1;
            if(count_one(n)==count1) break;
        }
        answer = n;
        return answer;
    }


    public int count_one(int n){
        int remain;
        int cnt=0; // 1의 갯수 저장
        while(n>1){
            remain = n%2;
            n=n/2;
            if(remain==1){
                cnt+=1;
            }
        }
        return cnt;
    }
}
