package com.training.domains;

public class Application {

	public static void main(String[] args) {

		
		Catalog catalog = new Catalog();
		
		catalog.addProduct(new Product(100L,"TV","Sony",45000));
		catalog.addProduct(new Product(300L,"TV","LG",145000));
		catalog.addProduct(new Product(120L,"TV","Samsung",95000));
		catalog.addProduct(new Product(209L,"TV","Onida",15000));
		catalog.addProduct(new Product(110L,"TV","TCL",25000));
		catalog.addProduct(new Product(202L,"TV","MI",35000));
		catalog.addProduct(new Product(2002L,"AC","LG",35000));
		catalog.addProduct(new Product(2003L,"AC","Voltas",85000));
		catalog.addProduct(new Product(2004L,"AC","Daikin",66000));
		
		
		System.out.println("Highly Priced TV's");
		
		  catalog.highlyPriced().forEach(System.out::println);
		  
		  
		  System.out.println("Least Priced TV's");
		   
		   catalog.leastPriced().forEach(System.out::println);
		   
		   System.out.println("Highly Price AC :="+ catalog.highlyPriced("AC"));
		   
		   System.out.println("Least Priced AC:="+catalog.lowlyPriced("AC"));
		   
		   System.out.println("Total Number of AC :="+catalog.countProduct("AC"));
		   System.out.println("Total Number of TV :="+catalog.countProduct("TV"));
		   
		   
		   System.out.println("LG Total Price"+ catalog.findTotal());
	}

}
