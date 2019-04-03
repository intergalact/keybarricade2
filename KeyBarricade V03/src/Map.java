import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Map extends JPanel {

    private static final int LEVELDIM = 10; //nr of rows and columns
    private static final int LENGTH = 200;
    private static final int WIDTH = 200;
    private Tile[][] mapLetters;

    public Map() {
        mapLetters = new Tile[LEVELDIM][LEVELDIM];
        start();
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
                            mapLetters[row][column] = new Tile(row,column,"./images/tile.png");
                            break;
                        case 'p':
                            mapLetters[row][column] = new Player(row,column);
                            break;
                        case 'K':
                            mapLetters[row][column] = new Key(row,column,130);
                            break;
                        case 'k':
                            mapLetters[row][column] = new Key(row,column,290);
                            break;
                        case '2':
                            mapLetters[row][column] = new Key(row,column, 100);
                            break;
                        case 'B':
                            mapLetters[row][column] = new Barricade(row,column,130);
                            break;
                        case 'b':
                            mapLetters[row][column] = new Barricade(row,column, 290);
                            break;
                        case '1':
                            mapLetters[row][column] = new Barricade(row,column, 100);
                            break;
                        case 'w':
                            mapLetters[row][column] = new Wall(row,column);
                            break;
                        case 'e':
                            mapLetters[row][column] = new EndPoint(row,column);
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

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = 0;
        int y = 0;

        for (int i = 0; i < Map.getLEVELDIM(); i++) {
            for (int j = 0; j < Map.getLEVELDIM(); j++) {
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
}

//                        Pascals code met ASCII berekeningen
//
//                        case '2':case '3':
//                            mapLetters[row][column] = new Key(row,column, 100*(ch-'0'));
//                            break;