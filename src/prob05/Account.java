package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	Account(){
		
	}
	Account(String accountNum){
		this.accountNo =accountNum;
		System.out.println(this.accountNo+"계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save(int money){
		System.out.println(getAccountNo()+"계좌에"+money+"만원이 입금 되었습니다.");
		this.balance += money;
	}
	public void deposit(int money){
		System.out.println(getAccountNo()+"계좌에"+money+"만원이 출금 되었습니다.");
		this.balance -= money;
	}
	
}
