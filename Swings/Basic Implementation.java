import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Swings1  implements ActionListener{
	JFrame f;
	final JTextField tf;
	Swings1() {
		f = new JFrame("Swings 1");
		JButton b = new JButton("Click Here");
		b.setBounds(50, 50, 95, 30);
		f.add(b);
		tf = new JTextField();
		tf.setBounds(50, 150, 95, 30);
		f.add(tf);
		
		f.setSize(400,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swings1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf.setText("HIIIIII");
	}

}
