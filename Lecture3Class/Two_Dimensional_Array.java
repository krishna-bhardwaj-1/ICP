package Lecture3Class;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        row(arr);
        System.out.println("------------------");
        col(arr);
    }

    public static void row(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void col(int[][] arr){
        for (int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
