import javax.imageio.ImageIO;
import java.io.File;

// A regular wall. Doesn't move, doesn't disappear and isn't much fun to be around at parties
public class Wall extends Tile {

    public String getType() {
        // There's definitely a better way to do this
        return "Wall";
    }

    public Wall(int coordX, int coordY) {
        super(coordX, coordY);
        // Set image
//        try {
//            super.setImageIcon(ImageIO.read(new File("./images/wall.png")));
//        } catch (Exception e) {
//            super.setImageIcon(null);
//            System.err.println(e.toString()+" (Wall)");
//        }
    }

    // The engine should decide if the player is blocked or not
    public void blockPlayer(){

    }
}
