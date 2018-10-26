package POMEG;

public class EncapsulationB {
	public static void main(String[] args) {
		EncapsulationA a1=new EncapsulationA(0);
		a1.setValue(10);
		int j=a1.getValue();
		System.out.println(j);
		
		/*a1.i=10;//error
		int j=a1.i;//error
*/	}

}
