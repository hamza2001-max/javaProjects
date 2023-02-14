package src;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Window extends JFrame implements Runnable {

    Graphics2D g2;

    public Window() {
        setTitle(Constants.SCREEN_TITLE);
        setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        g2 = (Graphics2D) this.getGraphics();
    }

    public void update() {
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
    }

    public void run() {
        double drawInterval = 1000000000 / Constants.FPS;
        double lastTime = System.nanoTime();
        double currentTime;
        double delta = 0.0;
        while (true) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            if (delta >= 1) {
                update();
            }
            /*try {
                Thread.sleep(30);
            } catch (Exception e) {

            }*/
        }

    }
}
