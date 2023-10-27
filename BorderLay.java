import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.*;

public class BorderLay extends Frame{

    public BorderLay(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Border");

        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");

        BorderLayout l1 = new BorderLayout(50, 50);
        this.setLayout(l1);
        this.add(b1, BorderLayout.EAST);
        this.add(b2, BorderLayout.WEST);
        this.add(b3, BorderLayout.NORTH);
        this.add(b4, BorderLayout.SOUTH);
        this.add(b5, BorderLayout.CENTER);
    }
    public static void main(String [] args){
        BorderLay obj = new BorderLay();
    }
}