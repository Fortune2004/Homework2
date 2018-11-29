package homework;

public class Computer {
	String demandNprice;
	String model;
	int price;
	char type;
	boolean bestquality;
	static int marketSharePrice;
	
	public Computer() {
	System.out.println("This is from default construction and will explain the demand and quality of this computer");}
	
	public Computer (String demandNprice) {;
	this.demandNprice = demandNprice;
	System.out.println("Computer's price depends on demand");}
	
	public Computer (String demandNprice, String model, int price, char type) {
	this.demandNprice = demandNprice;
	this.model = model;
	this.price = price;
	this.type = type;
	System.out.println("Computer price depneds on : "+demandNprice+" "+"model"+" "+"price"+" "+"type");
	}
	public void computerPrice() {
		System.out.println(demandNprice+","+model+", price: "+price+ ", Category type: "+type);
	}
	public void marketSharePrice(int marketSharePrice ) {
		Computer.marketSharePrice = marketSharePrice;
	}
	public int getmarketSharePrice() {
		return marketSharePrice;
	}
	public static void aboutComputer() {
		System.out.println("The research for computer demand and price is done");
		
		
	
		
		
		
		
	
	
	
         

	
		
	}
	

}
