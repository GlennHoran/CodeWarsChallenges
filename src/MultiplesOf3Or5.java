public class MultiplesOf3Or5 {

    static int solution(int number) {
        int answer = 0;
        for (int i = 0;i<number;i++){
            if(i%5==0 || i%3==0){
                answer +=i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
