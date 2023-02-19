package poscoXcodingon;

public class Phone_number {
    public static void main(String[] args) {
        String phone_number ="01033334444";
        System.out.println(solution(phone_number));
    }

    private static String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            answer+="*";
        }
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            answer+=phone_number.charAt(i);
        }

        return answer;
    }
}
