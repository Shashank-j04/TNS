package bnm;

class Students{
	int rollNo;
	String stdName;
	static String clgName = "BNMIT";
	
	Students(int r,String name)
	{
		rollNo=r;
		stdName=name;
	}
	
	void Display()
	{
		System.out.println("RollNo = "+rollNo+" Name = "+stdName);
		System.out.println("Clgname = "+clgName);
	}
}

public class StaticVar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std1=new Students(1,"wadzee");
		Students std2=new Students(2,"sb737");
		std1.Display();
		std2.Display();
	}

}
