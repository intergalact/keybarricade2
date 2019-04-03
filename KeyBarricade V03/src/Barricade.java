import java.awt.image.BufferedImage;

/* Barricade starts locked
*  Barricade disappears if not locked
* */
public class Barricade extends Tile {

    private BufferedImage barricadeIcon;
    private int pinCode;
    // The barricade should be locked when the game starts
    private boolean locked = true;

    public Barricade(int coordX, int coordY, int pinCode) {
        super(coordX, coordY, "./images/barricade.png");
        this.pinCode = pinCode;
    }

    public String getType() {
        // There's definitely a better way to do this
        return "Barricade";
    }

    public void open(){

    }

    public boolean attemptUnlock(int pin) {
        // Returns a boolean so whatever calls this
        // can see if it worked or not
        if (pin == pinCode) {
            // It worked so the barricade can be unlocked
            locked = false;
            // Change the image to that of a regular tile
//            try {
//                super.setImageIcon(ImageIO.read(new File("./images/Wall0.png")));
//            } catch (Exception e) {
//                super.setImageIcon(null);
//                System.err.println(e.toString()+" (Barricade)");
//            }
            return true;
        } else {
            return false;
        }
    }
}
