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
				if(x.indexOf("@")==x.lastIndexOf("@")){
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
									System.out.println("Invalid sub domain");
									System.out.println("Please Try Again....");
								}
						

							}else{
								System.out.println("Invalid email Address");
								System.out.println("a@example.com");
								System.out.println("Please Try Again....");
							}

					}else{
						System.out.println("Invalid email Address");
						System.out.println("Missing '.' ");
						System.out.println("Please Try Again....");
					}
				}else{
					System.out.println("Invalid email Address");
					System.out.println("Inserted 2 @s");
					System.out.println("Please Enter Valid email....");
				}
				
				
			}else{
				System.out.println("This is not a e-mail Address");
				System.out.println("Missing '@' ");
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

			/*Scanner s = new Scanner(System.in);
      		System.out.println("Enter String: ");
        	String str = s.nextLine();

        		for(int i=0;i<str.length()-1;i++){
            		for(int j=i+1;j<str.length();j++){
            				if(str.charAt(i)==str.charAt(j)){
               					 System.out.print(str.charAt(j));
            				}
            		}
        		}*/


		}
		catch(Exception e){
			System.out.println("Invalid email-ID ");


		}

			
		System.out.println("End");
	}
}