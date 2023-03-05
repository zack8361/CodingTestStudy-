package newProgrammers;

public class n2ArrayCut {
    public static void main(String[] args) {
        int n= 4;
        int left = 2;
        int right = 5;
        System.out.println(solultion(n,left,right));
    }

    private static int[] solultion(int n, int left, int right) {

        int[][]arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int[] answer = {};
        return answer;
    }
}
