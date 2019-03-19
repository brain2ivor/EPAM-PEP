package simple_interest;

public class test {
	public static void main(String[] args) {
		si i = new si();
		int p=10000,t=5;
		double r=7.5;
		System.out.println("Simple interest="+i.sinterest(p, r, t));
		System.out.println("Compound Inteerest="+i.cinterest(p, r, t));
	}
}
