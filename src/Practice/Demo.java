package Practice;

public class Demo {
	int i;
	int j;
	 public Demo() {
		 i=1;
		 j=2;
	}
public static void main(String[] args) {
	 Demo d1=new Demo();
	 Demo d2=new Demo();
	 System.out.println(d1.equals(d2));
}
}
