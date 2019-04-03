import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Tile {

    private int coordX;
    private int coordY;
    private static final int LENGTH = 5;
    private static final int WIDTH = 5;

    private String path;
    private static java.util.Map<String, BufferedImage> loaded = new HashMap<>();


    public Tile(int X, int Y, String path) {
        coordX = X;
        coordY = Y;
        this.path = path;
        if (!loaded.containsKey(path))
            loaded.put(path, setImageIcon(path));
    }

    public static BufferedImage setImageIcon(String imagePath) {
        BufferedImage imageIcon;
            try {
                imageIcon = (ImageIO.read(new File(imagePath)));
            } catch (IOException e) {
                throw new RuntimeException();
            }
        return imageIcon;
    }

    public BufferedImage getImageIcon() {
        return loaded.get(path);
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
}
