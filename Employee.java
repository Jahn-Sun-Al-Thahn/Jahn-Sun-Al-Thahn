import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Employee extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Add;
	private JPanel Remove;
	private JPanel Update;
	private JPanel text;
	private JTable Employees;
	private JFormattedTextField inputUI1;
	private JFormattedTextField inputUI2;
	private JFormattedTextField inputUI3;
	private JFormattedTextField inputUI4;
	private Connection ConAir;
	
	public Employee() throws SQLException {
		try {
		//Declare Connection Variable, that connects to the database.
		ConAir = DriverManager.getConnection("jdbc:mariadb://localhost/testdb");
		
		/*Close Connection 
		 * ConAir.close();
		 */
		
		
		}catch (Exception ex) {
			
		}
		
		this.setSize(535, 640);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		
		JPanel SouthGrid = new JPanel();
		Add = new JPanel();
		Add.setSize(20,40);
		SouthGrid.add(Add);
		Remove = new JPanel();
		Remove.setSize(20, 40);
		SouthGrid.add(Remove);
		Update = new JPanel();
		Update.setSize(20, 40);
		SouthGrid.add(Update);
		
		text = new JPanel();
		text.setBorder(BorderFactory.createLineBorder(Color.black));
		text.setLayout(new GridLayout(1,1));
		
		Employees = new JTable();
		Employees.setVisible(true);
		Employees.setEnabled(true);
		text.add(Employees);
		
		inputUI1 = new JFormattedTextField();
		inputUI1.setSize(20, 40);
		Employees.add(inputUI1);
		
		inputUI2 = new JFormattedTextField();
		inputUI2.setSize(20, 40);
		Employees.add(inputUI2);
		
		inputUI3 = new JFormattedTextField();
		inputUI3.setSize(20, 40);
		Employees.add(inputUI3);
		
		inputUI4 = new JFormattedTextField();
		inputUI4.setSize(20, 40);
		Employees.add(inputUI4);
		
		//Makes a Statement to be used toward the Connection variable, Database. 
		Statement Adding = ConAir.createStatement();
		
		//Creates a String to send as the text that will be in the database as the commands.
		String sqlStatement = "CREATE testDB";
		
		//Sends Statement to the Database
		ResultSet Result = Adding.executeQuery(sqlStatement);
		
		//Moves to next Row of Table
		Result.next();
		
		//Retrieve the results of a Tables cell by column
		Result.getString("Description");
		
		
		
		
	}
	
	public class CellListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
