package Practice;

import java.util.ArrayList;
import java.util.List;

public class TestPassByValue {

	public static void main(String[] args) {
		
	    int[] l = new int[10];
		l[0]  = 1;
		l[1] = 2;
		System.out.println(l.length);
		addEle(l);
		l[3] = 4;
		for(int e=0; e <l.length ; e++) {
			System.out.println("Value  of " + e +  " is " + l[e]);
		}
		

	}

	private static void addEle(int[] l) {
		l[2] = 3;
	}

}
