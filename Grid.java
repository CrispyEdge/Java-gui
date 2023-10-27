import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Grid extends Frame{

    public Grid(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Grid");

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Closing window");
                System.exit(0);
            }
        });

        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        Button b6 = new Button("b6");

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);

        GridLayout g = new GridLayout(3, 3, 15, 15);
        this.setLayout(g);
    }
    public static void main(String []args){
        Grid obj = new Grid();
    }
}