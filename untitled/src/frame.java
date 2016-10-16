import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by XiaochengWen on 16/8/31.
 */
public class frame extends JFrame{

    public frame(){
        JPanel panel = new JPanel();
        JButton button1 = new JButton("按钮一");
        JButton button2 = new JButton("按钮二");
        panel.add(button1);
        panel.add(button2);
        this.getContentPane().add(panel);
        this.setVisible(true);


        button1.addActionListener(new Button1ActionListener());
        button2.addActionListener(new Button2ActionListener());

    }

    private class Button1ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("你按了按钮一");
        }
    }

    private class Button2ActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("你按了按钮二");
        }

    }

    public static void main(String[] args) {
        new frame();
    }

}
