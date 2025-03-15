import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class TicTacToe2 implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe2() {
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
                if (turn.equals("human")) {
                    if (Objects.equals(buttons[i].getText(), "")) {
                        buttons[i].setForeground(new Color(186, 26, 26));
                        buttons[i].setBackground(new Color(255, 218, 214));
                        buttons[i].setText(human_sign);
                        textfield.setText(bot_msg);
                        check();
                        tieCase();
                        turn = "bot";
                        callBot();
                    }
                }
            }
        }
    }

    private void callBot() {
        if (turn == "bot" && !gameOver) {
            int move = -1;
            if ((move = findWinningMove(bot_sign)) != -1) {
                // Computer's winning move
            } else if ((move = findWinningMove(human_sign)) != -1) {
                // Block player's winning move
            } else if ((move = takeCCS("center")) != -1) {
                // Be Smart and take center
            } else if ((move = takeCCS("corner")) != -1) {
                // Be Smart and take corner
            } else if ((move = takeCCS("side")) != -1) {
                // Be Smart and take  side
            }
 
            if (move == -1) { // If no WinningMove, pick a random move
                do {
                    move = random.nextInt(9);
                } while (!Objects.equals(buttons[move].getText(), ""));
            }

            buttons[move].setForeground(new Color(29, 187, 27));
            buttons[move].setBackground(new Color(215, 255, 214));
            buttons[move].setText(bot_sign);
            textfield.setText(human_msg);
            check();
            tieCase();
            turn = "human";
        } 
    }

    public int takeCCS(String pos) {
        if (pos.equals("center")) {
            if (Objects.equals(buttons[4].getText(), "")) {
                return 4;
            } else {
                return -1;
            }
        } else if (pos.equals("corner")) {
            int[] boxes = {0, 2, 6, 8};
            for (int i = 0; i < boxes.length; i++) {
                if (Objects.equals(buttons[boxes[i]], "")) {
                    return boxes[i];
                }
            }
        } else if (pos.equals("side")) {
            int[] boxes = {1, 3, 5, 7};
            for (int i = 0; i < boxes.length; i++) {
                if (Objects.equals(buttons[boxes[i]], "")) {
                    return boxes[i];
                }
            }
        }
        return -1;
        
    }
    public int findWinningMove(String player) {
        int[][] winCases = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6}             // Diagonals
        };
    
        for (int[] winCase : winCases) {
            String first = buttons[winCase[0]].getText();
            String second = buttons[winCase[1]].getText();
            String third = buttons[winCase[2]].getText();
    
            // Check if two spots are occupied by the player and one is empty
            if ((first.equals(player) && second.equals(player) && third.equals(""))) return winCase[2];
            if ((first.equals(player) && third.equals(player) && second.equals(""))) return winCase[1];
            if ((second.equals(player) && third.equals(player) && first.equals(""))) return winCase[0];
        }
    
        return -1; // No WinningMovee found
    }

    private String human_sign;
    private String bot_sign;
    private String human_msg;
    private String bot_msg;

    private String turn = "human";

    public void firstTurn() {


        if (random.nextInt(2) == 0) {
            human_sign = "X";
            bot_sign = "O";
            human_msg = "Player X (You) turn";
            bot_msg = "Player O (Bot) turn";
            textfield.setText(human_msg);
        } else {
            human_sign = "O";
            bot_sign = "X";
            human_msg = "Player O (You) turn";
            bot_msg = "Player X (Bot) turn";
            textfield.setText(human_msg);
        }
    }

    public void check() {
        // Check X win conditions
        int[][] winCases = {
            {0, 1, 2}, 
            {3, 4, 5}, 
            {6, 7, 8}, 
            {0, 3, 6}, 
            {1, 4, 7}, 
            {2, 5, 8}, 
            {0, 4, 8},
            {2, 4, 6},

        };
        for (int i = 0; i < winCases.length; i++) {
            if ((Objects.equals(buttons[winCases[i][0]].getText(), "X")) &&
                (Objects.equals(buttons[winCases[i][1]].getText(), "X")) &&
                (Objects.equals(buttons[winCases[i][2]].getText(), "X")))
            {
                dWin(winCases[i][0], winCases[i][1], winCases[i][2]);
            }
        }

        for (int i = 0; i < winCases.length; i++) {
            if ((Objects.equals(buttons[winCases[i][0]].getText(), "O")) &&
                (Objects.equals(buttons[winCases[i][1]].getText(), "O")) &&
                (Objects.equals(buttons[winCases[i][2]].getText(), "O")))
            {
                dWin(winCases[i][0], winCases[i][1], winCases[i][2]);
            }
        }
    }

    public void dWin(int a, int b, int c) {
        afterWin(a, b, c);
        tieAllow = false;
        textfield.setText(winText);
        gameOver = true;
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
            gameOver = true;
        }


    }
    
    private String winText;
    
    private void afterWin(int a, int b, int c) {
        if (Objects.equals(buttons[a].getText(), human_sign)) {
            winText = "You win !!";
        } else {
            winText = "Bot won !!";
        }
        buttons[a].setBackground(new Color(248, 226, 137));
        buttons[b].setBackground(new Color(248, 226, 137));
        buttons[c].setBackground(new Color(248, 226, 137));

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

    }

    



}
