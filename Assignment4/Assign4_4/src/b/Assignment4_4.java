package b;

import java.util.*;

public class Assignment4_4 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		PriorityQueue<Product> pq = new
			PriorityQueue<Product>(5, new ProductComparator());
				
								Product product1 = new Product(1,"Coke", 13.2);
				
				
		
				pq.add(product1);
				Product product2 = new Product(2,"AmulMilk", 15.6);
						pq.add(product2);		
				Product product3 = new Product(3,"Cake", 89.0);
						pq.add(product3);
				
				
				
				System.out.println("Students served in their priority order");
				
				while (!pq.isEmpty()) {
				System.out.println(pq.poll().getproductPrice());
		}
	}
}

class ProductComparator implements Comparator<Product>{
					
			public int compare(Product p1, Product p2) {
				if (p1.productPrice < p2.productPrice)
					return 1;
				else if (p1.productPrice > p2.productPrice)
					return -1;
								return 0;
				}
		}

class Product {
	public int productId;
	public String productName;
	public double productPrice;
		
	
	public Product(int productId,String productName, double productPrice) {
	    this.productId=productId;
		this.productName = productName;
		this.productPrice = productPrice;
		
	}
	
	public double getproductPrice() {
		return  productPrice;
	}
}
