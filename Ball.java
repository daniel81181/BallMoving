package socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Ball extends JPanel implements ActionListener{

    Timer timer = new Timer(5,this);
    int x, speedX, y, speedY;
    public Ball() {
    	x=Integer.parseInt(JOptionPane.showInputDialog("Pos x<=600"));
    	y=Integer.parseInt(JOptionPane.showInputDialog("Pos y<=600"));
      	speedX=Integer.parseInt(JOptionPane.showInputDialog("Velocidad x<=5"));
    	speedY=Integer.parseInt(JOptionPane.showInputDialog("Velocidad x<=5"));
    	
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x,y,20,30);
        timer.start();

    }

    public void actionPerformed(ActionEvent e){
        if(x<0||x>=500){
            speedX*=-1;
        }
        if(y<0||y>=500){
            speedY*=-1;
        }
        x+=speedX;
        y+=speedY;
        repaint();
    }

    public static void main(String[] args) {
        Ball m = new Ball();
        JFrame jf = new JFrame();
        jf.setTitle("Ball Falling");
        jf.setSize(650,650);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(m);
    }
}