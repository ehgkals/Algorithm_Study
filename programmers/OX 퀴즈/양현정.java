import java.util.ArrayList;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; ++i) {
            String[] p = quiz[i].split(" ");
            int a = Integer.parseInt(p[0]);
            int b = Integer.parseInt(p[2]);
            int c = Integer.parseInt(p[4]);

            int result = p[1].equals("+") ? (a+b) : (a-b);


            answer[i] = result == c ? "O" : "X";
        }

        return answer;
    }
}
