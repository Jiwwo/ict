import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(String s){
        super(s);
        setSize(900, 800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g.drawLine(50, 150, 50, 555);//ось y
        g.drawLine(45, 550, 845, 550);//ось x
        g2d.setStroke(new BasicStroke(4));
        g.drawLine(345,500,147,451);
        g.drawLine(147,451,100,225);
        g.drawLine(100,225,500,253);
        g.drawLine(500,253,245,350);
        g.drawLine(245,350,345,500);
        g.drawLine(500,403,500,525);
        g.drawLine(500,525,590,450);
        g.drawLine(590,450,747,425);
        g.drawLine(747,425,690,300);
        g.drawLine(690,300,590,375);
        g.drawLine(590,375,500,403);
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1, new float[]{5f, 5f}, 0f));//Штрих
        g.drawLine(150, 150, 150, 555);/////// x
        g.drawLine(250, 150, 250, 555);
        g.drawLine(350, 150, 350, 555);
        g.drawLine(450, 150, 450, 555);
        g.drawLine(550, 150, 550, 555);
        g.drawLine(650, 150, 650, 555);
        g.drawLine(750, 150, 750, 555);
        g.drawLine(845, 150, 845, 555);
        g.setFont(new Font("Serif", Font.ROMAN_BASELINE, 14));
        g.drawString("-8", 40, 573); // Подписи X
        g.drawString("-6", 140, 573);
        g.drawString("-4", 240, 573);
        g.drawString("-2", 340, 573);
        g.drawString("0", 440, 573);
        g.drawString("2", 540, 573);
        g.drawString("4", 640, 573);
        g.drawString("6", 740, 573);
        g.drawString("8", 840, 573);
        g.drawLine(45, 150, 845, 150);///y
        g.drawLine(45, 200, 845, 200);
        g.drawLine(45, 250, 845, 250);
        g.drawLine(45, 300, 845, 300);
        g.drawLine(45, 350, 845, 350);
        g.drawLine(45, 400, 845, 400);
        g.drawLine(45, 450, 845, 450);
        g.drawLine(45, 500, 845, 500);
        g.drawLine(45, 550, 845, 550);
        g.drawString("-8", 27, 553); //Подписи Y
        g.drawString("-6", 27, 503);
        g.drawString("-4", 27, 453);
        g.drawString("-2", 27, 403);
        g.drawString("0", 27, 353);
        g.drawString("2", 27, 303);
        g.drawString("4", 27, 253);
        g.drawString("6", 27, 203);
        g.drawString("8", 27, 153);
    }
    public static void main(String args[]){
        new Main("Фигуры");
    }
}
