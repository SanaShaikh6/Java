public class logicDemo {
     
    public static void main(String args[]) {
        System.out.println("Logical operator &&");
        System.out.println((10>5) && (2>1));//true
        System.out.println((10>5) && (2<1));//flase
        System.out.println((10<5) && (2<1));//flase 

        System.out.println("Bitwise AND");
        System.out.println((10>5) & (2<1));//flase 

        System.out.println("Logical operator ||");
        System.out.println((10>5) || (2>1));//true
        System.out.println((10>5) || (2<1));  //true
        System.out.println((10<5) || (2<1));   //flase
        
        System.out.println("Bitwise or |");
        System.out.println((10<5) | (2<1));   //flase
        
        
        System.out.println("Logical operator NOT");
        System.out.println(!(10>5));//false
        System.out.println(!(10<5));//true

        System.out.println("conditional");
        int a = 2;
        int b = 3;
        int c= (a < b) ? a : b;
        System.out.println(c);
	}
}
