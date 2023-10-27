import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Frame;

public class MyKeyListener extends Frame{

    public MyKeyListener(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Base");

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Closing the Window!");
                System.exit(0);
            }
        });

        this.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                System.out.println("Key typed!" + e.getKeyChar());
            }
            public void keyPressed(KeyEvent e){
                System.out.println("Pressed this key");
            }
        });
    }
    public static void main(String[] args){
        MyKeyListener obj = new MyKeyListener();
    }
}