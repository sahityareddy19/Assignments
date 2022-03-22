package pro3;
import java.util.*;

public class calculatortest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value");
		int a= in.nextInt();
		System.out.println("enter b value");
		int b = in.nextInt();
		calculator c = new calculator();
		c.add(a, b);
		c.sub(a, b);
		c.mul(a, b);
		c.div(a, b);	
		in.close();		
	}

}
