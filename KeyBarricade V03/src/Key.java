/* If the player is not carrying a key and walks onto this tile, the key is transferred to
   the player's inventory and the key is taken off the map */
import javax.imageio.ImageIO;
import java.io.File;
import java.lang.Math;
public class Key extends Tile {

    private int pinCode;
    private Barricade barricade; //associatie  <- Don't think this is needed tbh

    public Key(int coordX, int coordY) {
        super(coordX, coordY);
        setImageIcon("./images/key.png");
        // The key needs a pin code that seems to be a random number between 1 and 9 followed by
        // one or two zeros
        pinCode = (int) Math.random()*8 + 1;
        // Should we times the int by 10 or 100?
        int oneOrTwo = (int) Math.random()+1;
        if (oneOrTwo == 1) {
            pinCode = pinCode*10;
        } else {
            pinCode = pinCode*100;
        }
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
