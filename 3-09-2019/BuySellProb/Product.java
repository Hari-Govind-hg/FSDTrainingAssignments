
public class Product {
	int prodId;
	int prodPrice;
	int sellPrice;
	int costPrice;
	String prodName;
	
	public Product(int prodId,String prodname, int prodPrice ,int costPrice) {
		super();
		this.prodId = prodId;
		this.prodPrice = prodPrice;
		this.prodName = prodname;
		this.costPrice = costPrice;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	void displayProduct()
	{
		System.out.println("Product ID :" +this.prodId);
		System.out.println("Product Name :" +this.prodName);
		System.out.println("Product Price :" +this.prodPrice);
		System.out.println("Selling Price :" +this.sellPrice);
		
		
	}

	@Override
	public String toString() {
		return "\n Product [id=" + prodId + ", Product Name="+ prodName +", Product Price " + prodPrice +"]";
	}
}
