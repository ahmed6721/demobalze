//package com.ecommerce.playground.lambdatest;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Ecommerce_playground_lambdatest {
//
//public void getproduct() 
//{
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	driver.get("https://ecommerce-playground.lambdatest.io/");
//	List <WebElement> productName=driver.findElements(By.xpath("(//*[@class=\"tab-content\"])[1]//h4"));
//	List <WebElement> productPrice=driver.findElements(By.xpath("//*[@class='price-new']"));
//	
//
////To All print need for loop
//	System.out.println(productName.size());//print total size product name 
//	for(int i=0;i<productName.size();i++)
//	{
//		System.out.println(productName.get(i).getText());
//	}
//	System.out.println(productPrice.size());//print total size product price
//	List<Double> allPrice = new ArrayList<>();
//	for(int i=0;i<productPrice.size();i++)
//	{
//		System.out.println(productPrice.get(i).getText());
//		allPrice.add(Double.parseDouble(productPrice.get(i).getText().replace("$", "")));
//		//allPrice.add(Integer.parseInt(productPrice.get(i).getText()));		
//	}
//	Collections.sort(allPrice);
//	System.out.println("All price:"+allPrice);
//	double max = allPrice.get(0);
//	double Secondmax = allPrice.get(0);
//	double thirddmax = allPrice.get(0);
//	for (int i =0; i<allPrice.size();i++)
//	{
//		System.out.println("Allprice :"+allPrice.get(i));
//		if(allPrice.get(i)>max)
//		{
//			thirddmax=Secondmax;
//			Secondmax = max;
//			max = allPrice.get(i);
//		}
//	}
//	System.out.println("Product 1st max : "+max);
//	System.out.println("Product 2nd max : "+Secondmax);
//	System.out.println("Product 3rd max : "+thirddmax);
//
//
//	
//	driver.quit();
//}
//	public static void main(String[] args) {
//		
//new Ecommerce_playground_lambdatest().getproduct();
//	}
//
//}
