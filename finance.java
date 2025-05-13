abstract class Account{
	protected double accountNumber,principal;
	double in,T,R,an;
	void initial(int acc,double P,double R,double T){
		principal=P;
		this.R=R;
		this.T=T;
		an=acc;
	}
	abstract double interest();
	void display(){
		System.out.println("account number = "+an+"\n"+"principal = "+principal+"\n"+"rate = "+R+"\n"+"time = "+T+"\n"+"interest = "+in);
	}
}
class Simple extends Account{
	double SI;
	double interest(){
		SI=principal*R*T/100;
		in=SI;
		return SI;
	}
}
class Compound extends Account{
	double CI;
	double interest(){
		CI=(principal*(Math.pow((1+(R/100)),T)))-principal;
		in=CI;
		return CI;
	}
}
class finance{
	public static void main(String args[]){
		Simple obj1=new Simple();
		obj1.initial(12345,5000,10,2);
		obj1.interest();
		obj1.display();
		Compound obj2=new Compound();
		obj2.initial(12345,5000,10,2);
		obj2.interest();
		obj2.display();
	}
}