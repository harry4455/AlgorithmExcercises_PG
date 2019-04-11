// 문자열 내 마음대로 정렬하기

import java.util.ArrayList;
import java.util.Collections;

public class sortStrings {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        /*String[] str = new String[]{};
        for (int i = 0; i < str.length; i++) {

            System.out.println("The word is" + str[n]);
        }
        내가 해본 부분
        */

        // ArrayList로 풀어본것
        ArrayList<String> list = new ArrayList<>(); // ArrayString 사용
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answer;
    }
}

       /* //bubblesort로 풀어본것
        int range = strings.length-1;
        for(int i=0; i<range; i++) {
            for(int j=0; j<(range-1); j++){
                if(compareString(strings[j], strings[j+1],n,n)) {
                    swapString(strings, j, j+1);
                }
            }
        }

        return strings;
    }

    private void swapString(String[] strings, int a, int b) {
        String temp = strings[a];
        strings[a] = strings[b];
        strings[b] = temp;

    }

    public boolean compareString(String a, String b, int n, int now){
        if(a.charAt(now) > b.charAt(now))
            return true;
        else if(a.charAt(now) == b.charAt(now)) {
            int next = n == now ? 0 : ++now;
            if(n == next) next++;
            return compareString(a,b,n,next);
        }else{
            return false;
        }
    }*/

