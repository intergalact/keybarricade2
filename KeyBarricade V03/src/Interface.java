import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.nio.file.Paths;

public class Interface extends JFrame {

    private Map map;

    public Interface() throws HeadlessException {
        setupFrame();
        addComponents();
        setVisible(true);
    }

    public void setupFrame(){
        setTitle("Key Barricade");
        setSize(new Dimension(600, 730));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void addComponents(){
        // Create panels
        map = new Map();
        JPanel panelChooseLevel = new JPanel(new GridLayout(3,1));
        JPanel panelReset = new JPanel();
        map.setBounds(0,0,600,600);
        panelChooseLevel.setBounds(0,600,300,100);
        panelReset.setBounds(300,600,300,100);

        // Create buttons
        JRadioButton buttonLevel1 = new JRadioButton("Level 1");
        JRadioButton buttonLevel2 = new JRadioButton("Level 2");
        JRadioButton buttonLevel3 = new JRadioButton("Level 3");
        JRadioButton buttonReset = new JRadioButton("Reset");

        // Add buttons to panels
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonLevel1);
        buttonGroup.add(buttonLevel2);
        buttonGroup.add(buttonLevel3);
        panelChooseLevel.add(buttonLevel1);
        panelChooseLevel.add(buttonLevel2);
        panelChooseLevel.add(buttonLevel3);
        panelReset.add(buttonReset);

        // Add ActionListeners
        buttonLevel1.addActionListener((ActionEvent e) -> {
            map.fillMapLetters(Paths.get("level1-letters"));
            map.repaint();
        });

        buttonLevel2.addActionListener((ActionEvent e) -> {
            map.fillMapLetters(Paths.get("level2-letters"));
            map.repaint();
        });

        buttonLevel3.addActionListener((ActionEvent e) -> {
            map.fillMapLetters(Paths.get("level3-letters"));
            map.repaint();
        });

        buttonReset.addActionListener((ActionEvent e) -> {
            reset();
        });

        // Add panels to frame
        add(map);
        add(panelChooseLevel);
        add(panelReset);
    }

    public void reset() {
        //TODO write reset action
    }

}