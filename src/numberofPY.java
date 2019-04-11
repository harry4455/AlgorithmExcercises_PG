/* 문자열 내 p와 y의 개수

문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.
 */

public class numberofPY {
    boolean solution(String s) {
        boolean answer = true;

        // 생각이 안나서 일단 옮겨적음

        s = s.toLowerCase(); // 대문자를 모두 소문자로 변경함

        String[] s1 = new String[s.length()];
        int[] py = {0,0};
        s1 = s.split("");

        for(int i=0; i<s1.length; i++){
            if(s1[i].equals("p")){
                py[0]++;
            }else if(s1[i].equals("y")){
                py[1]++;
            }
        }

        if(py[0] == py[1]){
            answer = true;
        }else
            answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}