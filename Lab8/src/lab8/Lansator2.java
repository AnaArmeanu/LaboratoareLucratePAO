package lab8;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lansator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		//frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton login = new JButton("login");
		
		JPanel root = new JPanel();
		root.setLayout(new GridBagLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));//nr randuri si nr col
		panel.setPreferredSize(new Dimension(300,300));
		panel.add(new JLabel("USER"));
		panel.add(new JTextField());
		panel.add(new JLabel("PASSWORD"));
		panel.add(new JPasswordField());	
		panel.add(login);
		panel.add(new JButton("Cancel"));
		
		//construim un nou container
		frame.setContentPane(root);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER; //e by default pe center
		root.add(panel,constraints);
		frame.setVisible(true);
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				panel.removeAll();
				panel.add(new JLabel("Hello,Bai!"));
				panel.revalidate();
				panel.repaint();
				
			}
														
													});

		
	}

}
