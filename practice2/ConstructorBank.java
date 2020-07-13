package practice2;

public class ConstructorBank {
	int cusId =0;
	String cusName =null;
	String cusAdd =null;
	String accType =null;
	double cusBalance = 0;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAdd() {
		return cusAdd;
	}
	public void setCusAdd(String cusAdd) {
		this.cusAdd = cusAdd;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getCusBalance() {
		return cusBalance;
	}
	public void setCusBalance(double cusBalance) {
		this.cusBalance = cusBalance;
	}
	public ConstructorBank(int cusId,String cusName,String cusAdd) {
		setCusId(cusId);
		setCusName(cusName);
		setCusAdd(cusAdd);
	}
	public ConstructorBank(int cusId,String cusName) {
		setCusId(cusId);
		setCusName(cusName);
	}
	public ConstructorBank(int cusId,String cusName,String cusAdd,String accType,double cusBalance) {
		setCusId(cusId);
		setCusName(cusName);
		setCusAdd(cusAdd);
		setAccType(accType);
		setCusBalance(cusBalance);
	}
	@Override
	public String toString() {
		return cusId+","+cusName+","+cusAdd+","+accType+","+cusBalance;
	}
	public static void main(String[] args) {
		ConstructorBank bank = new ConstructorBank(1001,"kumar","rajininagar,chennai");
		System.out.println(bank);
		ConstructorBank bank1 = new ConstructorBank(1002,"raja");
		System.out.println(bank1);
		ConstructorBank bank2 = new ConstructorBank(1001,"kumar","rajininagar,chennai","savings",1500);
		System.out.println(bank2);
	}
}
