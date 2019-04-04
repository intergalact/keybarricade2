import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Map extends JPanel {

    private static int DIMENSION = 600;
    private static int LEVELDIM = 10; //nr of rows and columns
    private Tile[][] mapLetters;
    private Player p;
    private EndPoint e;

    public Map() {
        mapLetters = new Tile[LEVELDIM][LEVELDIM];
        start();
        // Add KeyListener
        setFocusable(true);
        addKeyListener(getPlayer());
    }

    public static void main(String[] args) {
        new Interface();
    }

/*Files.readAllLines() returns a List of Strings. For every String in level1-letters,
turn the String into an array of characters. For every character, check which letter it is
and fill the map with the corresponding GamePiece.
 */
    public void fillMapLetters(Path level){
        try {
            int row = 0;
            for (String s : Files.readAllLines(level)) {
                int column = 0;
                for (char ch : s.toCharArray()) {
                    switch (ch){
                        case 't':
                            mapLetters[row][column] = new Empty(row,column, 3);
                            break;
                        case 'p':
                            p = new Player(row,column, 8);
                            mapLetters[row][column] = p;
                            break;
                        case 'K':
                            mapLetters[row][column] = new Key(row,column,5);
                            break;
                        case 'k':
                            mapLetters[row][column] = new Key(row,column,6);
                            break;
                        case '2':
                            mapLetters[row][column] = new Key(row,column, 7);
                            break;
                        case 'B':
                            mapLetters[row][column] = new Barricade(row,column,0);
                            break;
                        case 'b':
                            mapLetters[row][column] = new Barricade(row,column, 1);
                            break;
                        case '1':
                            mapLetters[row][column] = new Barricade(row,column, 2);
                            break;
                        case 'w':
                            mapLetters[row][column] = new Wall(row,column, 9);
                            break;
                        case 'e':
                            e = new EndPoint(row,column, 4);
                            mapLetters[row][column] = e;
                            break;
                    }
                    column++;
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        fillMapLetters(Paths.get("level1-letters"));
    }

    public boolean win(){
        boolean won = false;
        if  (getPlayer().getCoordX() == getEndPoint().getCoordX() && getPlayer().getCoordY() == getEndPoint().getCoordY())
            won = true;
        else
            won = false;
        return won;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = 0, y = 0;

        for (int i = 0; i < getLEVELDIM(); i++) {
            for (int j = 0; j < getLEVELDIM(); j++) {
                g.drawImage(getMapLetters()[i][j].getImageIcon(), x, y, this);
                x+=60;
            }
            x=0;
            y+=60;
        }
    }

    public static int getLEVELDIM() {
        return LEVELDIM;
    }

    public Tile[][] getMapLetters() {
        return mapLetters;
    }

    public static int getDIMENSION() {
        return DIMENSION;
    }

    public Player getPlayer() {
        return p;
    }

    public EndPoint getEndPoint() {
        return e;
    }
}