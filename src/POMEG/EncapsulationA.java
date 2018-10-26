package POMEG;

public class EncapsulationA {
	private int i;//declaration

		public  EncapsulationA(int i) {
		this.i = i;//initialization
	}
	
	public void setValue(int j) {
		i=j;
}
	public int getValue() {
		return i;//utilization
	}


}
