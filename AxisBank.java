package week3.day2;

public class AxisBank extends BankInfo {
	public  void deposit() {
		System.out.println("deposite :"+5000);
     }
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
	}
}
