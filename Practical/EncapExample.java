class Student{
	
	//private data members
	private int rollno;
	private String name;
	private int age;
	private String clgname;
	
	//getter setter method
	public int getRollno(){
		return rollno;
	}
	
	public void setRollno(int rollno){
		this.rollno = rollno;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getClgname(){
		return clgname;
	}
	
	public void setClgname(String clgname){
		this.clgname = clgname;
	}
	
}

class EncapExample{
	public static void main(String args[]){
		
		Student s = new Student();
		s.setRollno(32039);
		s.setName("Sana Shaikh");
		s.setAge(20);
		s.setClgname("Tilak clg");
		
		System.out.println("Values are :" + s.getRollno() + " " + s.getName() + " " + s.getAge() + " " + s.getClgname());
	}
}
	