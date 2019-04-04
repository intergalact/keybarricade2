/* If the player is not carrying a key and walks onto this tile, the key is transferred to
   the player's inventory and the key is taken off the map */

public class Key extends Tile {

    private Barricade barricade; //associatie  <- Don't think this is needed tbh (mweya)
    private Player player;

    public Key(int coordX, int coordY, int iconNum) {
        super(coordX, coordY, iconNum);
    }

    public void pickedUp(){

    }

    public void standOn(){
        if((this.getCoordX() == player.getCoordX()) && (this.getCoordY() == player.getCoordY())){
            // add code for player standOn key tile

        }
    }

    @Override
    public void move() { }
}
