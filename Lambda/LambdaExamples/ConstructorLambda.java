package LambdaExamples;

@FunctionalInterface
interface SayableC{
	void say();
}

interface Messanger{
	Student getMessage(String msg);
}

class Student{
	String name;
	Student(){
		System.out.println("Default Constructor");
	}
	Student(String name){
	this.name=name;	
	System.out.println(this.name);
		}
}
public class ConstructorLambda {

	public static void main(String[] args) {
		//Calling of Default Construtor
		SayableC obj=Student::new;
		obj.say();
		//Calling of Parameterized Constructor
		Messanger obj1=Student::new;
		obj1.getMessage("Babita");

	}
	

}

