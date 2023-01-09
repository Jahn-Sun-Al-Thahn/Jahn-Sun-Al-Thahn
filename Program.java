import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.*;

public class Program extends JFrame{
	FizzBuzz fizzbuzz;
	Fibonacci Fib;
	
	FizzBuzz FBTwo;
	Fibonacci FibTwo;
	
	ArrayList<JTextField> AllTextFields;
	JPanel Header;
	JPanel Body;
	JPanel Conclusion;
	
	JLabel FBLabel;
	JLabel InputX;
	JLabel DivisorA;
	JLabel DivisorB;
	JLabel Fizz;
	JLabel Buzz;
	
	JTextField X;
	JTextField textDivA;
	JTextField textDivB;
	JTextField textFizz;
	JTextField textBuzz;
	
	JLabel fibLabel;
	JLabel NumOfReps;
	JLabel Y;
	JLabel Z;
	
	JTextField textXreps;
	JTextField textY;
	JTextField textZ;
	
	JButton FizzB;
	JButton Fibon;
	JButton Combo;
	JTextArea Results;
	
	public Program() {
		fizzbuzz = new FizzBuzz();
		Fib = new Fibonacci();
		FBTwo = new FizzBuzz();
		FibTwo = new Fibonacci();
		FocusListener SingleProg = new EditTextListener();
		FocusListener Combined = new CombinedListener();
		FocusListener[] Focuses = {SingleProg, Combined};
		AllTextFields = new ArrayList<JTextField>();
		
		Header = new JPanel();
		Body = new JPanel();
		Conclusion = new JPanel();
		
		setName("Code Challenge Program");
		setTitle("Code Challenge Program");
		setSize(350, 500);
		setLocation(250,300);
		setVisible(true);
		setLayout(new GridLayout(3,1,15,5));
		Header.setLayout(new GridLayout(6,2));
		Body.setLayout(new GridLayout(4,2));
		
		FizzB = new JButton("Show Results");
		Fibon = new JButton("Fibonacci");
		Combo = new JButton("Combined");
		JLabel Blank = new JLabel("");
		FBLabel = new JLabel("FizzBuzz",SwingConstants.LEFT);
		InputX = new JLabel("Input:", SwingConstants.CENTER);
		DivisorA = new JLabel("Divisor A:", SwingConstants.CENTER);
		DivisorB = new JLabel("Divisor B:", SwingConstants.CENTER); 
		Fizz = new JLabel("Fizz Word:", SwingConstants.CENTER);
		Buzz = new JLabel("Buzz Word:", SwingConstants.CENTER);
		
		X = new JTextField("0", 10);
		textDivA = new JTextField("3", 10);
		textDivB = new JTextField("5", 10);
		textFizz = new JTextField("Fizz", 10);
		textBuzz = new JTextField("Buzz", 10);
		
		fibLabel = new JLabel("Fibonacci Sequencer", SwingConstants.LEFT);
		JPanel BlankB = new JPanel();
		NumOfReps = new JLabel("Number of Reps (N)", SwingConstants.CENTER);
		Y = new JLabel("Y (N-Y)", SwingConstants.CENTER);
		Z = new JLabel("Z (N-Z)", SwingConstants.CENTER);
		
		textXreps = new JTextField("N", 10);
		textY = new JTextField("1", 10);
		textZ = new JTextField("2", 10);

		
		Results = new JTextArea(5,28);
		Results.setBorder(BorderFactory.createEtchedBorder());
		Results.setEditable(false);
		Results.setLineWrap(true);
		FizzB.addActionListener(new FizzBuzzListener());
		Fibon.addActionListener(new FibonListener());
		Combo.addActionListener(new CombinedListener());
		
		add(Header);
		add(Body);
		add(Conclusion);
		
		Header.add(FBLabel);
		Header.add(Blank);
		Header.add(InputX);
		Header.add(X);
		AllTextFields.add(X);
		Header.add(DivisorA);
		Header.add(textDivA);
		AllTextFields.add(textDivA);
		Header.add(DivisorB);
		Header.add(textDivB);
		AllTextFields.add(textDivB);
		Header.add(Fizz);
		Header.add(textFizz);
		AllTextFields.add(textFizz);
		Header.add(Buzz);
		Header.add(textBuzz);
		AllTextFields.add(textBuzz);
		

		
		Body.add(fibLabel);
		Body.add(BlankB);
		Body.add(NumOfReps);
		Body.add(textXreps);
		AllTextFields.add(textXreps);
		Body.add(Y);
		Body.add(textY);
		AllTextFields.add(textY);
		Body.add(Z);
		Body.add(textZ);
		AllTextFields.add(textZ);
		
		for(JTextField Item : AllTextFields){
		  	Item.addFocusListener(Focuses[0]);
		 	Item.addFocusListener(Focuses[1]);
		}
		
		Conclusion.add(FizzB);
		Conclusion.add(Fibon);
		Conclusion.add(Combo);
		Conclusion.add(Results);
		
		
	}
	
