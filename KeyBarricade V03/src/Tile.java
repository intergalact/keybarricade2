import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile {

    private int coordX;
    private int coordY;
    private static BufferedImage imageIcon;
    private static final int LENGTH = 5;
    private static final int WIDTH = 5;

    public Tile(int X, int Y) {
        coordX = X;
        coordY = Y;
        setImageIcon("./images/tile.png");
    }

    public static void setImageIcon(String imagePath) {
        if(imageIcon == null){
            try {
                imageIcon = (ImageIO.read(new File(imagePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
