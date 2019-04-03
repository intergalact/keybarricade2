/* If the player is not carrying a key and walks onto this tile, the key is transferred to
   the player's inventory and the key is taken off the map */

public class Key extends Tile {

    private int pinCode;
    private Barricade barricade; //associatie  <- Don't think this is needed tbh (mweya)
    private Player player;
    private int coordX;
    private int coordY;

    public Key(int coordX, int coordY, int pinCode) {
        super(coordX, coordY, "./images/key.png");
        this.pinCode = pinCode;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void pickedUp(){

    }

    public int getPinCode(){
        return pinCode;
    }

    public void standOn(){
        if((this.coordX == player.getCoordX()) && (this.coordY == player.getCoordY())){
            // add code for player standOn key tile

        }
    }
}
