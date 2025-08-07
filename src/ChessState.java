import java.util.Collections;

public class ChessState
{
    public static final int BOARD_DIMENSION = 8;
    private long whitePawns = 0L, whiteKnights = 0L, whiteBishops = 0L, whiteQueen = 0L, whiteKing = 0L;
    private long blackPawns = 0L, blackKnights = 0L, blackBishops = 0L, blackQueen = 0L, blackKing = 0L;

    private void initializeBoard()
    {
        // Can also do String.repeat() for newer versions of Java but this works for Java 8
        String whitePawnsStr = String.join("", Collections.nCopies(6 * BOARD_DIMENSION, "0")) + "11111111" + String.join("", Collections.nCopies(BOARD_DIMENSION, "0"));
        String whiteKnightsStr = String.join("", Collections.nCopies((7 * BOARD_DIMENSION) + 1, "0")) + "1" + "000010";
        String whiteBishopStr = String.join("", Collections.nCopies((7 * BOARD_DIMENSION) + 2, "0")) + "1" + "00100";
        String whiteQueenStr = String.join("", Collections.nCopies((7 * BOARD_DIMENSION) + 3, "0")) + 1 + "0000";
        String whiteKingStr = String.join("", Collections.nCopies((7 * BOARD_DIMENSION) + 4, "0")) + "000";

        String blackPawnsStr = String.join("", Collections.nCopies(BOARD_DIMENSION, "0")) + "11111111" + String.join("", Collections.nCopies(BOARD_DIMENSION * 6, "0"));
        String blackKnightsStr = "01000010" + String.join("", Collections.nCopies(BOARD_DIMENSION * 7, "0"));
        String blackBishopStr = "00100100" + String.join("", Collections.nCopies(BOARD_DIMENSION * 7, "0"));
        String blackQueenStr = "00010000" + String.join("", Collections.nCopies(BOARD_DIMENSION * 7, "0"));
        String blackKingStr = "00001000" + String.join("", Collections.nCopies(BOARD_DIMENSION * 7, "0"));
        
        whitePawns = Long.parseLong(whitePawnsStr, 2);
        whiteKnights = Long.parseLong(whiteKnightsStr, 2);
        whiteBishops = Long.parseLong(whiteBishopStr, 2);
        whiteQueen = Long.parseLong(whiteQueenStr, 2);
        whiteKing = Long.parseLong(whiteKingStr, 2);

        blackPawns = Long.parseLong(blackPawnsStr, 2);
        blackKnights = Long.parseLong(blackKnightsStr, 2);
        blackBishops = Long.parseLong(blackBishopStr, 2);
        blackQueen = Long.parseLong(blackQueenStr, 2);
        blackKing = Long.parseLong(blackKingStr, 2);
    }

    public ChessState()
    {
        initializeBoard();

    }

}
