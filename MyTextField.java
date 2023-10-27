// import java.awt.Frame;
// import java.awt.Label;
// import java.awt.TextField;
// import java.awt.Button;
// import java.awt.event.WindowEvent;
// import java.awt.event.WindowListener;

// public class MyTextField extends Frame implements WindowListener{
//     public MyTextField(){
//         this.setVisible(true);
//         this.setSize(500, 500);
//         this.setTitle("TextField");

//         Label l1 = new Label("Username");
//         Label l2 = new Label("Password");
//         Button b1 = new Button();
//         b1.setLabel("Submit");

//         TextField t1 = new TextField();
//         TextField t2 = new TextField();
//         Button b2 = new Button();
//         b2.setLabel("Cancel");

//         l1.setBounds(50, 50, 100, 30);
//         t1.setBounds(150, 50, 200, 30);
//         b1.setBounds(50, 200, 100, 30);

//         l2.setBounds(50, 100, 100, 30);
//         t2.setBounds(150, 100, 200, 30);
//         b2.setBounds(200, 200, 100, 30);

//         t1.setText("Enter Username");
//         t2.setText("Enter Password");


//         this.add(l1);
//         this.add(t1);
//         this.add(l2);
//         this.add(t2);
//         this.add(b1);
//         this.add(b2);
//         this.setLayout(null);
//         this.addWindowListener(this);
//     }
//     public void windowOpened(WindowEvent e){
//         System.out.println("Window opened");
//     }
//     public void windowClosed(WindowEvent e){
//         System.out.println("Window is closed!");
//     }
//     public void windowClosing(WindowEvent e){
//         System.out.println("Window closing!");
//     }
//     public void windowIconified(WindowEvent e){
//         System.out.println("Window minimized!");
//     }
//     public void windowDeiconified(WindowEvent e){
//         System.out.println("Opened after minimizing!");
//     }
//     public void windowActivated(WindowEvent e){
//         System.out.println("Window Activated");
//     }
//     public void windowDeactivated(WindowEvent e){
//         System.out.println("Window Deactivating...");
//     }

//     public static void main(String[] args){
//         MyTextField obj = new MyTextField();
//     }
// }

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

public class MyTextField extends Frame{
    public MyTextField() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("TextField");

        Label l1 = new Label("Username");
        Label l2 = new Label("Password");
        Button b1 = new Button();
        b1.setLabel("Submit");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b2 = new Button();
        b2.setLabel("Cancel");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 200, 30);
        b1.setBounds(50, 200, 100, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 200, 30);
        b2.setBounds(200, 200, 100, 30);

        t1.setText("Enter Username");
        t2.setText("Enter Password");

        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(b1);
        this.add(b2);

        this.setLayout(null);
        this.addWindowListener(new WindowAdapter(){
        // this.addWindowListener(this);
        public void windowOpened(WindowEvent e) {
            System.out.println("Window opened");
        }
    
        public void windowClosed(WindowEvent e) {
            System.out.println("Window is closed!");
        }
    
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closing!");
            System.exit(0);
        }
    
        public void windowIconified(WindowEvent e) {
            System.out.println("Window minimized!");
        }
    
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Opened after minimizing!");
        }
    
        public void windowActivated(WindowEvent e) {
            System.out.println("Window Activated");
        }
    
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window Deactivating...");
        }
    });
    
    }

   
    public static void main(String[] args) {
        MyTextField obj = new MyTextField();
    }
}
