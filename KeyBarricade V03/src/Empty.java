public class Empty extends Tile{

    public Empty(int coordX, int coordY){
        super(coordX,coordY,"./images/empty.png");
    }

    @Override
    public void move() { }
}
