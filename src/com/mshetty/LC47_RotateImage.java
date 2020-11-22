package com.mshetty;

public class LC47_RotateImage {
    //1. Roatate clockwise
    //2. Rotate anti clockwise

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(matrix);
        System.out.println("*********Rotate******");
        rotate(matrix);
        printArray(matrix);
        System.out.println("*********Anti-Rotate******");
        rotate(matrix);
        printArray(matrix);
    }

    public static void rotate(int[][] matrix){
        int start = 0;
        int end = matrix.length-1;

        for(int i=0; i<=end/2; i++){
            for(int j=0; j<=end; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[end-i][j];
                matrix[end-i][j]=temp;
            }
        }

        for(int i=0; i<=end; i++){
            for(int j=i+1; j<=end; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

//        while(start < end){
//            int[] temp = matrix[start];
//            matrix[start] = matrix[end];
//            matrix[end] = temp;
//            start++;
//            end--;
//        }
    }

    public static void antirotate(int[][] matrix){
        int start = 0;
        int end = matrix.length - 1;

        for(int i=0; i<= end; i++){
            for(int j=0; j<=end/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][end-i];
                matrix[i][end-i] = temp;
            }
        }
        for(int i=0; i<= end; i++){
            for(int j=i+1; j<=end; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


    }

    public static void printArray(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
