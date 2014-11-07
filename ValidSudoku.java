/**
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

=========================================
|| 5 | 3 |   ||   | 7 |   ||   |   |   ||
||---+---+---||---+---+---||---+---+---||
|| 6 |   |   || 1 | 9 | 5 ||   |   |   ||
||---+---+---||---+-------||---+---+---||
||   | 9 | 8 ||   |   |   ||   | 6 |   ||
||=====================================||
|| 8 |   |   ||   | 6 |   ||   |   | 3 ||
||---+---+---||---+---+---||---+---+---||
|| 4 |   |   || 8 |   | 3 ||   |   | 1 ||
||---+---+---||---+---+---||---+---+---||
|| 7 |   |   ||   | 2 |   ||   |   | 6 ||
||=====================================||
||   | 6 |   ||   |   |   || 2 | 8 |   ||
||---+---+---||---+---+---||---+---+---||
||   |   |   || 4 | 1 | 9 ||   |   | 5 ||
||---+---+---||---+---+---||---+---+---||
||   |   |   ||   | 8 |   ||   | 7 | 9 ||
=========================================

A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

Hide Tags Hash Table
*/

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return false;
        int[] rowBits = new int[9], colBits = new int[9], cellBits = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int bit = 1 << (board[i][j] - '1');
                int cellId = i / 3 * 3 + j / 3;
                if ((rowBits[i] & bit) > 0 || (colBits[j] & bit) > 0 || (cellBits[cellId] & bit) > 0) return false;
                rowBits[i] |= bit; colBits[j] |= bit; cellBits[cellId] |= bit;
            }
        }
        return true;
    }
}