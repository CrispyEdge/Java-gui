import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
//import java.awt.TextArea;

public class TextAr extends Frame{

    public TextAr(){

        this.setLayout(null);
        //Label l1 = new Label("Username");
        //Label l2 = new Label("Password");
        Checkbox c1 = new Checkbox("Tea");
        Checkbox c2 = new Checkbox("Coffee");
        c1.setBounds(50, 100, 100, 30);
        c2.setBounds(50, 150, 100, 30);
        //TextArea t = new TextArea("Welcome");
        //t.setBounds(160, 100, 200, 100);
        this.add(c1);
        this.add(c2);
        

        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("label class");
        //this.add(t);
        
    }
    public static void main(String []args){
        TextAr obj = new TextAr();
    }
}