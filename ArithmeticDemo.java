class ArithmeticDemo{
	public void cal(){
		int a=50;
		int b=30;
		System.out.println("Addition: " +(a+b));
		System.out.println("Subtraction: " +(a-b));
		System.out.println("Division: " +(a/b));
		System.out.println("Multiply " +(a*b));
		System.out.println("Modulus: " +(a%b));
	}
	public static void main(String args[]){
		ArithmeticDemo id = new ArithmeticDemo();
		id.cal();
	}
}