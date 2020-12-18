import java.util.ArrayList;
import java.util.HashSet;
  
class Sudoku{
    private int[][] sudoku;
    private static final int UNASSIGNED = 0;
      
    public Sudoku()
    {
        sudoku = new int[9][9];
    }
      
    Sudoku(int[][] sudoku)
    {
        this.sudoku = sudoku;
    }
      
    private HashSet< Integer > rowSet = null;
    private HashSet< Integer > colSet = null;
    private HashSet< Integer > boxSet = null;
    private ArrayList< HashSet < Integer > > arrList = new ArrayList< HashSet < Integer > >();
      
    public boolean isAllowed(int row, int col) {
  
        rowSet = arrList.get(row);
        colSet = arrList.get(9 + col);
  
        int box = 3 * (row / 3) + (col / 3);
        boxSet = arrList.get(18 + box);
  
        return (rowSet.add(sudoku[row][col]) && colSet.add(sudoku[row][col]) && boxSet.add(sudoku[row][col]));
    }
  
    public boolean isCorrectSolution()
    {
        for (int i = 0; i < 27; i++)
        {
            arrList.add(new HashSet< Integer >());
        }
  
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if(!isAllowed(i, j) || sudoku[i][j] == UNASSIGNED)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int[][] inputSudoku = {
                            {5, 3, 4, 6, 7, 8, 9, 1, 2},
                            {6, 7, 2, 1, 9, 5, 3, 4, 8},
                            {1, 9, 8, 3, 4, 2, 5, 6, 7},
                            {8, 5, 9, 7, 0, 0, 4, 2, 3},
                            {4, 2, 6, 8, 5, 3, 7, 9, 1},
                            {7, 1, 3, 9, 2, 4, 8, 5, 6},
                            {9, 6, 1, 5, 3, 7, 2, 8, 4},
                            {2, 8, 7, 4, 1, 9, 6, 3, 5},
                            {3, 4, 5, 2, 8, 6, 1, 7, 9} };
          
        Sudoku sc = new Sudoku(inputSudoku);
          
        if(sc.isCorrectSolution())
        {
            System.out.println("Solution is Correct");
        }
        else
        {
            System.out.println("Incorrect Solution");
        }
    }
}
