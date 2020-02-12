import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		//declare variable and integer and string
		double temperature;
		double wind_speed;
		double WindChill;
		String programer_name="avenir T";
		
		Scanner sc= new Scanner(System .in);
		
		//displays user imput
		 System.out.println("Wind Chill Calculator");
		 System.out.println("enter temparature in farhenheit(must be >=-45 and <=40");
		 temperature= sc.nextDouble();
		 
		 System.out.println("enter wind speed(must be >=5 and =<60 ");
		 wind_speed=sc.nextDouble();
		
		 // display the windchill
		  if (temperature>=-45 && temperature<=40 && wind_speed>=5 && wind_speed <=60)
		  {
			  
			   double result = Math.pow(wind_speed, 0.16);
			   WindChill=  35.74+(0.6215*temperature-35.75*result)+(0.4275*temperature*result);
			  
			 //display result
					   System.out.println("will chill temperature is :"+ WindChill+"degree fahrenheit");
		  }
		  else {
			  System.out.println("Temperature in Faranheat(must be >=-45 and <=40): and wind speed(Must be >=5 and <=60)");
		  }
		
		System.out.println("programer name is :"+programer_name);
		

	}

}
