package clg_assignment;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import java_io.read_without_buffer;
class MyFrame extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public MyFrame() {
        FlowLayout ob = new FlowLayout();
       setLayout(ob);

        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = e.getActionCommand();
        System.out.println(s1);
        int a, b, c;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        switch (s1) {
            case "+":
                c = a + b;
                t3.setText(" " + c);
                break;
            case "-":
                c = a - b;
                t3.setText(" " + c);
                break;
            case "*":
                c = a * b;
                t3.setText(" " + c);
                break;
            case "/":
                c = a / b;
                t3.setText(" " + c);
                break;

            default:
                break;
        }
    }

}

public class graphics {
public static void main(String[] args) {
    MyFrame f=new MyFrame();
    f.setSize(500, 500);
    f.setVisible(true);
    
    
}
}
