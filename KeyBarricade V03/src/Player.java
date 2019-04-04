import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Tile implements KeyListener {

    private static final int UP     = KeyEvent.VK_UP;     // move up
    private static final int RIGHT  = KeyEvent.VK_RIGHT;    // move right
    private static final int DOWN   = KeyEvent.VK_DOWN;   // move down
    private static final int LEFT   = KeyEvent.VK_LEFT;   // move left

    private int direction = KeyEvent.VK_UP;

    private boolean hasKey = false;
    private int keyCode = -1;

    private Key key;                // association
    private Barricade barricade;    // association

    public Player(int coordX, int coordY, int iconNum) {
        super(coordX, coordY, iconNum);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode){
            case RIGHT:
//                map.move();
                break;
            case KeyEvent.VK_Q:
                System.exit(0);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //put direction cases under keylistener

    public void move(){
//        switch (direction){
//            case UP:
//                previousPlayerY = playerCoordY;         //store last location in case of invalid move
//                playerCoordY++;                         //change current location
//                break;
//            case RIGHT:
//                playerCoordX++;
//                previousPlayerX = playerCoordX--;
//                break;
//            case DOWN:
//                playerCoordY--;
//                previousPlayerY = playerCoordY++;
//                break;
//            case LEFT:
//                playerCoordX--;
//                previousPlayerX = playerCoordX++;
//                break;
//        }
    }

//    public void pickUpKey() {
//        if ((this.playerCoordX == key.getCoordX()) && (this.playerCoordY == key.getCoordY())){
//            this.keyCode = key.getPinCode();
//            hasKey = true;
//            key.standOn();
//        }
//
//    }

//    public void useKey() {
//        barricade.standOn();
//    }

    public int getKeyCode() {
        return keyCode;
    }
}