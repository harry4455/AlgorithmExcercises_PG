import java.util.Arrays;

public class NaverHackDay1 {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int rotate =0;
        Arrays.sort(A);

        for(int i=1; i<A.length; i++){
            if(A[i] != A[i-1]){
                if(A[i] + A[i-1] == 7){
                    rotate += 2;
                } else{
                    rotate += 1;
                }
            } else{
            }
        }

        return rotate;
    }
}
