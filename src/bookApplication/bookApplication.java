package bookApplication;
import java.util.Scanner;


public class bookApplication {

	public static void main(String[] args) {
	
		Bookdata b = new Bookdata("Chetan Bhagat", 85.00, 600, "2 States", "fiction", true);
	
			System.out.println(b.getAuthor());
			System.out.println(b.getPrice());
			System.out.println(b.getpagecount());
			System.out.println(b.gettitle());
			System.out.println(b.getdescription());
			System.out.println(b.getInstock());
			
			
			b.setPrice(90.80);
			System.out.println(b.getAuthor());
			System.out.println(b.getPrice());
			System.out.println(b.getpagecount());
			System.out.println(b.gettitle());
			System.out.println(b.getdescription());
			System.out.println(b.getInstock());
			
			Bookdata j =new Bookdata("Tendulkar" ,97.00 ,900 ,"Playing its My way", "non-fiction", false);
			System.out.println(j.getAuthor());
			System.out.println(j.getPrice());
			System.out.println(j.getpagecount());
			System.out.println(j.gettitle());
			System.out.println(j.getdescription());
			System.out.println(j.getInstock());
			
			
			j.setInstock(true);
			System.out.println(j.getAuthor());
			System.out.println(j.getPrice());
			System.out.println(j.getpagecount());
			System.out.println(j.gettitle());
			System.out.println(j.getdescription());
			System.out.println(j.getInstock());
			
		}
		
		

	}

