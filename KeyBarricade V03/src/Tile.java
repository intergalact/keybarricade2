import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public abstract class Tile {

    // Convert to Enum later
    private static final int BARRICADE10 = 0;
    private static final int BARRICADE20 = 1;
    private static final int BARRICADE30 = 2;
    private static final int EMPTY = 3;
    private static final int ENDPOINT = 4;
    private static final int KEY10 = 5;
    private static final int KEY20 = 6;
    private static final int KEY30 = 7;
    private static final int PLAYER = 8;
    private static final int WALL = 9;

    private int coordX;
    private int coordY;
    private int iconNum;
    private static java.util.Map<Integer, BufferedImage> loaded = new HashMap<>();


    public Tile(int X, int Y, int iconNum) {
        coordX = X;
        coordY = Y;
        this.iconNum = iconNum;
        if (!loaded.containsKey(iconNum))
            loaded.put(iconNum, setImageIcon(iconNum));
    }

    public static BufferedImage setImageIcon(int iconNum) {
        String imagePath = "./images/barricade10.png";
        switch(iconNum){
            case BARRICADE10:
                imagePath = "./images/barricade10.png";
                break;
            case BARRICADE20:
                imagePath = "./images/barricade20.png";
                break;
            case BARRICADE30:
                imagePath = "./images/barricade30.png";
                break;
            case EMPTY:
                imagePath = "./images/empty.png";
                break;
            case ENDPOINT:
                imagePath = "./images/endpoint.png";
                break;
            case KEY10:
                imagePath = "./images/key10.png";
                break;
            case KEY20:
                imagePath = "./images/key20.png";
                break;
            case KEY30:
                imagePath = "./images/key30.png";
                break;
            case PLAYER:
                imagePath = "./images/player.png";
                break;
            case WALL:
                imagePath = "./images/wall.png";
                break;
        }

        BufferedImage imageIcon;
            try {
                imageIcon = (ImageIO.read(new File(imagePath)));
            } catch (IOException e) {
                throw new RuntimeException();
            }
        return imageIcon;
    }

    public BufferedImage getImageIcon() {
        return loaded.get(iconNum);
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

    public abstract void move();
}
