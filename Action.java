import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Label;

public class Action extends Frame implements ActionListener{

    Label l;
    Button b1;
    public Action(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("Grid");
        this.setLayout(null);

        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Closing window");
                System.exit(0);
            }
        });
        l = new Label();

        b1 = new Button("b1");
        b1.setBounds(200, 200, 60, 30);
        l.setBounds(200, 100, 300, 20);

        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        Button b6 = new Button("b6");

        this.add(b1);
        this.add(l);
        // this.add(b2);
        // this.add(b3);
        // this.add(b4);
        // this.add(b5);
        // this.add(b6);
        
        b1.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent e){
        l.setText("HI");
    }
    public static void main(String []args){
        Action obj = new Action();
    }
}