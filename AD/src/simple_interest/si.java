package simple_interest;

public class si {
	public double sinterest(int p,double r,int t) {
		return (p*r*t)/100;
	}
	public double cinterest(int p,double r,int t) {
		return p*(1+Math.pow((r/100), t));
	}
}
