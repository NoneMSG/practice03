package prob02;

public class Goods {
	private int stock;
	private String name;
	private int price;
	
	public Goods(){}
	public Goods(String name, int price, int stock){
		this.price = price;
		this.name = name;
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show(){
		System.out.println(this.name+"(가격: "+getPrice()+")이 "+this.stock+"개 입고 되었습니다.");
	}
	
}
