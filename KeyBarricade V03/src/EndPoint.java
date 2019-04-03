import javax.imageio.ImageIO;
import java.io.File;

/* Just a special tile. No interesting behaviour here */
public class EndPoint extends Tile {



    public EndPoint(int coordX, int coordY) {
        super(coordX, coordY);
        setImageIcon("./images/endpoint");
    }

    public String getType() {
        // There's definitely a better way to do this
        return "End Point";
    }

    // Might be a good idea to have the engine
    // handle this.
    public void win(){

    }
}
