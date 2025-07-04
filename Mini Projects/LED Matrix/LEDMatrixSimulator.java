import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LEDMatrixSimulator extends JFrame {
    private final int rows = 8;
    private final int cols = 32;
    private final int ledSize = 10;
    private boolean[][] ledState = new boolean[rows][cols];

    public LEDMatrixSimulator() {
        setTitle("LED Matrix Simulator");
        setSize(cols * ledSize + 50, rows * ledSize + 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel canvas = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        g.setColor(ledState[row][col] ? Color.ORANGE : Color.BLACK);
                        g.fillRect(col * ledSize, row * ledSize, ledSize - 2, ledSize - 2);
                        g.setColor(Color.DARK_GRAY);
                        g.drawRect(col * ledSize, row * ledSize, ledSize - 2, ledSize - 2);
                    }
                }
            }
        };

        canvas.setPreferredSize(new Dimension(cols * ledSize, rows * ledSize));

        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int col = e.getX() / ledSize;
                int row = e.getY() / ledSize;
                if (row < rows && col < cols) {
                    ledState[row][col] = !ledState[row][col];
                    canvas.repaint();
                }
            }
        });

        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> {
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    ledState[i][j] = false;
            canvas.repaint();
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(clearBtn);

        add(canvas, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LEDMatrixSimulator sim = new LEDMatrixSimulator();
            sim.setVisible(true);
        });
    }
}
