public class ChessState
{
    public static final int BOARD_DIMENSION = 8;
    public String[][] board;

    private void initializeBoard()
    {
        board = new String[][]{
                {"r", "n", "b", "q", "k", "b", "n", "r"},
                {"p", "p", "p", "p", "p", "p", "p", "p"},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " "},
                {"P", "P", "P", "P", "P", "P", "P", "P"},
                {"R", "N", "B", "Q", "K", "B", "N", "R"}
        };
    }

    public ChessState()
    {
        initializeBoard();
    }
    public String getPossibleMoves()
    {
        for (int i = 0; i < BOARD_DIMENSION * BOARD_DIMENSION; i++)
        {

        }
    }
}
