package bookApplication;
import java.util.Scanner;


public class bookApplication {
	static Scanner sc = new Scanner(System.in);
	static double quantity;
	
	public static void main(String[] args) {
	
		Bookdata b = new Bookdata("Chetan Bhagat", 85.00, 600, "2 States", "fiction", true);
	
			System.out.println(b.getAuthor());
			System.out.println(b.getPrice());
			System.out.println(b.getpagecount());
			System.out.println(b.gettitle());
			System.out.println(b.getdescription());
			System.out.println(b.getInstock());
			System.out.println("enter no. of quatity: ");
			quantity = sc.nextDouble();
			System.out.println("Total amount " + b.getpricecal(quantity));
		
			
			
			b.setPrice(90.80);
			System.out.println(b.getAuthor());
			System.out.println(b.getPrice());
			System.out.println(b.getpagecount());
			System.out.println(b.gettitle());
			System.out.println(b.getdescription());
			System.out.println(b.getInstock());
			System.out.println("enter no. of quatity: ");
			quantity = sc.nextDouble();
			System.out.println("Total amount " + b.getpricecal(quantity));
			
			Bookdata j =new Bookdata("Tendulkar" ,97.00 ,900 ,"Playing its My way", "non-fiction", false );
			System.out.println(j.getAuthor());
			System.out.println(j.getPrice());
			System.out.println(j.getpagecount());
			System.out.println(j.gettitle());
			System.out.println(j.getdescription());
			System.out.println(j.getInstock());
			if (j.getInstock() == false)
			{
				System.out.println("not in stock");
				
			}
			else {
				
			System.out.println("enter no. of quatity: ");
			quantity = sc.nextDouble();
			System.out.println("Total amount " + j.getpricecal(quantity));
			}
			
			
			j.setInstock(true);
			System.out.println(j.getAuthor());
			System.out.println(j.getPrice());
			System.out.println(j.getpagecount());
			System.out.println(j.gettitle());
			System.out.println(j.getdescription());
			System.out.println(j.getInstock());
			if (j.getInstock() == false)
			{
				System.out.println("not in stock");
				
			}
			else {
				
			System.out.println("enter no. of quatity: ");
			quantity = sc.nextDouble();
			System.out.println("Total amount " + j.getpricecal(quantity));
			}
			
		}
}
