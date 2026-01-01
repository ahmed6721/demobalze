package com.demoblaze;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoBlaze {
	
	public void find_all_the_product_element()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.demoblaze.com/");
		  List<WebElement> productValue = driver.findElements(By.xpath("//*[@class='col-lg-9']//h4"));
		  System.out.println(productValue.size());
		  
		  for(int i = 0; i <productValue.size();i++) 
		  
		  {
			  System.out.println("Prodeuct value : "+productValue.get(i).getText());
			  
		  }
		  
		  List<WebElement> productPrice = driver.findElements(By.xpath("//*[@class='col-lg-9']//h5"));
		 
		  System.out.println(productPrice.size());
		  
		  List<Integer> allprice = new ArrayList<>(); // 1st step converting to java for min & max
		  for(int i = 0; i <productPrice.size();i++) 
			  
		  {
			  System.out.println("Prodeuct price : "+productPrice.get(i).getText());// print produce price with getText()
			  allprice.add(Integer.parseInt(productPrice.get(i).getText().replace("$", "")));
			  //2nd step add() with Integer.parseInt() to covert string to integer 
			  // remove doller sign with replace("$", "") 
			  
		  }
		  
		  
		  
		  Collections.sort(allprice);//Asecending order
		  int max = allprice.get(0);
		  int Secondmax = allprice.get(0);
		  int thirdmax = allprice.get(0);
		  
		  int fourthmax =allprice.get(0);
		  
for(int i = 0; i <allprice.size();i++) // 3rd step this for loop is for to print multiple min & max
			  
		  {
			  //System.out.println("Prodeuct price : "+allprice.get(i));
			  
			  if(allprice.get(i)>max)
			  {
				  fourthmax = thirdmax; 
				  thirdmax = Secondmax;
				  Secondmax = max;
				  max =allprice.get(i);
			  }
			 
			  
		  }//end
    System.out.println("All Price Asecending Order : "+allprice);//print all element

			System.out.println("1st Max price : $"+max );
			System.out.println("2nd Max price : $"+Secondmax );
			System.out.println("3rd Max price : $"+thirdmax );
			System.out.println("4th Max price : $"+fourthmax );
		  
		  
			Collections.reverse(allprice); //Desecnding order
			  int min = allprice.get(0);
			  int Secondmin = allprice.get(0);
			  int thirdmin = allprice.get(0);
			  
			  int fourthmin =allprice.get(0);
			  
	for(int i = 0; i <allprice.size();i++) 
				  
			  {
				  //System.out.println("Prodeuct price : "+allprice.get(i));
				  
				  if(allprice.get(i)<min)
				  {
					  fourthmin = thirdmin; 
					  thirdmin = Secondmin;
					  Secondmin = min;
					  min =allprice.get(i);
				  }
				 
				  
			  }//end
	    System.out.println("All Price Desecending Order : "+allprice);

				System.out.println("1st Min price : $"+min );
				System.out.println("2nd Min price : $"+Secondmin );
				System.out.println("3rd Min price : $"+thirdmin );
				System.out.println("4th Min price : $"+fourthmin );
			  
/*	int max = Collections.max(allprice);	  
	int min = Collections.min(allprice);
	System.out.println("Min price :" +min);
	System.out.println("Max price :" +max);
*/
		  
		 
		  
		  
		  
		  driver.quit();
		
		
	}
	
	

	public static void main(String[] args) 
	{
		 new DemoBlaze().find_all_the_product_element();

	}

}
