// A regular wall. Doesn't move, doesn't disappear and isn't much fun to be around at parties
public class Wall extends Tile {

    public Wall(int coordX, int coordY) {
        super(coordX, coordY, "./images/wall.png"); }

    // The engine should decide if the player is blocked or not
    public void blockPlayer(){

    }
}
