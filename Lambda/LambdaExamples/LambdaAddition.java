package LambdaExamples;
interface Division{
	int divide(int a, int b);
}
interface display{
	void show();
}
public class LambdaAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Division obj=(a,b)->{
			if(b!=0)
				return a/b;
			else
				return 0;
		};
		
		System.out.println(obj.divide(5, 3));
		Division obj1=(a,b)-> a+b;
		System.out.println(obj1.divide(4,6));
		
		display d= ()-> System.out.println("Hello");
		d.show();
	}

}
