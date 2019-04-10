public class Middleword {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len % 2 == 0){
            answer = s.substring(len/2 - 1, len/2 + 1);
            return answer;
        }else{
            answer = Character.toString(s.charAt(len/2));
            return answer;
        }
    }

    public static void main(String[] args) {
        Middleword test = new Middleword();
        String s = "efrg";
        System.out.println(test.solution(s));
    }
}
