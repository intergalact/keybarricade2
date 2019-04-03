import java.awt.image.BufferedImage;

public class EndPoint extends Tile {

    private BufferedImage endPointIcon;

    public EndPoint(int coordX, int coordY) {
        super(coordX, coordY,"./images/endpoint.png");
    }

//    public String getType() {
//        // There's definitely a better way to do this
//        return "End Point";
//    }

    // Might be a good idea to have the engine
    // handle this.
    public void win(){

    }


}
