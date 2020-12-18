
    //-----------------------------------------------------------
//  Sudoku Puzzle lab
//
//  This is a start to you Sudoku puzzle program. Use this
//  2D array to work with.  Change the values in array, to
//  test it thoroughly.
//-----------------------------------------------------------

/*
Name:           Anthony Berrios
Class:          CSC 240-80
Professor:      Frank Ganther
Assignment:     Lab 5
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;

    public class Lab5_ValidateSudokuPuzzle {

        private int[][] sudoku;
        private static final int UNFILLED = 0;

        private HashSet<Integer> rows = null;
        private HashSet<Integer> cols = null;
        private HashSet<Integer> threeByThrees = null;
        private ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();

        private Lab5_ValidateSudokuPuzzle(int[][] sudoku) {
            this.sudoku = sudoku;
        }

        public static void main(String[] args) {
            final int VALID_NUMBER = 111111111;

            int puzzle[][] =
                    {
                            { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                            { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
                            { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
                            { 2, 3, 4, 5, 6, 7, 8, 9, 1 },
                            { 5, 6, 7, 8, 9, 1, 2, 3, 4 },
                            { 8, 9, 1, 2, 3, 4, 5, 6, 7 },
                            { 3, 4, 5, 6, 7, 8, 9, 1, 2 },
                            { 6, 7, 8, 9, 1, 2, 3, 4, 5 },
                            { 9, 1, 2, 3, 4, 5, 6, 7, 8 }
                    };
            Lab5_ValidateSudokuPuzzle sudokuObj = new Lab5_ValidateSudokuPuzzle(puzzle);
            printSudoku(puzzle);

            if(sudokuObj.validiateSolution()) {
                System.out.println("The sudoku solution is correct");
            }
            else {
                System.out.println("The sudoku solution is incorrect.");
            }
        }

             public static void printSudoku(int puzzle[][]) {
            // Loop through all rows
            for (int[] r : puzzle)
                // converting each row as string
                // and then printing in a separate line
                System.out.println(Arrays.toString(r));
        }

            public boolean isAllowed ( int row, int col){
                rows = list.get(row);
                cols = list.get(9 + col);
                sudoku = new int[9][9];

                int three = 3 * (row / 3) + (col / 3);
                threeByThrees = list.get(18 + three);

                return (rows.add(sudoku[row][col]) && cols.add(sudoku[row][col])
                        && threeByThrees.add(sudoku[row][col]));
            }

            public boolean validiateSolution () {
                for (int i = 0; i < 27; i++) {
                    list.add(new HashSet<Integer>());
                }
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (!isAllowed(i, j) || sudoku[i][j] == UNFILLED) {
                            return false;
                        }
                    }
                }
                return true;
            }


    }