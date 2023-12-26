package bnm;


class Student{
	int stdId;
	String stdName;
	
//	void input(int id,String name)
//	{
//		stdId=id;
//		stdName=name;
//	}
	// constructor method
	Student(int id,String name)
	{
		stdId=id;
		stdName=name;
	}
	
	void display()
	{
		System.out.println("Student id = "+stdId);
		System.out.println("Student name = "+stdName);
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		Student std1=new Student(25,"Sachin");
		//std1.input(23,"Saurav");
		std1.display();
	}

}
