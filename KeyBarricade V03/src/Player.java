import java.awt.event.KeyEvent;

public class Player extends Tile {

    private static final int UP     = KeyEvent.VK_UP;     // move up
    private static final int RIGHT  = KeyEvent.VK_RIGHT;    // move right
    private static final int DOWN   = KeyEvent.VK_DOWN;   // move down
    private static final int LEFT   = KeyEvent.VK_LEFT;   // move left

    private int playerDirection = KeyEvent.VK_UP;

    private int previousPlayerX;
    private int previousPlayerY;
    private int playerCoordX;
    private int playerCoordY;


    private boolean hasKey = false;
    private int keyCode = -1;

    private Key key;                // associatie

    private Barricade barricade;    // associatie

    public Player(int coordX, int coordY) {
        super(coordX, coordY, "./images/player.png");
        this.playerCoordX = coordX;
        this.playerCoordY = coordY;

    }

    //put playerDirection cases under keylistener or jbutton actionlistener in interface
    public void move(){
        switch (playerDirection){
            case UP:
                playerCoordY++;                     //change current location
                previousPlayerY = playerCoordY--;   //store last location in case of invalid move
                break;
            case RIGHT:
                playerCoordX++;
                previousPlayerX = playerCoordX--;
                break;
            case DOWN:
                playerCoordY--;
                previousPlayerY = playerCoordY++;
                break;
            case LEFT:
                playerCoordX--;
                previousPlayerX = playerCoordX++;
                break;
        }
    }


    public void pickUpKey() {
        if ((this.playerCoordX == key.getCoordX()) && (this.playerCoordY == key.getCoordY())){
            this.keyCode = key.getPinCode();
            hasKey = true;
            key.standOn();
        }

    }
    public void useKey() {
        barricade.standOn();
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getPreviousPlayerX() {
        return previousPlayerX;
    }

    public int getPreviousPlayerY(){
        return previousPlayerY;
    }
}