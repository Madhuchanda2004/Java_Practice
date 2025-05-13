import java.util.Scanner;

class Bank_Account
{
	String Account_Holder_Name,Account_Number,Account_type;
	double balance;
	Bank_Account(String a_h,String a_n,String a_t,double b){
		Account_Holder_Name=a_h;
		Account_Number=a_n;
		Account_type=a_t;
		balance=b;
	}
	double withdraw_money(double w){
		double r=balance;
		double res= r-w;
		if(res<1000){
			System.out.println("The minimum balance of the account is 1000 so money cannot be withdrawn");
		}
		else{
			return balance-w;
		}
		return balance;
	}
	double deposit_money(double d){
		return balance+d;
	}
}
class bank
{public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Account Holder Name: ");
	String a_h1=sc.nextLine();
	System.out.println("Enter the Account Number: ");
	String a_n1=sc.nextLine();
	System.out.println("Enter the Acccount Type: ");
	String a_t1=sc.nextLine();
	System.out.println("Enter the balance: ");
	double b1=sc.nextDouble();

	Bank_Account ob1=new Bank_Account(a_h1,a_n1,a_t1,b1);

	System.out.println("If you want to deposit type 0 and if withdraw type 1: ");
	int op=sc.nextInt();
	System.out.println("Account holder name: "+a_h1+"\n"+"Account number: "+a_n1+"\n"+"Account type"+a_t1+"\n"+"Balance: "+b1);

	if(op==1)
	{
		System.out.println("Enter the money to be withdrawn: ");
		double w1=sc.nextDouble();
		double res1=ob1.withdraw_money(w1);
		System.out.println("The balance is: "+res1);
	}
	else
	{
		System.out.println("Enter the money to be deposited: ");
		double d1=sc.nextDouble();
		double res2=ob1.deposit_money(d1);
		System.out.println("The balance is: "+res2);
	}

}
}

