OVERVIEW - Find the interest for current year
 
This project aims to automate the find interest amount of the current year.
It uses emicalculator.net, extracting calculation
 
 
LIBRARIES
 
Maven Repository: Maven 3.12.1 Apache POI: 5.2.5 TestNG: 7.9.0 Extent Report: 5.1.1 Selenium WebDriver: 4.17.0 Cucumber 7.16.0
 
 
DEPENDENCIES
org.seleniumhq.selenium selenium-java 4.19.1 org.apache.poi poi-ooxml 5.2.5 org.apache.logging.log4j log4j-core 3.0.0-beta2 org.apache.logging.log4j log4j-api 3.0.0-beta2	org.testng	testng	7.9.0	test com.aventstack extentreports 5.1.1 org.slf4j slf4j-api 2.1.0-alpha1 org.slf4j slf4j-simple 2.1.0-alpha1
 
AUTOMATION FLOW
1.Find the EMI for Car with price of 15 Lac, Interest rate of 9.5% & Tenure 1 year; Display the interest amount & principal amount for one month
2. From Menu, pick Home Loan EMI Calculator, fill relevant details & extract all the data from  year on year table & store in excel;
3. From Menu, pick Loan Calculator and under EMI calculator, do all UI check for text box & scales; change the Loan tenure for year & month,check the change in scale; Re-use the same validation for Loan Amount Calculator & Loan Tenure Calculator
(Suggested Site: emicalculator.net  however you are free to use any other legitimate site)
 
CHALLENGES
 
Overcame issues related to dynamic content and page structure. Implemented error handling mechanisms for robust automation.
 
 
BENEFITS
 
Increased efficiency through automation. Reduced manual effort and minimized the chance of human errors.
 
 