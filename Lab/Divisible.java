//Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40.

public class Divisible {

	public void divBy4GreaterThan40() {
		
			for(int i=1;i<=100;i++)
			{
				if(i%5==0 && i>40)
				{
					System.out.print(i+" ");
				}
				
				
			}
		
	}
	public static void main(String[] args) {
		Divisible obj= new Divisible();
		System.out.println("Numbers from 1-100, which are divisible by 5, and greater than 40 :");
		obj.divBy4GreaterThan40();

	}

}