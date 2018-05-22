package lab11;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lansator2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		

        final String DB_URL = "jdbc:mysql://82.76.115.105:3306/pao";
        final String DB_USER = "fooUser";//username;
        final String DB_PASS = "fooPassword";//password
        
        Class.forName("com.mysql.jdbc.Driver");

		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setSize(500,500); //relative la coltul din stanga sus
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints constraints=new GridBagConstraints();
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		
		JPanel root=new JPanel();
		JPanel panel = new JPanel();
		frame.setContentPane(root);
		JButton login=new JButton("login");
		
		root.setLayout(new GridBagLayout());
		
		root.add(panel,constraints);
		panel.setPreferredSize(new Dimension(300,300));
		panel.add(new JLabel("Nume"));
		JTextField text = new JTextField();
		panel.add(text);
		JButton buton = new JButton("Push me");
		panel.add(buton);
		panel.setLayout(new GridLayout(3,1));//nr de randuri si coloane ca parametrii
		//GridBagLayout
	
		
		buton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				String numeS = text.getText();
				System.out.println(numeS);
				
				int gasit = 0;
		        try(	
		        		java.sql.Connection myConn = java.sql.DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		               
		        		PreparedStatement ps = myConn.prepareStatement("SELECT nume, prezente  FROM student WHERE nume = ?");
		          
		        		 	
		        	)
		        {
		        	ps.setString(1,numeS);
		        	try(	ResultSet rs = ps.executeQuery(); )
		        	{
		         
		        		String numeComplet;
		        		int nrPrezente = 0;
		        		while(rs.next())
		        		{
		        			gasit++;
		        			if(gasit == 1)
		        			{
		        				numeComplet = rs.getString("nume");
		        				nrPrezente = rs.getInt("prezente");
		        			}
		        			if(gasit > 1)
		        			{
		        				System.out.println("Prea multe potriviri");
		        			}
		        		}
		        		if(gasit == 0)
		        		{
		        			System.out.println("Eroare: Nu s-au gasit studenti cu numele introdus");
		        		}
		        		else
		        			{
		        			if(gasit == 0)
		        				{
		        					System.out.println("Nume complet: "+numeS+" cu "+nrPrezente+" prezente.");
		   
		        				}
		        			}
		        		
		        	}	

		        }
		        catch( SQLException err)
		        {
		        	err.printStackTrace();
		        }
				
				
			}});
		
		
		
		
		frame.setVisible(true);
		
		
		
		
		
	}

}
