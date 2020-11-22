package com.mshetty;

import java.util.HashMap;
import java.util.Map;

public class LC36_ValidSudoku {
    public static void main(String[] args) {
    
//                {
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '5', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };


        char[][] board =  { {'.','.','.','.','5','.','.','1','.'},
                            {'.','4','.','3','.','.','.','.','.'},
                            {'.','.','.','.','.','3','.','.','1'},
                            {'8','.','.','.','.','.','.','2','.'},
                            {'.','.','2','.','7','.','.','.','.'},
                            {'.','1','5','.','.','.','.','.','.'},
                            {'.','.','.','.','.','2','.','.','.'},
                            {'.','2','.','9','.','.','.','.','.'},
                            {'.','.','4','.','.','.','.','.','.'}};
        
        
        boolean result=isValidSudoku(board);
        System.out.println("Result: " +result);


    }

    public static boolean isValidSudoku(char[][] board){
        if(isRowValid(board) && isColumnValid(board) && isValidGrid(board))
            return true;
        else
            return false;
    }

    public static boolean isRowValid(char[][] board){
        int n=board.length;

        for(int i=0; i<n; i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j=0; j<n; j++){
                if(board[i][j] == '.')
                    continue;

                if(map.containsKey(board[i][j]))
                    return false;
                else
                    map.put(board[i][j],1);
            }
        }
        return true;
    }

    public static boolean isColumnValid(char[][] board){
        int n=board.length;

        for(int j=0; j<n; j++){
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                if(board[i][j] == '.')
                    continue;

                if(map.containsKey(board[i][j]))
                    return false;
                else
                    map.put(board[i][j], 1);
            }
        }
        return true;
    }

    public static boolean isValidGrid(char[][] board){
        int n=board.length;
        for(int i=0; i<n; i=i+3){
            for(int j=0; j<n; j=j+3){
                Map<Character, Integer> map = new HashMap<>();

                for(int p=i; p<i+3; p++){
                    for(int q=j; q<j+3; q++){
                        if(board[p][q] == '.')
                            continue;

                        if(map.containsKey(board[p][q]))
                            return false;
                        else
                            map.put(board[p][q], 1);
                    }
                }
            }
        }
    return true;
    }
}
