import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MyMouseAdapter extends Frame{

    public MyMouseAdapter(){
        this.setVisible(true);
        this.setTitle("Mouse");
        this.setSize(500, 500);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("The window is closing!!!");
                System.exit(0);
            }
        });

        this.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked..." + e.getX() + e.getY());
            }
            
            public void mouseReleased(MouseEvent e){
                System.out.println("Mouse Released..");
            }

        });
    }
    public static void main(String [] args){
        MyMouseAdapter obj = new MyMouseAdapter();
    }
}

