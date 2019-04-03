import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface() throws HeadlessException {
        setupFrame();
    }

    public void setupFrame(){
        setTitle("Key Barricade");
        setSize(new Dimension(800, 800));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void reset() {

    }

}