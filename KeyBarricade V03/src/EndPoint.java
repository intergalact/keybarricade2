public class EndPoint extends Tile {

    private Map map;

    public EndPoint(int coordX, int coordY) {
        super(coordX, coordY,"./images/endpoint.png");
    }

    // Might be a good idea to have the engine (map)
    // handle this.
    public void win(){
        if (map.getPlayer().getCoordX() == this.getCoordX() && map.getPlayer().getCoordY() == this.getCoordY()){

        }
    }

    @Override
    public void move() {

    }
}