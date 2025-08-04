import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader
{
    public BufferedImage blackBishop, blackKing, blackKnight, blackPawn, blackQueen, blackRook
            ,whiteBishop, whiteKing, whiteKnight, whitePawn, whiteQueen, whiteRook;

    public ImageLoader()
    {
        try
        {
            blackBishop = ImageIO.read(getClass().getResourceAsStream("/pieces/blackBishop.png"));
            blackKing = ImageIO.read(getClass().getResourceAsStream("/pieces/blackKing.png"));
            blackKnight = ImageIO.read(getClass().getResourceAsStream("/pieces/blackKnight.png"));
            blackPawn = ImageIO.read(getClass().getResourceAsStream("/pieces/blackPawn.png"));
            blackQueen = ImageIO.read(getClass().getResourceAsStream("/pieces/blackQueen.png"));
            blackRook = ImageIO.read(getClass().getResourceAsStream("/pieces/blackRook.png"));
            whiteBishop = ImageIO.read(getClass().getResourceAsStream("/pieces/whiteBishop.png"));
            whiteKing = ImageIO.read(getClass().getResourceAsStream("/pieces/whiteKing.png"));
            whiteKnight = ImageIO.read(getClass().getResourceAsStream("/pieces/whiteKnight.png"));
            whitePawn = ImageIO.read(getClass().getResourceAsStream("/pieces/whitePawn.png"));
            whiteQueen = ImageIO.read(getClass().getResourceAsStream("/pieces/whiteQueen.png"));
            whiteRook = ImageIO.read(getClass().getResourceAsStream("/pieces/whiteRook.png"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
