package encapsulations;

class facebook_login
{
	private String username="bindhu@gail.com";
	private String password = "Bindhu@345";
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	
}

public class encapsulation_prgm2 {

	public static void main(String[] args)
	{
		
		facebook_login f1 = new facebook_login();
		f1.setUsername("Grotechmindze@gmail.com");
		f1.setPassword("Grotech@123");
		System.out.println(f1.getUsername());
		System.out.println(f1.getPassword());
	}

}
