public class CalcFun {
	
	int resault=0;
	int numa, numb;
	
	CalcFun(int num1, int num2){
		numa = num1;
		numb = num2;
		
	}
	
	public int add(){
		
		resault = numa + numb;
		
		return resault;
	}
	
	public int sub(){
		
		resault = numa - numb;
		
		return resault;
	}
	
	public int div(){
		
		resault = numa / numb;
		
		return resault;
	}
	
	public int mul(){
		
		resault = numa * numb;
		
		return resault;
	}
}