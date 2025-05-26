import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.sound.sampled.*;
import java.io.*;

class BlockData {
    String name;
    Icon icon;

    BlockData(String name, Icon icon) {
        this.name = name;
        this.icon = icon;
    }
}

public class Level implements ActionListener {
    JFrame frame = new JFrame();
    JButton[] buttons = new JButton[100];
    JPanel title_panel = new JPanel();
    JLabel textfield = new JLabel();
    JPanel button_panel = new JPanel();
    Icon block;

    String[] filenames = new String[5];

    String block1;
    String block2;
    Integer t1 = null;
    Integer t2 = null;
    Random randomt = new Random();
    Boolean onGoingSwap = false;
    int s1;
    int s2;

    Level(String mode) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Block Crush");
        frame.setSize(500, 550);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        final int minHeight = 380;
        final int minWidth = 330;
        frame.setMinimumSize(new Dimension(minWidth, minHeight));
        frame.setVisible(true);

        textfield.setBackground(new Color(214, 227, 255));
        textfield.setForeground(new Color(40, 71, 119));
        textfield.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setOpaque(true);
        textfield.setBorder(new EmptyBorder(5, 0, 5, 0));

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 500, 50);
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);

        button_panel = new ImagePanel("background.jpg"); // your image path
        button_panel.setLayout(new GridLayout(10, 10));
        button_panel.setBackground(new Color(150, 150, 150));

        if (mode.equals("minecraft")) {
            filenames[0] = "redstone.png";
            filenames[1] = "iron.png";
            filenames[2] = "gold.png";
            filenames[3] = "lapiz.png";
            filenames[4] = "emerald.png";
        } else if (mode.equals("shapy")) {
            filenames[0] = "yellow.png";
            filenames[1] = "purple.png";
            filenames[2] = "blue.png";
            filenames[3] = "red.png";
            filenames[4] = "green.png";
        }

        for (int i = 0; i < 100; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 50));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(218, 226, 249));
            BlockData blockData = randomBlockPNG();
            buttons[i].setIcon(blockData.icon);
            buttons[i].setActionCommand(blockData.name); // Store block type
        }
        frame.add(button_panel);

        // FIX: Generate targets before using them
        generateTarget();

        // Replace double call with loop
        while (checkCombinations());

        // Show target text
        textfield.setText(getTargetText());

        Timer changetimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                textfield.setText(getTargetText());
            }
        });
        changetimer.setRepeats(false);
        changetimer.start();
    }

    void generateTarget() {
        block1 = fixNAME(filenames[randomt.nextInt(filenames.length)]);
        block2 = block1;
        while (block1.equals(block2)) {
            block2 = fixNAME(filenames[randomt.nextInt(filenames.length)]);
        }
        t1 = 20 + randomt.nextInt(50);
        t2 = 20 + randomt.nextInt(50);
    }

    String getTargetText() {
        if (t1 == 0 && t2 == 0) {
            return "Wonderful! Level Complete!";
        }
        return "Your Target: " + block1 + ": " + t1 + " & " + block2 + ": " + t2;
    }

    String fixNAME(String s) {
        return s.substring(0, s.indexOf(".")).toUpperCase();
    }

    boolean checkCombinations() {
        int combiButtons[] = new int[3];
        boolean matchFound = false;
        for (int i = 0; i < 100; i++) {
            String curr = buttons[i].getActionCommand();
            if (i % 10 <= 7) {
                if (curr.equals(buttons[i + 1].getActionCommand()) &&
                        curr.equals(buttons[i + 2].getActionCommand())) {
                    combiButtons[0] = i;
                    combiButtons[1] = i + 1;
                    combiButtons[2] = i + 2;
                    fix(combiButtons);
                    matchFound = true;
                }
            }
            if (i <= 79) {
                if (curr.equals(buttons[i + 10].getActionCommand()) &&
                        curr.equals(buttons[i + 20].getActionCommand())) {
                    combiButtons[0] = i;
                    combiButtons[1] = i + 10;
                    combiButtons[2] = i + 20;
                    fix(combiButtons);
                    matchFound = true;
                }
            }
        }
        return matchFound;
    }

    void fix(int[] combiButtons) {
        for (int j : combiButtons) {
            String tempBlock = fixNAME(buttons[combiButtons[0]].getActionCommand());
            if (tempBlock.equals(block1)) {
                t1 -= combiButtons.length;
                t1 = Math.max(0, t1);
            } else if (tempBlock.equals(block2)) {
                t2 -= combiButtons.length;
                t2 = Math.max(0, t2);
            }
            textfield.setText(getTargetText());
            BlockData blockData = randomBlockPNG();
            buttons[j].setIcon(blockData.icon);
            buttons[j].setActionCommand(blockData.name);
        }
    }

    BlockData randomBlockPNG() {
        Random random = new Random();
        int idx = random.nextInt(filenames.length);
        ImageIcon originalIcon = new ImageIcon(filenames[idx]);
        Image scaledImage = originalIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        return new BlockData(filenames[idx], new ImageIcon(scaledImage));
    }

    BlockData blockPNG(String ico) {
        ImageIcon originalIcon = new ImageIcon(ico);
        Image scaledImage = originalIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        return new BlockData(ico, new ImageIcon(scaledImage));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 100; i++) {
            if (e.getSource() == buttons[i]) {
                if (!onGoingSwap) {
                    s1 = i;
                    buttons[i].setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                    buttons[i].setBackground(new Color(255, 218, 214));
                    onGoingSwap = true;
                } else {
                    boolean validSwap =
                            (i == s1 + 1 && s1 % 10 != 9) ||
                            (i == s1 - 1 && s1 % 10 != 0) ||
                            (i == s1 + 10 || i == s1 - 10);
                    if (validSwap) {
                        s2 = i;
                        buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));

                        Timer swaptimer = new Timer(100, evt -> adjSwap());
                        swaptimer.setRepeats(false);
                        swaptimer.start();

                        onGoingSwap = false;

                        Timer timer = new Timer(500, evt -> {
                            boolean destroyed = checkCombinations();
                            if (destroyed) {
                                playSound("destroy.wav");
                            }
                            checkCombinations();
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                }
            }
        }
    }

    void adjSwap() {
        String b2 = buttons[s1].getActionCommand();
        BlockData blockData = blockPNG(buttons[s2].getActionCommand());
        buttons[s1].setIcon(blockData.icon);
        buttons[s1].setActionCommand(blockData.name);

        blockData = blockPNG(b2);
        buttons[s2].setIcon(blockData.icon);
        buttons[s2].setActionCommand(blockData.name);

        playSound("swap.wav");

        Border defaultBorder = UIManager.getBorder("Button.border");
        buttons[s1].setBorder(defaultBorder);
        buttons[s2].setBorder(defaultBorder);
        buttons[s1].setBackground(new Color(218, 226, 249));
        buttons[s2].setBackground(new Color(218, 226, 249));
    }

    void playSound(String soundFileName) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(soundFileName));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
