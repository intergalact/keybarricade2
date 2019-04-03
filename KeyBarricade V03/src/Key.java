/* If the player is not carrying a key and walks onto this tile, the key is transferred to
   the player's inventory and the key is taken off the map */
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.Math;
public class Key extends Tile {

    private BufferedImage keyIcon;
    private int pinCode;
    private Barricade barricade; //associatie  <- Don't think this is needed tbh

    public Key(int coordX, int coordY/*int pinCode*/) {
        super(coordX, coordY, "./images/key.png");
//        this.pinCode = pinCode;
    }

    public String getType() {
        // There's definitely a better way to do this
        return "Key";
    }

    // Give what picks this key up the key
    public Key pickUp(){
        // Hide
        // Set to regular tile image
//        try {
//            setImageIcon(ImageIO.read(new File("./images/key.png")));
//        } catch (Exception e) {
//            setImageIcon(null);
//            System.err.println(e.toString()+" (Key)");
//        }
        return this;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
