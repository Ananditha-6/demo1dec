package pageclasses;

import org.testng.annotations.Listeners;



public class RegisterPatient 
{
	
	
	public static String addPatientButton()	
	{
		String addPatientButton="//button[@name='AddPatientIcon']";
		return addPatientButton;
	}
	
	public static String patientIdentity()	
	{
		String identitybutton="(//span[@class='cds--content-switcher__label'])[1]";
		return identitybutton;
	}
	
	public static String firstname()	
	{
		String fistname="//input[@id='givenName']";
		return fistname;
	}
	

	public static String lastname()	
	{
		String lastname="//input[@id='familyName']";
		return lastname;
	}
	
	public static String gender()	
	{
		String gender="(//span[@class='cds--radio-button__appearance'])[1]";
		return gender;
	}
	
	
	public static String DObButton()	
	{
		String dob="(//span[@title='No'])[2]";
		return dob;
	}
	
	public static String age()	
	{
		String age="//input[@id='yearsEstimated']";
		return age;
	}
	
	public static String adress()	
	{
		String adress="//input[@id='address1']";
		return adress;
	}
	
	public static String registerbtn()	
	{
		String registerbtn="//button[contains(text(), 'Register patient')]";
		return registerbtn;
	}
	
	public static String validatepatid()	
	{
		String validatepatid="//span[contains(text(),'OpenMRS ID')]";
		return validatepatid;
	}
	
	public static String closepg()	
	{
		String closepgbtn="//button[@aria-label='Close']";
		return closepgbtn;
	}
	
	
	
	//button[@aria-label='Close']
	
}

