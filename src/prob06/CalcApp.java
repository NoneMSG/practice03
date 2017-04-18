//3공백+공백4 이런식으로 만들도록 입력은 String으로 받는다
//연산자와 피연산자를 공백으로 구분할 수 있도록
//String[] tokens = exp.split(" "); 공백을 주어서 분류할 수 있게
//조건문으로 연산자를 찾아낸다 if("+".equals(tokens[1]))
package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calc arith = null;
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print("input: ");
			String input = scanner.nextLine();
			
			if("quit".equals(input)){
				System.out.println("System Shut Down");
				break;
			}
			String[] tokens = input.split(" ");
			int x = Integer.parseInt(tokens[0]);
			int y = Integer.parseInt(tokens[2]);
			if("+".equals(tokens[1])){
				arith=new Add();
				arith.setX(Integer.parseInt(tokens[0]));
				arith.setY(Integer.parseInt(tokens[2]));
				System.out.println(arith.cal());
			}else if("-".equals(tokens[1])){
				arith=new Sub();
				arith.setX(Integer.parseInt(tokens[0]));
				arith.setY(Integer.parseInt(tokens[2]));
				System.out.println(arith.cal());
			}else if("*".equals(tokens[1])){
				arith=new Mul();
				arith.setX(Integer.parseInt(tokens[0]));
				arith.setY(Integer.parseInt(tokens[2]));
				System.out.println(arith.cal());
			}else if("/".equals(tokens[1])){
				arith=new Div();
				arith.setX(Integer.parseInt(tokens[0]));
				arith.setY(Integer.parseInt(tokens[2]));
				System.out.println(arith.cal());
			}
		}
		scanner.close();
	}
}
