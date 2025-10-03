package Assignment6Oct3;

public class Word_Search {
    public static void main(String[] args) {
        char[][] arr={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(exist(arr,word));

    }
    public static boolean exist(char[][] board, String word) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }

    public static boolean helper(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length()-1) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='@' || board[i][j]!=word.charAt(idx)) return false;
        char temp=board[i][j];
        board[i][j]='@';
        boolean up=helper(board,word,i-1,j,idx+1);
        boolean down=helper(board,word,i+1,j,idx+1);
        boolean left=helper(board,word,i,j-1,idx+1);
        boolean right=helper(board,word,i,j+1,idx+1);
        board[i][j]=temp;
        return up||down||left||right;
    }
}
