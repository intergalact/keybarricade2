import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Map {

    private static final int LENGTH = 200;
    private static final int WIDTH = 200;
//    private Tile tile; //associatie
//    private Interface anInterface;
    private Tile[][] mapLetters;
    private static final int LEVELDIM = 10; //nr of rows and columns

    public Map() {
        mapLetters = new Tile[LEVELDIM][LEVELDIM];
    }

    public static void main(String[] args) {
        new Player(2,2);
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
                            mapLetters[row][column] = new Tile(row,column);
                            break;
                        case 'p':
                            mapLetters[row][column] = new Player(row,column);
                            break;
                        case 'k':
                            mapLetters[row][column] = new Key(row,column);
                            break;
                        case 'b':
                            mapLetters[row][column] = new Barricade(row,column);
                            break;
                        case 'w':
                            mapLetters[row][column] = new Wall(row,column);
                            break;
                        case 'e':
                            mapLetters[row][column] = new EndPoint(row,column);
                            break;
                    }
                    System.out.println("Op plek (" + row + "," + column + ") komt een " + ch);
                    column++;
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int getLEVELDIM() {
        return LEVELDIM;
    }

    public Tile[][] getMapLetters() {
        return mapLetters;
    }
}