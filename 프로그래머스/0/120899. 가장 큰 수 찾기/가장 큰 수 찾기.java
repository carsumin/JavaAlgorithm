class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;
        int maxIdx = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]>max) {
                max = array[i];
                maxIdx = i;
            }
        }    
        answer[0] = max;
        answer[1] = maxIdx;
        
        return answer;
    }
}