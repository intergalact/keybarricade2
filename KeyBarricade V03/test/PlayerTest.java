import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player p = new Player(3,5,8);

    @Test
    public void coordinateXTest(){
        assertEquals(3, p.getCoordX());
    }

    @Test
    public void coordinateYTest(){
        assertEquals(5, p.getCoordY());
    }

    //Conclusion: there is no need for a playerCoordX and a playerCoordY,
    //because the player inherits get/set coordX and Y from superclass Tile.
}