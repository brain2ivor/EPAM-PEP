package costing;

public class cost {
	public int val(int c,int area,boolean fah) {
		if (fah){
			return c*area*2500;
		}
		else {
			if(c==1) {
				return c*area*1200;
			}
			else if(c==2) {
				return c*area*1500;
			}
			else {
				return c*area*1800;
			}
		}
	}
}
