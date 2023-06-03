package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MyPanel extends JPanel implements KeyListener, ActionListener {
    ImageIcon right = new ImageIcon("Game/src/main/resources/images/right.png");
    ImageIcon body = new ImageIcon("Game/src/main/resources/images/body.png");
    ImageIcon left = new ImageIcon("Game/src/main/resources/images/left.png");
    ImageIcon top = new ImageIcon("Game/src/main/resources/images/top.png");
    ImageIcon bottom = new ImageIcon("Game/src/main/resources/images/bottom.png");
    ImageIcon food = new ImageIcon("Game/src/main/resources/images/food.png");

    int len = 3;
    int[] snakex = new int[450 * 570 + 100];
    int[] snakey = new int[450 * 570 + 100];

    Direction direction = Direction.bottom;

    boolean isStart = false;

    Timer timer = new Timer(100, this);

    int foodx;
    int foody;
    Random random = new Random();


    public MyPanel() {
        snakex[0] = 75;
        snakex[1] = 60;
        snakex[2] = 45;
        snakey[0] = 50;
        snakey[1] = 50;
        snakey[2] = 50;
        setFocusable(true);
        addKeyListener(this);
        timer.start();
        foodx = 15 * random.nextInt(30);
        foody = 15 * random.nextInt(38);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.RED);
        g.fillRect(0, 0, 450, 570);
        switch (direction) {
            case top -> top.paintIcon(this, g, snakex[0], snakey[0]);

            case right -> right.paintIcon(this, g, snakex[0], snakey[0]);

            case left -> left.paintIcon(this, g, snakex[0], snakey[0]);

            case bottom -> bottom.paintIcon(this, g, snakex[0], snakey[0]);
        }
        for (int i = 1; i < len; i++) {
            body.paintIcon(this, g, snakex[i], snakey[i]);
        }

        if (!isStart) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("宋体", Font.BOLD, 10));
            g.drawString("输入空格开始", 50, 200);
        }
        food.paintIcon(this, g, foodx, foody);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == 32) {
            isStart = !isStart;
            repaint();
        } else if (keyCode == KeyEvent.VK_UP) {
            direction = Direction.top;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            direction = Direction.bottom;
        } else if (keyCode == KeyEvent.VK_LEFT) {
            direction = Direction.left;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            direction = Direction.right;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart) {
            for (int i = len - 1; i > 0; i--) {
                snakex[i] = snakex[i - 1];
                snakey[i] = snakey[i - 1];
            }

            switch (direction) {
                case top -> {
                    snakey[0] -= 15;
                    if (snakey[0] <= 0) {
                        snakey[0] = 570;
                    }
                }
                case bottom -> {
                    snakey[0] += 15;
                    if (snakey[0] >= 570) {
                        snakey[0] = 0;
                    }
                }
                case left -> {
                    snakex[0] -= 15;
                    if (snakex[0] <= 0) {
                        snakex[0] = 450;
                    }
                }
                case right -> {
                    snakex[0] += 15;
                    if (snakex[0] >= 450) {
                        snakex[0] = 0;
                    }
                }
            }

            if (snakex[0] == foodx && snakey[0] == foody) {
                len++;
                foodx = 15 * random.nextInt(30);
                foody = 15 * random.nextInt(38);
            }
            repaint();
            timer.start();
        }
    }
}
