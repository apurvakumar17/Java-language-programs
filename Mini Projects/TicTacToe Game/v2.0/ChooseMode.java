import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ChooseMode implements ActionListener {
    ChooseMode() {
        JPanel title_panel = new JPanel();
        JPanel button_panel = new JPanel(new GridBagLayout()); // Use GridBagLayout

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Choose Mode");
        frame.setSize(250, 250);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setLayout(new BorderLayout());
        frame.setMinimumSize(new Dimension(350, 250));
        frame.setLocationRelativeTo(null);

        JLabel textfield = new JLabel();
        textfield.setBackground(new Color(40, 71, 119));
        textfield.setForeground(new Color(214, 227, 255));
        textfield.setFont(new Font("Arial", Font.PLAIN, 20));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Choose Mode of TicTacToe");
        textfield.setOpaque(true);
        textfield.setBorder(new EmptyBorder(5, 0, 5, 0));

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 500, 50);
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);

        button_panel.setBackground(new Color(255, 255, 255));

        JButton PvP = new JButton("Player vs Player");
        JButton PvC = new JButton("Bot vs Player");

        Dimension buttonSize = new Dimension(200, 50);
        PvP.setPreferredSize(buttonSize);
        PvC.setPreferredSize(buttonSize);

        PvP.setFont(new Font("Arial", Font.BOLD, 20));
        PvP.setFocusable(false);
        PvP.addActionListener(this);
        PvP.setBackground(new Color(218, 226, 249));
        PvP.setForeground(new Color(40, 71, 119));

        PvC.setFont(new Font("Arial", Font.BOLD, 20));
        PvC.setFocusable(false);
        PvC.addActionListener(this);
        PvC.setBackground(new Color(218, 226, 249));
        PvC.setForeground(new Color(40, 71, 119));

        // GridBagConstraints for centering buttons
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 20, 0); // Spacing between buttons
        gbc.anchor = GridBagConstraints.CENTER;

        button_panel.add(PvP, gbc);

        gbc.gridy = 1; // Move to the next row
        button_panel.add(PvC, gbc);

        frame.add(button_panel, BorderLayout.CENTER);

        frame.setVisible(true);

    }
    String mode = "Player vs Player";
    @Override
    public void actionPerformed(ActionEvent e) {
        mode = e.getActionCommand();
    }

    public static void main(String[] args) {
        new ChooseMode();
    }
}
