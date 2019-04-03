/* Barricade starts locked
*  Barricade disappears if not locked
* */
public class Barricade extends Tile {

    private Player player;
    private int pinCode;
    // The barricade should be locked when the game starts
    private boolean locked = true;

    public Barricade(int coordX, int coordY, int pinCode) {
        super(coordX, coordY, "./images/barricade.png");
        this.pinCode = pinCode;
    }

    public void open(){

    }

    public void standOn() {
        //add code to check player.keycode with barricade.keycode open/remove barricade
        if (this.pinCode != player.getKeyCode()) {
            player.setCoordX(player.getPreviousPlayerX());
            player.setCoordY(player.getPreviousPlayerY());
        }

    }

    // Old code below, might be usable
    public boolean attemptUnlock(int pin) {
        // Returns a boolean so whatever calls this
        // can see if it worked or not
        if (pin == pinCode) {
            // It worked so the barricade can be unlocked
            locked = false;
            // Switch
            return true;
        } else {
            return false;
        }
    }
}
