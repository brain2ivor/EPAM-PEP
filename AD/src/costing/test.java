package costing;
import java.io.IOException;
import java.util.*;
public class test {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose onr of the following");
		System.out.println("1. Standard maaterials");
		System.out.println("2. Above Standard materials");
		System.out.println("3. High Standard materials");
		int c = sc.nextInt();
		System.out.println("Enter your area");
		int area = sc.nextInt();
		System.out.println("Need fully automated house?");
		boolean fah = sc.nextBoolean();
		cost val= new cost();
		System.out.println("Total cost="+val.val(c, area, fah));
	}

}
