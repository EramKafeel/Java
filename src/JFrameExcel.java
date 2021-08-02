
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class JFrameExcel{

		static JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;

		public static void main(String[] args){

			tf1= new JTextField(8);

			tf2= new JTextField(8);

			tf3= new JTextField(8);

			tf4= new JTextField(8);

			tf3.setAction(copy);

			JPanel panel = new JPanel();


			panel.add(tf1);

			panel.add(tf2);

			panel.add(tf3);

			panel.add(tf4);

			tf5= new JTextField(8);

			
			tf6= new JTextField(8);

			tf7= new JTextField(8);

			tf8= new JTextField(8);

			tf7.setAction(copy);

			panel.add(tf5);

			panel.add(tf6);

			panel.add(tf7);

			panel.add(tf8);

			tf9= new JTextField(8);

			
			tf10= new JTextField(8);

			tf11= new JTextField(8);

			tf12= new JTextField(8);

			tf11.setAction(copy);

			panel.add(tf9);

			panel.add(tf10);

			panel.add(tf11);

			panel.add(tf12);

			JButton button = new JButton("button");

			button.getInputMap().put(KeyStroke.getKeyStroke("ENTER"),"COPY");

			button.getActionMap().put("COPY",copy);

			JFrame f = new JFrame();

			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			f.getContentPane().add(panel);

			f.setSize(500,500);

			f.setLocation(240,250);

			f.setVisible(true);
}
private static Action copy = new AbstractAction("copy") {

	private static final long serialVersionUID = 1L;
	private int a;

	public void actionPerformed(ActionEvent e){

		if (e.getActionCommand().contains("sum")){

			int a = Integer.parseInt(tf1.getText());

			int b = Integer.parseInt(tf2.getText());

			int c = a+b;
			

			String result = String.valueOf(c);

			tf4.setText(result);

		} else if (e.getActionCommand().contains("fact")) {

			int a = Integer.parseInt(tf5.getText());

			int i;

			int fact = 1;
			for(i = 1; i<=a; i++) {
				fact = fact* i;
			}

			String result = String.valueOf(fact);

			tf8.setText(result);

		}
		else if (e.getActionCommand().contains("doublefact")) {

			int a = Integer.parseInt(tf9.getText());

			int i;

			int doublefact = 1;
			for(i = 1; i<=a; i++) {
				doublefact = doublefact* i;

			}
	        

			String result = String.valueOf(doublefact);

			tf12.setText(result);

		}

	}

};
}














