package Test;


public class Test {
    public static void main(String[] args)  {
        char[][] board = new char[10][10];
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if ((board[i][j]=='X') && (i==0 || board[i-1][j]=='.') && (j==0 || board[i][j-1]=='.')){
                    count += 1;
                }
            }
        }
    }
}