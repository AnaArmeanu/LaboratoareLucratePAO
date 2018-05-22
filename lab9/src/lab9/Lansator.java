package lab9;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Lansator {

	public static void main(String[] args) {
				JFrame frame = new JFrame();
				frame.setBounds(100, 100, 500, 500);
				//frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JMenuBar menuBar;
				menuBar = new JMenuBar();
				JMenu menu1, menu2;
				menu1 = new JMenu("PRINCIPAL");
				menuBar.add(menu1);
				menu2 = new JMenu("Adaugare");
				menuBar.add(menu2);
				
				JDialog dia = new JDialog(frame, "Adaugare studenti", true);
				JPanel panel = new JPanel();
				panel.setLayout(new GridLayout(3,2));//nr randuri si nr col
				panel.add(new JLabel("Nume"));
				panel.add(new JTextField());
				panel.add(new JLabel("Preume"));
				panel.add(new JTextField());
				panel.add(new JLabel("Nr Note"));
				panel.add(new JTextField());
				dia.setBounds(200, 200, 280, 280);
				dia.setContentPane(panel);
				
				JMenuItem menuItem;
				menuItem = new JMenuItem("Salvare");
				menuItem.addActionListener(event -> dia.setVisible(true));
				menu1.add(menuItem);
				menuItem = new JMenuItem("Incarca");
				menu1.add(menuItem);
				menuItem = new JMenuItem("Sterge");
				menu1.add(menuItem);
				menuItem = new JMenuItem("Iesire");
				menu1.add(menuItem);
				
				Model inst = new Model();
				JTable tabel= new JTable(inst);
				JScrollPane t1 = new JScrollPane();
				t1.setViewportView(tabel);
			
				
				frame.add(t1);
				frame.setJMenuBar(menuBar);
				frame.setVisible(true);

	}

}