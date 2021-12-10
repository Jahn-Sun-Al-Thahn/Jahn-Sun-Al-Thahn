import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame {
	private String Fahrenheit;
	private String Celsius;
	private JButton FtoC;
	private JButton CtoF;
	private JTextField F2C;
	private JTextField C2F;
	
	public TempConverter() {
		setTitle("Temperature Converter");
		setVisible(true);
		setBounds(20,20,500,150);
		setLayout(new GridLayout(2,3));
		
		
		JLabel FDegrees = new JLabel("Degrees Fahrenheit");
		FDegrees.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		JLabel CDegrees = new JLabel("Degrees Celsius");
		CDegrees.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		
		F2C = new JTextField();
		F2C.setBorder(BorderFactory.createLineBorder(Color.black));
		C2F = new JTextField();
		C2F.setBorder(BorderFactory.createLineBorder(Color.black));
		
		FtoC = new JButton("F->C");
		FtoC.setAlignmentX(CENTER_ALIGNMENT);
		CtoF = new JButton("C->F");
		CtoF.setAlignmentX(CENTER_ALIGNMENT);
		
		this.add(FDegrees);
		this.add(F2C);
		this.add(FtoC);
		this.add(CDegrees);
		this.add(C2F);
		this.add(CtoF);
		
	}
	
	public class ConvertorListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double inputF = Double.parseDouble(F2C.getText());
			double inputC = Double.parseDouble(C2F.getText());
			if(e.getSource() == FtoC) {
				Fahrenheit = (inputC * 1.8) + 32 + "";
				F2C.setText(Fahrenheit);
			}else if(e.getSource() == CtoF) {
				Celsius = (inputF - 32) * 5/9 + "";
				C2F.setText(Celsius);
			}
		}
		
	}

}
