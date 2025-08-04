import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String solution = solution("aukks", "wbqd", 5);
		System.out.println(solution);

	}
	
	public static String solution(String s, String skip, int index) {
        String answer = "";
        
        boolean[] isSkipped = new boolean[125];
        
        for(int i = 0; i < skip.length(); i++) {
        	char ch = skip.charAt(i);
        	isSkipped[ch] = true; //문자의 인덱스 값이 true
        	//char는 실제로 정수로 취급되는 타입으로 문자=숫자(아스키코드)로 자동 변환
        }

        List<Character> realChar = new ArrayList<>();
     
        for (int i = 97; i <= 122; i++) {
            if (!isSkipped[i]) {
                realChar.add((char)i);
            }
        }
        
        List<Character> answers = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	
        	if (isSkipped[ch]) {
                answers.add(ch);  // 또는 continue; 로 건너뛰어도 됨
                continue;
            }
        	
        	//순환처리 추가
        	int idx = realChar.indexOf(ch);      	
        	int newIndex = (idx + index) % realChar.size();      	     	
        	answers.add(realChar.get(newIndex));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : answers) {
            sb.append(c);
        }
        answer = sb.toString();
 
        return answer;
    }

}
