public class NaverHackDay3 {
    public int solution(int[] T) {

        int length = T.length;
        int winter = T[0];
        int cnt = 0;

        for(int i=1; i<length; i++){
            if(winter < T[i]){
                cnt++;
            }
        }

        // write your code in Java SE 8
        return length - cnt;
    }

    public static void main(String[] args) {
        NaverHackDay3 test = new NaverHackDay3();
        int[] t = new int[]{-5,-5,-5,-42,6,12};
        System.out.println(test.solution(t));
    }
}
