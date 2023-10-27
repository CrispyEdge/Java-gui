import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Dp extends Frame implements ItemListener{
    Label l;
    Checkbox b1, b2, b3;
    //Checkbox = b4;

    public Dp(){
    this.setVisible(true);
    this.setTitle("GU");
    this.setSize(500, 500);
    this.setLayout(null);
    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.out.println("Closing window...");
            System.exit(0);
        }
    });
    CheckboxGroup cb = new CheckboxGroup();

    l = new Label();
    b1 = new Checkbox("tea", cb, false);
    b2 = new Checkbox("coffee", cb, false);
    b3 = new Checkbox("water", cb, false);
    //b4 = new Checkbox();

    
    b1.setBounds(100, 100, 50, 50);
    b2.setBounds(100, 150, 80, 50);
    b3.setBounds(100, 200, 70, 50);
    l.setBounds(100, 250, 200, 50);
    //b4.setBounds(100, 100, 50, 50);

    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(l);

    b1.addItemListener(this);
    b2.addItemListener(this);
    b3.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e){
        Checkbox cc = (Checkbox) e.getItemSelectable();

        if(cc.getState()==true){
            l.setText(cc.getLabel()+ " Checked");
        }
        else{
            l.setText(cc.getLabel() + " unchecked");
        }
    }
    public static void main(String[] args){
        Dp obj = new Dp();
    }
}