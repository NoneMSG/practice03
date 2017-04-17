package prob06;

public class Sub extends Calc{
	public int getX() {
		return super.getX();
	}
	public void setX(int x) {
		super.setX(x);
	}
	public int getY() {
		return super.getY();
	}
	public void setY(int y) {
		super.setY(y);;
	}
	public int calculate1(){
		return getX() - getY(); 
	}
}
