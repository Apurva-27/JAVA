package ExceptionHandling;

class vaccinationn
{
	public static void ageValidation(int age)
	{
		try {
			
			if(age<18)
			{
				//*thow exception explicitly
				//throw new ArithmeticException("Age not valid for vaccination");
				throw new CovidVaccineValidException("Age not valid for vaccination");
			}
			else
			{
				System.out.println("Age is valid for vaccination");
			}	
		}
		catch(CovidVaccineValidException e)
		//catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
	}

}

public class thowDemo {

	public static void main(String[] args) {
		vaccinationn.ageValidation(13);
		vaccinationn.ageValidation(21);
	}

}
