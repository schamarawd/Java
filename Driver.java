import java.util.Scanner;
public class Driver{
	public static void main (String args[]){
	/*Student st1=new Student();
	st1.eat("rice");
	st1.setName("Kamal");
	System.out.println(st1.getName());

	Teacher tch1=new Teacher();
	tch1.eat("Noodles");
	}
	*/
/*//passing integer values 


	int x= Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	System.out.println(x+y);
*/

	System.out.println("Start");
	Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter 1st Value :");
			int x=sc.nextInt();

		System.out.println();

		System.out.print("Please Enter 2nd Value :");
			int y=sc.nextInt();

		try{
			int z=x/y;

		System.out.println("Answer is : "+z);

		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero ");


		}

			
		System.out.println("End");
	}
}