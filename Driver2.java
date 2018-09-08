import java.util.Scanner;
public class Driver2{
	public static void main (String args[]){
	System.out.println("Start");
	Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Your email address :");
			String x=sc.next();

		//	x.contains("@");

		System.out.println();
		try{

			//int z=x/y;

		//System.out.println("Answer is : "+x);
		//System.out.println(x.contains("@"));
			if(x.contains("@")){
				if(x.indexOf("@")>0){
					if(x.lastIndexOf(".")<4){
						System.out.println("Valid email");
					}else{
						System.out.println("Invalid email Address");
					}
					
				}else{
					System.out.println("Invalid");
				}
			}else{
				System.out.println("Invalid email");
			}

		}
		catch(Exception e){
			System.out.println("Invalid email-ID ");


		}

			
		System.out.println("End");
	}
}