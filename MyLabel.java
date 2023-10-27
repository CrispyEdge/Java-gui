import java.awt.Frame;
import java.awt.Label;

public class MyLabel extends Frame{

    public MyLabel(){


        Label l1 = new Label("Username");
        Label l2 = new Label("Password");

        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        this.add(l1);
        this.add(l2);

        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("label class");
    }
    public static void main(String []args){
        MyLabel obj = new MyLabel();
    }
}