import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.nio.file.Paths;

public class Interface extends JFrame {

    Map map;

    public Interface() throws HeadlessException {
        setupFrame();
        addComponents();
        setVisible(true);
    }

    public void setupFrame(){
        setTitle("Key Barricade");
        setSize(new Dimension(600, 700));
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void addComponents(){
        map = new Map();
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridwidth = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.BOTH;
        add(map, gc);

        JPanel panelChooseLevel = new JPanel(new GridLayout(3,1));

        //create buttons and fill panelChooseLevel
        JRadioButton buttonLevel1 = new JRadioButton("Level 1");
        JRadioButton buttonLevel2 = new JRadioButton("Level 2");
        JRadioButton buttonLevel3 = new JRadioButton("Level 3");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonLevel1);
        panelChooseLevel.add(buttonLevel1);
        buttonGroup.add(buttonLevel2);
        panelChooseLevel.add(buttonLevel2);
        buttonGroup.add(buttonLevel3);
        panelChooseLevel.add(buttonLevel3);

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

        JPanel panelReset = new JPanel(new GridLayout());
        JRadioButton buttonReset = new JRadioButton("Reset");
        panelReset.add(buttonReset);

        gc.weightx = 0;
        gc.weighty = 0;
        gc.gridx = 0;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.anchor = GridBagConstraints.LINE_START;
        add(panelChooseLevel, gc);
//        gc.weightx = GridBagConstraints.REMAINDER;
//        gc.weighty = GridBagConstraints.REMAINDER;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        gc.gridx = 1;
        gc.gridy = 1;
//        gc.anchor = GridBagConstraints.LINE_START;
        add(panelReset, gc);
    }

    public void reset() {

    }

}