package lab11;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lansator {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		/*82.76.115.105 = host
		port
		3306
		baza de date:
		pao*/

        final String DB_URL = "jdbc:mysql://82.76.115.105:3306/pao";
        final String DB_USER = "fooUser";//username;
        final String DB_PASS = "fooPassword";//password
        
        Class.forName("com.mysql.jdbc.Driver");//incarcarea ei produce incarcarea propriu-zisa a driveului ; produce o instanta (o incarca, desi nu are nevoie de ea => executa blocurile statice care fac set upul driveului)
        //facem curatenie: inchidem resursele
        try(	
        		java.sql.Connection myConn = java.sql.DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                //^apel metoda statica
                //se deschide un socket si se incepe comunicarea (se deshide o sesiune)
           
        		PreparedStatement ps = myConn.prepareStatement("SELECT * FROM student WHERE nume = ? AND prezente = ?");
            	//*preparedStatement protejeaza impotriva SQL injection
            	//*noi construim un query si inainte de executie serverul se pregateste sa execute aia, asteptand ? , dar stie ca e un singur query, nu mai multe (injection)
            	//la executare se trimite doar ce era la parametrii => doar o data se face compilarea query-ului la server 
        		
        	
        		ResultSet rs = ps.executeQuery();
            	//rs e initial setat pe pozitia -1 => facem next ca sa treaca la pozitia 0
        
        	)
        {
        
        	
        	
        	while(rs.next())//prima oara ajunge la 0, deci pozitia buna, la urmatoare 1, si tot asa + returneaza true/fals daca mai ai elemente in fata
        	{
        		//rs.getString("nume");//parametrul(incepe de la 1 sau numele coloanei) este indexul unei coloane (din rezultatul query-ului)
        		System.out.println(rs.getString("nume"));
        	}
        
     
        	
        }
        catch( SQLException e)
        {
        	e.printStackTrace();
        }
        
	}

}
