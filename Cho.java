import java.awt.Frame;
import java.awt.Choice;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Cho extends Frame implements ItemListener{ 
    Choice c;
    Label l;
    public Cho(){

        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("S");
        this.setLayout(null);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.out.println("Closing window");
                System.exit(0);
            }
        });

        c = new Choice();
        c.setBounds(200, 100, 100, 75);
        c.add("Tea");
        c.add("Coffee");
        c.add("Milk");

        l = new Label();
        l.setSize(400, 100);
        l.setAlignment(Label.CENTER);
        this.add(c);
        this.add(l);

        c.addItemListener(this);w
    }

    public void itemStateChanged(ItemEvent e){
        l.setText("Selected item " + c.getSelectedItem());
    }
    public static void main(String[] args) {
        Cho obj = new Cho();
    }
}
