
public class Shopmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product productobj = new Product();
		
		productobj.setProductId(101);;
		productobj.setProductname("Laptop");;
		productobj.setProductprice(30000);
		productobj.setProductquantity(4);
		
		System.out.println("Product ID : "+productobj.getProductId());
		System.out.println("Product Name : "+productobj.getProductname());
		System.out.println("Product Price : "+productobj.getProductprice());
		System.out.println("Product Quantity : "+productobj.getProductquantity());
	}

}
