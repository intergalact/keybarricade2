// A regular wall. Doesn't move, doesn't disappear and isn't much fun to be around at parties
public class Wall extends Tile {

    public Wall(int coordX, int coordY, int iconNum) {
        super(coordX, coordY, iconNum); }

    // The engine should decide if the player is blocked or not
    public void blockPlayer(){

    }

    @Override
    public void move() {

    }
}
