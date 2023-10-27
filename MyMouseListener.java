import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener extends Frame implements MouseListener{

    public MyMouseListener(){
        this.setVisible(true);
        this.setTitle("MOUSE");
        this.setSize(500, 500);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.addMouseListener(this);
    }
        public void mouseClicked(MouseEvent e){
            System.out.println("Clicking mouse");
        }
        public void mousePressed(MouseEvent e){
            System.out.println("Pressing mouse");
        }
        public void mouseReleased(MouseEvent e){
            System.out.println("Releasing mouse");
        }
        public void mouseEntered(MouseEvent e){
            System.out.println("Entering mouse");
        }
        public void mouseExited(MouseEvent e){
            System.out.println("Exitingmouse");
        }

    public static void main(String []args){
        MyMouseListener obj = new MyMouseListener();
    }
}