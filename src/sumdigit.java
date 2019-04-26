/*
자릿수 더하기
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
입출력 예
N	answer
123	6
987	24
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
 */

public class sumdigit {
    public int solution(int n) {
        int answer = 0; // 각 자리수들의 합

        while(n != 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;

        /* 문자열로 변경후 각 자리수를 더해나가는 경우
       int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
        }*/
    }

    public static void main(String[] args) {
        sumdigit test = new sumdigit();
        System.out.println(test.solution(1501));
    }
}
