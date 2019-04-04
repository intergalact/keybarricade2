import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Interface extends JFrame {

    private Map map;
    private Path currentLevel = Paths.get("level1-letters");

    public Interface() throws HeadlessException {
        setupFrame();
        addComponents();
        paneWin();
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
        map.setBounds(0,0,Map.getDIMENSION(),Map.getDIMENSION());
        panelChooseLevel.setBounds(0,600,300,100);
        panelReset.setBounds(300,600,300,100);

        // Create buttons
        JRadioButton buttonLevel1 = new JRadioButton("Level 1");
        JRadioButton buttonLevel2 = new JRadioButton("Level 2");
        JRadioButton buttonLevel3 = new JRadioButton("Level 3");
        JButton buttonReset = new JButton("Reset"); //TODO make buttonReset not-weird when pressed

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
            currentLevel = Paths.get("level1-letters");
            map.fillMapLetters(currentLevel);
            map.repaint();
//            addKeyListener(map.getPlayer());
//            map.setFocusable(true);
        });

        buttonLevel2.addActionListener((ActionEvent e) -> {
            currentLevel = Paths.get("level2-letters");
            map.fillMapLetters(currentLevel);
            map.repaint();
            map.setFocusable(true);
        });

        buttonLevel3.addActionListener((ActionEvent e) -> {
            currentLevel = Paths.get("level3-letters");
            map.fillMapLetters(currentLevel);
            map.repaint();
            map.setFocusable(true);
        });

        buttonReset.addActionListener((ActionEvent e) -> {
            reset();
            map.setFocusable(true);
        });

        // Add panels to frame
        add(map);
        add(panelChooseLevel);
        add(panelReset);
    }

    public void paneWin(){
        if (map.win()) {
            JOptionPane paneWin = new JOptionPane();
            add(paneWin);
        }
    }

    public void reset() {
        map.fillMapLetters(currentLevel);
        repaint();
    }

}