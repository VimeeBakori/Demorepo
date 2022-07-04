package testGit;

public class Calculater {

	public void addTest()
	{
		CalculaterTest cal= new CalculaterTest();
		int a=7;
		int b=10;
		int expres=17;
		int actres=cal.add(a,b);
		if(actres==expres)
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
		
	}

	
	public void mulTest()
	{
		CalculaterTest cal= new CalculaterTest();
		int a=7;
		int b=10;
		int expres=70;
		int actres=cal.multi(a,b);
		if(actres==expres)
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
		
	}

	

}
