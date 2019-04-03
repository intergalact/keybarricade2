import java.awt.image.BufferedImage;

/* Barricade starts locked
*  Barricade disappears if not locked
* */
public class Barricade extends Tile {

    private BufferedImage barricadeIcon;
    private int pinCode;
    // The barricade should be locked when the game starts
    private boolean locked = true;

    public Barricade(int coordX, int coordY) {
        super(coordX, coordY, "./images/barricade.png");
        // The barricade needs a pin code generated the same way as the key's code
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
