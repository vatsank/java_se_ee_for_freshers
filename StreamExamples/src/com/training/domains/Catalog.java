package com.training.domains;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
public class Catalog {

	
	private List<Product> productList;
	
	
	
	public Catalog() {
		super();
	  this.productList = new ArrayList<>();
	}

	public List<Product> getAllProducts(){
		
		return this.productList;
	}
	
	public boolean addProduct(Product product)	{	
		return this.productList.add(product);
	}
	
	public List<Product> highlyPriced(){
		
		List<Product> mahenga=  getAllProducts().stream().filter((obj)->obj.getRatePerUnit()>90000).collect(toList());
	
		 return  mahenga;
	}
	
	private Comparator<Product> getRPUComparator(){
		
		Comparator<Product> rateComparator = 
			      Comparator.comparing(Product::getRatePerUnit);
	
		return rateComparator;
	}
	private Stream<Product> filterByProduct(String productName){
		
		return getAllProducts().stream()
        .filter((obj)->obj.getProductName().equalsIgnoreCase(productName));

	}
	public Product highlyPriced(String productName) {
		
		Product foundProduct = null;

		
		Optional<Product> maxPriced = filterByProduct(productName).max(getRPUComparator());
		
		if(maxPriced.isPresent()) {
			 foundProduct= maxPriced.get();
		}
	
		return foundProduct;
	
	}
	
	public Product lowlyPriced(String productName) {
		
		Product foundProduct = null;
		
		Optional<Product> minPriced = filterByProduct(productName).min(getRPUComparator());
		
		if(minPriced.isPresent()) {
		        foundProduct = minPriced.get();	
		}
	             return foundProduct;
	}
	
	public long countProduct(String productName) {

		   return getAllProducts().stream().filter(obj -> obj.getProductName().equalsIgnoreCase(productName)).count();
	}
	
	
   public List<Product> leastPriced(){
		
		List<Product> sastha=  getAllProducts().stream().filter((obj)->obj.getRatePerUnit()<90000).collect(toList());
	
		 return  sastha;
	}
   
   // List the Brands which has AC less than 50000
   
   public List<String> acLessThanFiftyk(){
	   
	   return null;
	   
   }
	
   public double  findTotal() {
	   
	   List<Long> prices = Arrays.asList(145000L,35000L);
	   
	    long identity = 0L;
	    long sum =0L;
	    long result2 = 0L;
	    for(Long eachNumber : prices){                 
	    	sum =sum +eachNumber ;   
	    	System.out.println(sum);
	    	result2 = sum+= identity;
	    	System.out.println(result2);
	    }
	    System.out.println("Final"+result2);             



	Long total =   prices.parallelStream().reduce(0L,Long::sum);
	
	   
    return total;
   }
   
   
}
