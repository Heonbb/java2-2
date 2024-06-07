import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
    public paintJPanelEx() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(500,200);
        setVisible(true);
    }

    // JPanel을 상속받는 새 패널 구현
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE); // 파란색 선택
            g.drawRect(10,10,50,50);
            g.drawString("잉 기모링",30,80);
            g.setFont(new Font("나눔고딩",Font.BOLD,30));
            g.setColor(new Color(0x00ff00ff));
            g.drawString("Set Hexadecimal Number", 30,120);
            g.setColor(new Color(255,0,0));
            g.setFont(new Font("Arial", Font.ITALIC,30));
            g.drawString("How much?",30,150);
            g.drawLine(20,180,180,210); // 선
            g.drawOval(20,230,80,80);
            g.drawRoundRect(20,400,120,80,40,60);
            g.drawArc(20,420,80,80,90,270);
            g.fillArc(20,500,80,80,90,270);
            // 다각형
            int []x = {80,40,80,120, 180};;
            int []y = {540,620,700,520, 510};
            g.drawPolygon(x, y, 4);
        }
    }

    public static void main(String[] args) {
        new paintJPanelEx();
    }
}