class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        int numbers_sum = 0;
        
        for(int i=0; i<10; i++){
            sum += i;
        }
        
        for(int i=0; i<numbers.length; i++){
             numbers_sum += numbers[i];   
        }
        
        answer = sum - numbers_sum;
        
        return answer;
    }
}