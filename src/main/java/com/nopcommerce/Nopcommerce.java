package com.nopcommerce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nopcommerce {
	
	
	public void get_nopcommerce_Locators()
	{
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		
		List<WebElement> product_Price = driver.findElements(By.xpath("(//*[@class=\"item-grid\"])[2]//span"));
		
		List<WebElement> product_name = driver.findElements(By.xpath("(//*[@class=\"item-grid\"])[2]//h2"));
		System.out.println(product_name.size());
		
		for(int i=0;i<product_name.size();i++)
		{
			System.out.println(product_name.get(i).getText());
			
		}
		
		System.out.println(product_Price.size());
		
		List<Integer> allprice = new ArrayList<>();
		for(int i=0;i<product_Price.size();i++)
		{
			System.out.println(product_Price.get(i).getText());
			allprice.add(Integer.parseInt(product_Price.get(i).getText().replace("$", "").replace(",", "").replace(".", "")));
			
		}
		Collections.sort(allprice);
		System.out.println(allprice);
		int max = allprice.get(0);
		int Secondmax = allprice.get(0);
		int Thirddmax = allprice.get(0);
		for(int i= 0;i<product_Price.size();i++)
		{
			if(allprice.get(i)>max)
			{
				Thirddmax = Secondmax;
				Secondmax= max;
				max =allprice.get(i);
			}
				
			
		}
		
		
		System.out.println("Product 1st max : "+max);
		System.out.println("Product 2nd max : "+Secondmax);
		System.out.println("Product 3rd max : "+Thirddmax);
		
		Collections.reverse(allprice);
		System.out.println(allprice);
		int min = allprice.get(0);
		int Secondmin = allprice.get(0);
		int Thirddmin = allprice.get(0);
		for(int i= 0;i<product_Price.size();i++)
		{
			if(allprice.get(i)<min)
			{
				Thirddmin = Secondmin;
				Secondmin= min;
				min =allprice.get(i);
			}
				
			
		}
		
		
		
		
		System.out.println("Product 1st min : "+min);
		System.out.println("Product 2nd min : "+Secondmin);
		System.out.println("Product 3rd min : "+Thirddmin);
		
		
		driver.quit();
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Nopcommerce().get_nopcommerce_Locators();
	}

}
