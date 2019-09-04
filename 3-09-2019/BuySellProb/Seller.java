import java.util.ArrayList;
import java.util.List;

public class Seller {
		int sellerId;
		int returns;
		List<Product> prodSell = new ArrayList<Product>();
		
		Seller(){
			
		}
		
		public Seller(int sellerId) {
			super();
			this.sellerId = sellerId;
		}
		
		void displaySeller()
		{
			System.out.println("Seller ID :" +this.sellerId);
			
			
			for(Product p:this.prodSell)
			{
				p.displayProduct();
				
			}
		}

		void changePrice(int productId,int sellingPrice)
		{	
			for(Product p:prodSell)
				if(p.prodId==productId)
					if(sellingPrice<=(p.costPrice-1)) {
						System.out.println("Selling Price Lower Than Cost Price! Possible Loss Scenario!!!");
						System.out.println("Price of : "+ p.prodName +" not changed!!");
					}
					else if(sellingPrice>(p.costPrice-1))
					{p.sellPrice=sellingPrice;}
		}
		
		void defaultPrice(int productId) {
			for(Product p:prodSell) {
				if(p.prodId == productId) {
					p.sellPrice=p.prodPrice;
				}
			}
		}
		
		void salesReturns(Buyer b1,Buyer b2) {
			int flag = 0;
			int k=0,j=0;
			for(Product p:this.prodSell) {
				int temp = 0;
				temp = (prodSell.get(k).sellPrice*b1.buyNum[k])+(prodSell.get(k).sellPrice*b2.buyNum[k]);
				System.out.println(temp);
				if(temp>flag) {
					flag = temp;
					j=k;
				}
				k++;
			}
			System.out.println("Most revenue product: "+prodSell.get(j).prodName);
			System.out.println("Revenue : "+flag );
			this.returns =flag;
		}
}
