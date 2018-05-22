package lab9;
import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel{
	String[] columnNames = {"Nume",
            "Prenume",
            "Note"};
	
	Object[][] data = {
		    {"Kathy", "Smith",3},
		    {"John", "Doe",54}};
	
	@Override
	public int getRowCount() {
		return data.length;
	}
	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		 return data[arg0][arg1];
	}
	@Override
	public int getColumnCount() {
		
		  return columnNames.length;
	}
	
	@Override
	public String getColumnName( int col) {
		
		  return columnNames[col];
	}
	
}