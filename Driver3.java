import java.util.Scanner;
public class Driver3{
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
				//System.out.println(x.contains("@"));
				if(x.contains(".")){
					//System.out.println(x.contains("."));
					if(x.indexOf("@")>0){
						//System.out.println(x.indexOf("@")>0);
						int a=x.length();
						int y=x.indexOf(".");
						int z=a-y;
						if(z<5){
							System.out.println("valid email");
							System.out.println("Thank You!!");

						}else{
							System.out.println("Invalid email Address");
							System.out.println("Please Try Again....");
						}
						

					}else{
						System.out.println("Invalid email Address");
						System.out.println("Please Try Again....");
					}

				}else{
					System.out.println("Invalid email Address");
					System.out.println("Please Try Again....");
				}
				
			}else{
				System.out.println("Invalid email Address");
				System.out.println("Please Try Again....");
			}
//................................................................................
			/*StringBuffer s1=new StringBuffer("Chamara.Com");
			System.out.println(s1.length());
			System.out.println(s1.indexOf("."));
			int a=s1.length();
			int y=s1.indexOf(".");
			int z=a-y;
			System.out.println(z);*/


		}
		catch(Exception e){
			System.out.println("Invalid email-ID ");


		}

			
		System.out.println("End");
	}
}