	public class EditTextListener implements FocusListener{

		/*Show Case a Shorter Version using vectors and for each
		 * Checks through the array list for the item that matches the current focused object.
		 * Objects text field is then set to "".
		*/
		@Override
		public void focusGained(FocusEvent e) {
			for(JTextField item : AllTextFields) {
				if(e.getSource() == item) {
					//Change Font Color
				}
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			/*get the text from text field will be saved to the specific texts document
				This version of code is to show a secondary method for finding the JTextfeild
				then applying the operations. 
			*/
			if(e.getSource() == X) {
				int input = Integer.parseInt(X.getText());
				if(input > 0) {
					fizzbuzz.setN(input);
					X.setText(Integer.toString(fizzbuzz.getN()));
				} else {
					X.setText("0");
				}
				
			} else if(e.getSource() == textDivA) {
				int diva = Integer.parseInt(textDivA.getText());
				fizzbuzz.setDivA(diva);
				textDivA.setText(Integer.toString(fizzbuzz.getDivA()));
			} else if(e.getSource() == textDivB) {
				int divb = Integer.parseInt(textDivB.getText());
				fizzbuzz.setDivB(divb);
				textDivB.setText(Integer.toString(fizzbuzz.getDivB()));
			} else if(e.getSource() == textFizz) {
				fizzbuzz.setFizz(textFizz.getText());
				textFizz.setText(fizzbuzz.getFizz());
			} else if(e.getSource() == textBuzz) {
				fizzbuzz.setBuzz(textBuzz.getText());
				textBuzz.setText(fizzbuzz.getBuzz());
			} else if(e.getSource() == textXreps) {
				int xReps = Integer.parseInt(textXreps.getText());
				Fib.setN(xReps);
				textXreps.setText(Integer.toString(Fib.getN()));
			} else if(e.getSource() == textY) {
				int yValue = Integer.parseInt(textY.getText());
				Fib.setY(yValue);
				textY.setText(Integer.toString(Fib.getY()));
			} else if(e.getSource() == textZ) {
				int zValue = Integer.parseInt(textZ.getText());
				Fib.setZ(zValue);
				textZ.setText(Integer.toString(zValue));
			} else {
				for(JTextField item : AllTextFields) {
					if(e.getSource() == item) {
						item.setText("...");
					}
				}
				
			}
		}
		
	}
	
	public class FizzBuzzListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {;
			fizzbuzz.isDivisible();
			Results.setText(fizzbuzz.displayFB());
		}
		
	}
	
	public class FibonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {;
			Results.setText(Fib.FibSeq());
		}
		
	}
	
	public class CombinedListener implements ActionListener, FocusListener{
			//N = is number of times this sequence displays
			/*fibonacci number % diva || fibnum % divb if divisible by diva display Fizz, 
			 * if divisible by divb display Buzz.
			 */
		@Override
		public void actionPerformed(ActionEvent e) {;
			FibTwo.FibCalc();
			FBTwo.isDivisible(FibTwo.getValueBin());
			Results.setText(FBTwo.displayFB());
		}

		@Override
		public void focusGained(FocusEvent e) {

		}
			
		@Override
		public void focusLost(FocusEvent e) {
			
			if(e.getSource() == textXreps) {
				int Xreps = Integer.parseInt(textXreps.getText());
				FibTwo.setN(Xreps);
				FBTwo.setN(Xreps);
				textXreps.setText(Integer.toString(FibTwo.getN()));
			}else if(e.getSource() == textY) {
				int yValue = Integer.parseInt(textY.getText());
				FibTwo.setY(yValue);
				textY.setText(Integer.toString(FibTwo.getY()));
			}else if (e.getSource() == textZ) {
				int zValue = Integer.parseInt(textZ.getText());
				FibTwo.setZ(zValue);
				textZ.setText(Integer.toString(FibTwo.getZ()));
			}else if(e.getSource() == X) {
					X.setText(Integer.toString(FibTwo.getN()));
			}else if(e.getSource() == textDivA) {
				int divA = Integer.parseInt(textDivA.getText());
				FBTwo.setDivA(divA);
				textDivA.setText(Integer.toString(FBTwo.getDivA()));
			}else if(e.getSource() == textDivB) {
				int divB = Integer.parseInt(textDivB.getText());
				FBTwo.setDivB(divB);
				textDivB.setText(Integer.toString(FBTwo.getDivB()));
			}else if(e.getSource() == textFizz) {
				FBTwo.setFizz(textFizz.getText());
				textFizz.setText(FBTwo.getFizz());
			}else if(e.getSource() == textBuzz) {
				FBTwo.setBuzz(textBuzz.getText());
				textBuzz.setText(FBTwo.getBuzz());
			}else {

					
			}
		}
		
	}
		
	
	
	
	
	public static void main(String[] args) {
		Program Combined = new Program();
	}

}
