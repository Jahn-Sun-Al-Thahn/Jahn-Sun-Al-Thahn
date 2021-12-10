import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoanCalculator extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextArea IntRateValue;
	private JTextArea YearsValue;
	private JTextArea LoanAmountValue;;
	private JTextArea MonthlyValue;
	private JTextArea TotalValue;
	private Loan test;
	
	public LoanCalculator() {
		
		Rectangle FrameBounds = new Rectangle(20,20,600,700);
		this.setBounds(FrameBounds);
		this.setVisible(true);
		this.setTitle("Loan Calculator");
		this.setLayout(new BorderLayout());
		
		JPanel BodyPanel = new JPanel();
		BodyPanel.setBorder(BorderFactory.createTitledBorder("Enter Loan Amount. Interest Rate, and Years"));
		BodyPanel.setLayout(new GridLayout(10,2));
		this.add(BodyPanel);
		
		JLabel IntRate = new JLabel("Annual Interest Rate");
		IntRate.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		IntRateValue = new JTextArea();
		IntRateValue.setBorder(BorderFactory.createLineBorder(Color.black));
		IntRateValue.setBackground(Color.white);
		BodyPanel.add(IntRate);
		BodyPanel.add(IntRateValue);
		
		JLabel Years = new JLabel("Annual Interest Rate");
		Years.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		YearsValue = new JTextArea();
		YearsValue.setBorder(BorderFactory.createLineBorder(Color.black));
		YearsValue.setBackground(Color.white);
		BodyPanel.add(Years);
		BodyPanel.add(YearsValue);
		
		JLabel LoanAmount = new JLabel("Annual Interest Rate");
		LoanAmount.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		LoanAmountValue = new JTextArea();
		LoanAmountValue.setBorder(BorderFactory.createLineBorder(Color.black));
		LoanAmountValue.setBackground(Color.white);
		BodyPanel.add(LoanAmount);
		BodyPanel.add(LoanAmountValue);
		
		JLabel Monthly = new JLabel("Annual Interest Rate");
		Monthly.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		MonthlyValue = new JTextArea();
		MonthlyValue.setBorder(BorderFactory.createLineBorder(Color.black));
		MonthlyValue.setBackground(Color.white);
		BodyPanel.add(Monthly);
		BodyPanel.add(MonthlyValue);
		
		JLabel Total = new JLabel("Annual Interest Rate");
		Total.setFont(new Font(Font.SANS_SERIF, 12, Font.BOLD));
		TotalValue = new JTextArea();
		TotalValue.setBorder(BorderFactory.createLineBorder(Color.black));
		TotalValue.setBackground(Color.white);
		BodyPanel.add(TotalValue);
		
		JButton Compute = new JButton("Compute Paymenet");
		Compute.setBorder(BorderFactory.createLineBorder(Color.black));
		Compute.setBackground(Color.lightGray);
		Compute.setAlignmentX(RIGHT_ALIGNMENT);
		Compute.addActionListener(new ComputeListener());
		this.add(Compute, BorderLayout.SOUTH);
		
	}
	
	public class ComputeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int years = Integer.parseInt(YearsValue.getText());
			double intrate = Double.parseDouble(IntRateValue.getText());
			double loanAM = Double.parseDouble(LoanAmountValue.getText());
			test = new Loan(intrate,years,loanAM);
			
			String Monthly = test.getMonthlyPayment() + "";
			String total = test.getTotalPayment() + "" ;
			MonthlyValue.setText(Monthly);
			TotalValue.setText(total);
			
		}
		
	}

}
