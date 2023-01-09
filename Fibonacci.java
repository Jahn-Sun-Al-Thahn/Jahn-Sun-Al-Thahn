import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {
	private int N,y,z;
	ArrayList<Integer> ValueBin;
	
	public Fibonacci() {
		ValueBin = new ArrayList<Integer>();
		setN(1);
		setY(1);
		setZ(2);
	}
	
	
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public ArrayList<Integer> getValueBin() {
		return ValueBin;
	}

	public void setValueBin(ArrayList<Integer> valueBin) {
		ValueBin = valueBin;
	}
	
	public void FibCalc() {
		int a, b, sum;	
		ValueBin.add(0);
		ValueBin.add(1);
		if(y == 1 && z == 2) {
			for(int i = 0,p = N; p >= i; i++) {
				sum = ValueBin.get(i) + ValueBin.get(i + 1);
				ValueBin.add(sum);
			}
		}else {
			for(int i = 0,p = N; p >= i; i++) {
				sum = ValueBin.get(i) + ValueBin.get(i + 1);
				ValueBin.add(sum);
			}
			
			for(int i = 0; i < ValueBin.size();) {
				if(i + y > ValueBin.size()) {
					a = 1;
				}else {
					a = ValueBin.get(i + y);
				}
			
				if(i + z > ValueBin.size()) {
					b = 1;
				} else {
					b = ValueBin.get(i + z);
				}
				sum = ValueBin.get(a) + ValueBin.get(b);
				i++;
				if(i >= 2) {
					ValueBin.add(i, sum);
				}
			}

		}
	}
		

	
	public String FibSeq() {
		String Send;
		Send = "Unused";
		if(Send == "Unused") {
			Send = "";
			FibCalc();
			for(int i = 0; i < N; i++) {
				Send += ValueBin.get(i) + ", ";
			}
			return Send;
		}
		return Send;
	}

}
