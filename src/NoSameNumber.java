

public class NoSameNumber {
    public int[] solution(int []arr){
        int[] arrTemp = new int[arr.length];
        int temp = -1, su = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != temp){
                arrTemp[su++] = arr[i];
                temp=arr[i];
            }
        }

        int[] answer = new int[su];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = arrTemp[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        NoSameNumber test = new NoSameNumber();
        int[] a = {1,1,3,3,0,1,1};
        System.out.println(test.solution(a));
    }
}