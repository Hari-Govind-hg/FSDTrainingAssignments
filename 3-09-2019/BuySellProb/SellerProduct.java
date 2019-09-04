import java.util.ArrayList;
import java.util.List;

public class SellerProduct {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(101,"Maaza",25,8);
		Product p2= new Product(102,"Lays",10,2);
		Product p3 = new Product(103,"Tiger",20,5);
		
		Seller s1 = new Seller(44);
		s1.prodSell.add(p1);
		s1.prodSell.add(p2);
		s1.prodSell.add(p3);
		
		s1.defaultPrice(101);
		s1.defaultPrice(102);
		s1.defaultPrice(103);
		
		s1.changePrice(101, 30);
		s1.changePrice(102, 15);
		s1.changePrice(103, 25);
		s1.changePrice(103, 3);
		
		Buyer b1 = new Buyer(123,s1);
		b1.buyProduct(101, s1);
		b1.buyProduct(102, s1);
		b1.buyProduct(103, s1);
		b1.buyProduct(102, s1);
		b1.buyProduct(102, s1);
		b1.buyProduct(103, s1);
		b1.buyProduct(102, s1);
		
		b1.mostBoughtItem(s1);
		
		Buyer b2 = new Buyer(124,s1);
		b2.buyProduct(102, s1);
		b2.buyProduct(102, s1);
		b2.buyProduct(102, s1);
		b2.buyProduct(102, s1);
		b2.buyProduct(103, s1);
		b2.buyProduct(102, s1);
		b2.buyProduct(103, s1);
		
		s1.salesReturns(b1, b2);
		
		System.out.println("====================================================================================================================================");
		Product p4 = new Product(104,"Heinz",100,5);
		Product p5= new Product(102,"Lays",10,2);
		Product p6 = new Product(106,"Kwality Walls",120,30);

		Seller s2 = new Seller(55);
		s2.prodSell.add(p4);
		s2.prodSell.add(p5);
		s2.prodSell.add(p6);
		
		s2.defaultPrice(104);
		s2.defaultPrice(102);
		s2.defaultPrice(106);
		
		Buyer b3 = new Buyer(124,s2);
		b3.buyProduct(104, s2);
		b3.buyProduct(104, s2);
		b3.buyProduct(102, s2);
		b3.buyProduct(104, s2);
		b3.buyProduct(102, s2);
		b3.buyProduct(104, s2);
		b3.buyProduct(106, s2);
		
		b3.mostBoughtItem(s2);
		
		Buyer b4 = new Buyer(123,s2);
		b4.buyProduct(104, s2);
		b4.buyProduct(102, s2);
		b4.buyProduct(103, s2);
		b4.buyProduct(102, s2);
		b4.buyProduct(106, s2);
		b4.buyProduct(106, s2);
		b4.buyProduct(106, s2);
		b4.mostBoughtItem(s2);
		
		s2.salesReturns(b3, b4);
	}
}
