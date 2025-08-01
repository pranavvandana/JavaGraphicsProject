import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
 //
public class Main extends JFrame {
  private static final long serialVersionUID = 1L;
  public static final int WIDTH = 1200;
  public static final int HEIGHT = 900;

  public static void main(String[] args) {
    Main test = new Main();
    test.setSize(WIDTH, HEIGHT);
    test.setResizable(false);
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    test.setVisible(true);
  }

  public void paint(Graphics g) {
    g.setColor(Color.GRAY);
    g.fillRect(0, 0, WIDTH, HEIGHT);
    g.setColor(new Color(0x00ffaa));
    g.fillOval(150, 145, 160, 160);
    g.setColor(Color.white);
    g.fillOval(260, 362, 170, 140);
    g.setColor(Color.blue);
    g.fillOval(163, 164, 110, 110);
    g.fillRect(480, 180, 100, 200);
    g.setColor(Color.white);
    g.drawOval(190, 192, 50, 20);
    g.setColor(Color.red);
    g.drawString("test", 100, 100);
    g.drawOval(500, 300, 200, 100);
    g.setColor(Color.white);
    
  }
}