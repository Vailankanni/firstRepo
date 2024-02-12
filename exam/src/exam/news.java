package exam;

public class news {
	
	float amt,rate;
	int period;
	String accno;
	
	news(float amt, float rate, int period){
		this.amt = amt;
		this.rate = rate;
		this.period = period;
	}
	
	float getamt() {
		return amt;
	}
	
	float getrate() {
		return rate;
	}
	
	void display() {
		float intt = amt * (rate/100)*period;
		System.out.println("SI: "+intt);
	}
}
