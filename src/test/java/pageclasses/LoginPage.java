package pageclasses;

public class LoginPage {

		public  String getUserName()
		{
			String uname="//input[@id='username']";
			return uname;
		}
		
		public  String clikcContinue()
		{
			String btncontinue="//button[contains(text(),'Continue')]";
			return btncontinue;
		}
		
		public  String getPassword()
		{
			String password="//input[@id='password']";
			return password;
		}
		
		public  String clickSubmit()
		{
			String btnsubmit="//button[@type='submit']";
			return btnsubmit;
			
			
		}
		
}
