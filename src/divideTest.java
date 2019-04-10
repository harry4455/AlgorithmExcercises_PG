import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class divideTest {
    public int[] solution(int[] arr, int divisor) {
        /*int[] temp = new int[arr.length];
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                temp[idx++] = arr[i];
            }
            *//*else{
                int[] emp = {-1};
                return emp;
            }*//*
        }
        int[] ret = new int[idx];
        for(int i=0; i < idx; i++){
            ret[i] = temp[i];
        }
        Arrays.sort(ret);
        return ret;*/

        /*int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int num: arr){
            if(num % divisor == 0){
                list.add(num);
            }
        }

        if(list.size() == 0){
            list.add(-1);
        } else {
            Collections.sort(list);
        }

        answer = new int[list.size()];

        for (int i=0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;*/

        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }

    public static void main(String[] args) {
        divideTest test = new divideTest();
        int[] a = {5,9,7,10};
        System.out.println(Arrays.toString(test.solution(a,1)));
    }
}