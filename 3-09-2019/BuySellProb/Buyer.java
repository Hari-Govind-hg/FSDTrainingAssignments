public class Buyer {
	int buyerNo;
	int[] buyNum;
	
	Buyer() {
		super();
	}
	
	Buyer(int buyerNo,Seller s1)
	{
		this.buyerNo = buyerNo;
		this.buyNum = new int[s1.prodSell.size()];
	}
	
	void buyProduct(int prodId,Seller s1)
	{
		
		
		int k=0;
		
		for(Product pList:s1.prodSell)
		{
			if(pList.prodId==prodId)
				{
//					s1.returns[k]+=s1.prodSell.get(k).sellPrice;
					this.buyNum[k]++;
//					System.out.println("Returns of prod "+s1.prodSell.get(k).prodName +" is "+s1.returns[k]);
				}
			k++;

		}
	}
	
	
	void mostBoughtItem(Seller s1)
	{
		int max=0;
		int k=0;
		for(int i=0;i<this.buyNum.length;i++)
		{	
			if(buyNum[i]>max)
			{
				max=buyNum[i];
				k=i;
			}
		}
		Product temp=new Product();
		temp=s1.prodSell.get(k);
		System.out.println("Most Bought Item");
		temp.displayProduct();
		System.out.println(max+" units of the the product was bought by the customer\n");
	}
	
}
