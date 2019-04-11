public class SubTwoNum {
    public long solution(int a, int b){
        long answer=0;
        for(int i=Math.min(a,b); i <= Math.max(a,b); i++){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        SubTwoNum test = new SubTwoNum();
        int x = 1, y = 1;
        System.out.println(test.solution(x,y));
    }
}
