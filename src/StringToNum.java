/*
문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 0으로 시작하지 않습니다.
입출력 예
예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 */
public class StringToNum {
    public int solution(String s) {
        int answer = 0;
        boolean flag = true;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '-'){
                flag = false;
            } else if( c != '+') {
                answer = answer * 10 + ( c - '0' );
            }
        }
        return flag ? answer : -1*answer;
        // return Integer.valueOf(s);
        // 구현된 함수 쓰기
    }

    public static void main(String[] args) {
        StringToNum test = new StringToNum();
        System.out.println(test.solution("1253"));
    }
}
