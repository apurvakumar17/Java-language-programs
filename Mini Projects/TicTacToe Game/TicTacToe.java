import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TicTacToe");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        final int minHeight = 380;
        final int minWidth = 330;
        frame.setMinimumSize(new Dimension(minWidth, minHeight));
        frame.setVisible(true);

        textfield.setBackground(new Color(40, 71, 119));
        textfield.setForeground(new Color(214, 227, 255));
        textfield.setFont(new Font("Arial",Font.PLAIN, 20));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TicTacToe");
        textfield.setOpaque(true);
        textfield.setBorder(new EmptyBorder(5, 0, 5, 0));

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0 , 500, 500);

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 50));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(218, 226, 249));
        }

        frame.add(button_panel);

        firstTurn();
    }

    boolean tieAllow = true;
    boolean gameOver = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (Objects.equals(buttons[i].getText(), "")) {
                        buttons[i].setForeground(new Color(186, 26, 26));
                        buttons[i].setBackground(new Color(255, 218, 214));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("Player O turn");
                        check();
                        tieCase();
                    }
                } else {
                    if (Objects.equals(buttons[i].getText(), "")) {
                        buttons[i].setForeground(new Color(29, 187, 27));
                        buttons[i].setBackground(new Color(215, 255, 214));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("Player X turn");
                        check();
                        tieCase();
                    }
                }
            }
        }
    }

    public void firstTurn() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("Player X turn");
        } else {
            player1_turn = false;
            textfield.setText("Player O turn");
        }
    }

    public void check() {
        // Check X win conditions
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[1].getText(), "X")) &&
                (Objects.equals(buttons[2].getText(), "X")))
        {
            xWins(0, 1, 2);
        }
        if ((Objects.equals(buttons[3].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[5].getText(), "X")))
        {
            xWins(3, 4, 5);
        }
        if ((Objects.equals(buttons[6].getText(), "X")) &&
                (Objects.equals(buttons[7].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X")))
        {
            xWins(6, 7, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[3].getText(), "X")) &&
                (Objects.equals(buttons[6].getText(), "X")))
        {
            xWins(0, 3, 6);
        }
        if ((Objects.equals(buttons[1].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[7].getText(), "X")))
        {
            xWins(1, 4, 7);
        }
        if ((Objects.equals(buttons[2].getText(), "X")) &&
                (Objects.equals(buttons[5].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X")))
        {
            xWins(2, 5, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X")))
        {
            xWins(0, 4, 8);
        }
        if ((Objects.equals(buttons[2].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[6].getText(), "X")))
        {
            xWins(2, 4, 6);
        }

        // Check O win conditions
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[1].getText(), "O")) &&
                (Objects.equals(buttons[2].getText(), "O")))
        {
            oWins(0, 1, 2);
        }
        if ((Objects.equals(buttons[3].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[5].getText(), "O")))
        {
            oWins(3, 4, 5);
        }
        if ((Objects.equals(buttons[6].getText(), "O")) &&
                (Objects.equals(buttons[7].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O")))
        {
            oWins(6, 7, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[3].getText(), "O")) &&
                (Objects.equals(buttons[6].getText(), "O")))
        {
            oWins(0, 3, 6);
        }
        if ((Objects.equals(buttons[1].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[7].getText(), "O")))
        {
            oWins(1, 4, 7);
        }
        if ((Objects.equals(buttons[2].getText(), "O")) &&
                (Objects.equals(buttons[5].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O")))
        {
            oWins(2, 5, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O")))
        {
            oWins(0, 4, 8);
        }
        if ((Objects.equals(buttons[2].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[6].getText(), "O")))
        {
            oWins(2, 4, 6);
        }
    }

    public void xWins(int a, int b, int c) {
        afterWin(a, b, c);
        tieAllow = false;
        textfield.setText("Player X wins");
    }

    public void oWins(int a, int b, int c) {
        afterWin(a, b, c);
        tieAllow = false;
        textfield.setText("Player O wins");
    }

    public void tieCase() {
        int filled = 0;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText() != "") {
                filled++;
            }
        }
        if (filled == 9 && tieAllow) {
            for (int i = 0; i < 9; i++) {
                buttons[i].setEnabled(false);
            }
            textfield.setText("Tie!!");
        }


    }

    private void afterWin(int a, int b, int c) {
        buttons[a].setBackground(new Color(248, 226, 137));
        buttons[b].setBackground(new Color(248, 226, 137));
        buttons[c].setBackground(new Color(248, 226, 137));

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

    }

    public void restartGame() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(true);
            buttons[i].setBackground(new Color(218, 226, 249));
            buttons[i].setText("");
        }
        textfield.setText("Tic Tac Toe");
        firstTurn();

    }

}
