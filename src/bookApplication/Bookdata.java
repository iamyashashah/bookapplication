package bookApplication;

public class Bookdata {
	private String author;
	private long noOfPages;
	private double price;
	private String title;
	private String description;
	private boolean instock;
	private double quantity;
	private double totalprice;



	public Bookdata() {


	}
	public Bookdata (String name, double bookprice, long pageCount, String book_title, String book_description, boolean book_instock)
	{
		author = name;
		noOfPages = pageCount;
		price = bookprice;
		title = book_title;
		description = book_description;
		instock = book_instock;
		double pricecal = 0;
		totalprice = pricecal;

	}
	public void setAuthor(String name)
	{
		this.author= name;

	}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(double bookprice)
	{
		this.price= bookprice;

	}
	public double getPrice()
	{
		return price;
	}

	public void setpagecount(long pageCount)
	{
		this.noOfPages = pageCount;
	}

	public long getpagecount()

	{
		return noOfPages;
	}

	public void settitle(String book_title)
	{
		this.title = book_title;
	}

	public String gettitle()

	{
		return title;
	}


	public void setdescription(String book_description)
	{
		this.description = book_description;
	}

	public String getdescription()

	{
		return description;
	}

	public void setInstock(boolean book_instock)
	{
		this.instock = book_instock;
	}

	public boolean getInstock()

	{
		return instock;
	}
	
	public double getpricecal(double quantity)
	
	{
		double pricecal = 0;
		
		if (instock == true)
		{
			pricecal = price * quantity ;
		}
		return pricecal;
	}

}
