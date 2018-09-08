public class Person{
	private String name;
	public int dob;
	public String address;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void eat(String food){
		System.out.println("Person is eating "+food);
	}
}