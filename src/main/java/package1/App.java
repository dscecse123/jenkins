package package1;

public class App {
	public static String display(int m)
	{
		if(m<0||m>100)
			return "invalid";
		else if(m<40)
			return "Fail";
		else
			return "Pass";
	}
	public static void main(String[] args)
	{
		
	}
	
}
