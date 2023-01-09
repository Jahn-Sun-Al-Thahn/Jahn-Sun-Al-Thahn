import java.util.ArrayList;
import java.util.Iterator;

public class FizzBuzz implements Divisor, DisplayFizzBuzz{
	private int n;
	private int divA;
	private int divB;
	private ArrayList<String> Sequence;
	private String Fizz;
	private String Buzz;
	
	public FizzBuzz() {
		Sequence = new ArrayList<String>();
		setDivA(3);
		setDivB(5);
		setFizz("Fizz");
		setBuzz("Buzz");
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getDivA() {
		return divA;
	}
	public void setDivA(int divA) {
		this.divA = divA;
	}
	public int getDivB() {
		return divB;
	}
	public void setDivB(int divB) {
		this.divB = divB;
	}
	public String getFizz() {
		return Fizz;
	}
	public void setFizz(String fizz) {
		Fizz = fizz;
	}
	public String getBuzz() {
		return Buzz;
	}
	public void setBuzz(String buzz) {
		Buzz = buzz;
	}
	
	@Override
	//Checks if divisible between Both Divisors, Then each divisor separately.
	public void isDivisible(ArrayList<Integer> Value) {
		for(int i = 0; i < n-1; i++) {
			if(Value.get(i) % divA == 0 && Value.get(i) % divB == 0) {
				Sequence.add(Fizz + Buzz);
			}else if(Value.get(i) % divA == 0){
				Sequence.add(Fizz);
			}else if(Value.get(i) % divB == 0) {
				Sequence.add(Buzz);
			}else {
				Sequence.add(Integer.toString(Value.get(i)));
			}
		}
	}
	
	public void isDivisible() {
		for(int i = 0; i < n; i++) {
			if(i % divA == 0 && i % divB == 0) {
				Sequence.add(Fizz + Buzz);
			}else if(i % divA == 0){
				Sequence.add(Fizz);
			}else if(i% divB == 0) {
				Sequence.add(Buzz);
			}else {
				Sequence.add(Integer.toString(i));
			}
		}
	}

	public String displayFB() {
		String Send = "";
		Iterator<String> I = Sequence.iterator();
		while(I.hasNext()) {
			Send += I.next() + ", ";
		}
		return Send;
	}
	
}


