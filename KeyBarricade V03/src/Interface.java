import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    public Interface() throws HeadlessException {
        setupFrame();
        addComponents();
        setVisible(true);
    }

    public void setupFrame(){
        setTitle("Key Barricade");
        setSize(new Dimension(600, 700));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void addComponents(){
        add(new Map());
    }

    public void reset() {

    }

}