import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

// A regular wall. Doesn't move, doesn't disappear and isn't much fun to be around at parties
public class Wall extends Tile {

    private BufferedImage wallImage;

    public String getType() {
        // There's definitely a better way to do this
        return "Wall";
    }

    public Wall(int coordX, int coordY) {
        super(coordX, coordY, "./images/wall.png"); }

    // The engine should decide if the player is blocked or not
    public void blockPlayer(){

    }
}
