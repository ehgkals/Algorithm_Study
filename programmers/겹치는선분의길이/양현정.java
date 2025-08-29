class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] totalLine = new int[201];

        for(int[] line : lines) {
            int cnt = 0;
            int start = line[0] + 100;
            int end = line[1] + 100;

            for (int i = start ; i < end ; i++) {
                totalLine[i]++;
                if(totalLine[i] == 2) cnt++;
            }
            answer += cnt;
        }

        return answer;
    }
}