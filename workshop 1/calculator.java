import java.util.Scanner;

public class calculator {
	
	public static void main (String args[]) {
		
		int num1, num2, result=0;
		String op;
		CalcFun ThinkTank;
		
		Scanner input = new Scanner(System.in);
		
		num1 = input.nextInt();
		op = input.next();
		num2 = input.nextInt();
		
		ThinkTank = new CalcFun(num1, num2);
		
		switch (op) {
			case ("+"): {
				result = ThinkTank.add();
				break;
			}
			case ("-"): {
				result = ThinkTank.sub();
				break;
			}
			case ("*"): {
				result = ThinkTank.mul();
				break;
			}
			case ("/"): {
				result = ThinkTank.div();
				break;
			}
		}
		
		System.out.println(result);
		
		input.close();
		
	}
	
}