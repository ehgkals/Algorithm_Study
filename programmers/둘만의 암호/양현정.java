class Solution {
	public String solution(String s, String skip, int index) {
	char str[] = s.toCharArray();
	char skipArr[] = skip.toCharArray();
	
	for (int i = 0; i < str.length; ++i) {
		char alpha = str[i];
		int cur = alpha;
		int tempIndex = index; // 각 문자마다 index 복사
		
		while (tempIndex > 0) {
			Boolean bValid = true;
			cur = 97 + (cur - 97 + 1) % 26;
			for (int j = 0; j < skipArr.length; ++j) {
				if (cur == skipArr[j]) {
					bValid = false;
					break;
				}
			}
			if (bValid) {
				tempIndex--;
				str[i] = (char)cur;
			}
		
		}
	}
	
	String answer = new String(str);
	return answer;
	}
}