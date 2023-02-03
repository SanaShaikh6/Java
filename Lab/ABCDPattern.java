//Write a program to print Left down alphabet triangle pattern using loop
//ABCDE
//ABCD
//ABC
//AB
//A

public class ABCPattern {
	public void abcdePattern()
	{
		int rows=5;
		int code=65;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows-i;j++)
			{
				System.out.print(" "+(char)(code+j));
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		ABCPattern obj= new ABCPattern();
		
		obj.abcdePattern();
	}

}

