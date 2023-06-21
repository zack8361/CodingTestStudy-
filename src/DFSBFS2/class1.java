package DFSBFS2;

public class class1 {
    public static void main(String[] args) {
        dfs(9);
    }

    private static int dfs(int i) {
        System.out.println(i);
        Node n = new Node(1,2);

        System.out.println(Node.a());
        return 0;
    }

    private static class Node{
        public static int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static int a(){

            return 0;
        }
    }
}
