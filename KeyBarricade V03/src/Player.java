/* Player needs to be able to move one tile up/down/left/right at a time
*  If there is an obstacle the player should remain at the same spot
*       > If the player is stopped by a barricade, attempt to unlock the barricade
*  Player can carry one key
*  Keys can be used multiple times
*
* */

import java.awt.image.BufferedImage;

public class Player extends Tile {
    private boolean hasKey;
    private Barricade barricade; //associatie
    // Changed for verbosity's sake
    private Key keyInPocket = null;

    public Player(int coordX, int coordY) {
        super(coordX, coordY, "./images/player.png");
    }

//    public void pickUpKey(Key keyFromFloor){
//        keyInPocket = keyFromFloor.pickUp();
//    }
//
//    public void move(int X, int Y) {
//        this.setCoordX(X);
//        this.setCoordY(Y);
//    }
//
//    public String getType() {
//        // There's definitely a better way to do this
//        return "Player";
//    }
//
//    public void useKey(){
//
//    }
}
