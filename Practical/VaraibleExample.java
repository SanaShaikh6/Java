class VaraibleExample {
	static int num = 55; //static 
	long num1 =54321980; //instance
	
	public void display(){ //nonstatic
	char a= 'M'; //local
	double num2= 45.355;
	system.out.println("local variable value : " +a); //printing local variable
	system.out.println("local variable value : " +num2); 
	}
	
	public static void calc(){
		double b = 99.34;
		double c = 45.23;
		double res =b* c; 
		system.out.println("Result is :" +res);
	}
	
public static void main (String args[]) {
	VaraibleExample obj = new VaraibleExample(); //object creation 
	obj.display(); //invoke nonstatic method with obj
	calc(); //invoke static method 
	
	