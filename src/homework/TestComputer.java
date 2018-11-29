package homework;

public class TestComputer {

	public static void main(String[] args) {
       Computer comp1 = new Computer();
       comp1.demandNprice = "High, High";
       comp1.model = "Brand New";
       comp1.price = 100000;
       comp1.type = 'A';
       comp1.bestquality = true;
       //comp1.aboutComputer();
       
       comp1.computerPrice();
       comp1.marketSharePrice(2777);
       System.out.println("Computer price depends on: "+comp1.getmarketSharePrice()+" in 124.");
       
       Computer comp2 = new Computer ("X,Y");
       Computer comp3 = new Computer ("Z,M");
       Computer comp4 = new Computer ("R,T");
       comp4.marketSharePrice(124);
       System.out.println("Computer price depneds on: "+comp4.getmarketSharePrice()+"in 124");
       System.out.println("demand and quality of this computer: "+comp1.bestquality);
       
       //comp2.aboutComputer(); //why?
       System.out.println(Computer.marketSharePrice = 2777);
       
       Computer.aboutComputer();
       //comp3.aboutComputer();
       
       
       
    		   
       
       
       
       
       
       
       
       
       
       
    		   ;
       
       

	}

}
