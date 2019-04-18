/*
문자열 다루기 기본

문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 */

public class StringBasic {
    public boolean solution(String s) {

        int length = s.length();
        if(length != 4 && length != 6){
            return false;
        }

        for(int i=0 ; i < length ; i++){
            char c = s.charAt(i);
            if(c < '0' || c > '9')
                return false;
        }
        return true;

        /*
        try-catch를 이용한 다른 풀이

        if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
         */
    }

    public static void main(String[] args) {
        StringBasic test = new StringBasic();
        System.out.println(test.solution("1111"));
    }
}
