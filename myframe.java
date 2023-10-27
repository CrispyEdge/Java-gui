import java.awt.Frame;

public class myframe extends Frame{

    public myframe(){
        this.setVisible(true);
        this.setTitle("GUI");
        this.setSize(500, 500);
    }
    public static void main(String[] args){
        myframe obj = new myframe();
    }
}