package Programmers2단계;

public class 황윤겔라ex2 {

    public static void main(String[] args) {
        String[] map = {"O","O","O","O","O","M","O","O","O","O"};
        System.out.println(solution(map));
    }

    private static int solution(String[] map) {
        int left = travel(map,true,0, 5);
        int right = travel(map,false, 0,5);
        int result = Math.min(left,right);
        return result;
    }

    private static int travel(String[] map, boolean b,int answer,int index) {
        try {
            if(b) {
                if(map[index-1].equals("O")) {
                    return travel(map, b, answer + 1, index - 1);
                }
            }
            else {
                if(map[index+1].equals("O")){
                    return travel(map,b,answer+1,index+1);
                }
            }
        }
        catch (Exception e){
            return answer;
        }
        return 0;
    }
}
