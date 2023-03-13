package newProgrammers;
import java.util.ArrayList;
public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};
        System.out.println(solution(progresses,speeds));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        // 남은 작업량 구하기 위한 progresses 배열 값 재입력.
        for(int i=0; i<progresses.length; i++){
            progresses[i] = 100 - progresses[i];
        }
        for(int i=0; i<arr.length; i++){
            // 값이 나누어 떨어질때.
            if(progresses[i]%speeds[i] == 0){
                arr[i] = progresses[i]/speeds[i];
            }
            // 값이 나누어 떨어지지 않을때.
            else {
                arr[i] = progresses[i]/speeds[i]+1;
            }
        }

        // Count 를 담아줄 list 생성.
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[0]; // 초기값 배열의 0번 인덱스로 설정
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
                list.add(count);
                count = 1;
            }
            else {
                count++;
            }
        }
        //끝까지 max 보다 커지지 못하면 else 문에 있는 count ++ 만 하게되므로
        //for 문 밖에서 마지막 count 값을 list에 추가
        list.add(count);
        System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
