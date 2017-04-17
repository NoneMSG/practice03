//3공백+공백4 이런식으로 만들도록 입력은 String으로 받는다
//연산자와 피연산자를 공백으로 구분할 수 있도록
//String[] tokens = exp.split(" "); 공백을 주어서 분류할 수 있게
//조건문으로 연산자를 찾아낸다 if("+".equals(tokens[1]))
package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print("input: ");
			String input = scanner.nextLine(); 
			if("quit".equals(input)){
				System.out.println("System Shut Down");
				break;
			}
			String[] tokens = input.split(" ");
			
			if("+".equals(tokens[1])){
				Add plus = new Add();
				plus.setX(Integer.parseInt(tokens[0]));
				plus.setY(Integer.parseInt(tokens[2]));
				System.out.println(plus.calculate1());
			}else if("-".equals(tokens[1])){
				Sub sub = new Sub();
				sub.setX(Integer.parseInt(tokens[0]));
				sub.setY(Integer.parseInt(tokens[2]));
				System.out.println(sub.calculate1());
			}else if("*".equals(tokens[1])){
				Mul mul = new Mul();
				mul.setX(Integer.parseInt(tokens[0]));
				mul.setY(Integer.parseInt(tokens[2]));
				System.out.println(mul.calculate1());
			}else if("/".equals(tokens[1])){
				Div div = new Div();
				div.setX(Integer.parseInt(tokens[0]));
				div.setY(Integer.parseInt(tokens[2]));
				System.out.println(div.calculate1());
			}
			
		}
		
		//scanner.close();

	}

}
