package com.example.methods;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.starts.Testsenerio;

public class SenerioMethods {
	static Logger logger = Logger.getLogger(com.example.starts.Testsenerio.class);
public static String LASTELEMENT;
static String ControlSituation ;


@Test
	public static  void divControls() {

		/*
		 * this method used for div control my test page has 4 div firstly
		 * controlled and counting one by one then sum and controls higher than
		 * 80 or not second control first letters i choose 'm' and 'z' , i did
		 * test with these letters in web page 'm' has 80 authors 'z'has 32
		 * authors
		 */
	
	try {
		Properties props = new Properties();
		 InputStream is = props.getClass().getClassLoader().getResourceAsStream("Test-n11/src/test/java/log4j.properties");
		 props.load(is);
		
		PropertyConfigurator.configure(props);

	}catch (Exception e) {
		 
		}
		
	
		logger.info("Authors page has 4 div[] now controlled one by one");

		List<WebElement> DIV1 = Testsenerio.driver.findElements(By
				.xpath("//*[@id='authorsList']/div[1]/ul/li"));
		// list selected xpath for div 1

		int countDIV1 = DIV1.size();
		// counted div2
		logger.info("DIV1 SİZE = " + countDIV1);
		 Assert.assertTrue(true);

		
		
		
		
		for (WebElement webElement : DIV1) {
			// lists for div1

			String Capitalletters = webElement.getText();
			// in here controls first letters
			if (Capitalletters.startsWith("M"))
			{ ControlSituation="M";
				logger.info("Starts with 'M' = True");
			} else {
				ControlSituation="Z";
				logger.error(("Starts with 'Z' = True"));

			}

		}

		// same controls div2,div3,div4
		List<WebElement> DIV2 = Testsenerio.driver.findElements(By
				.xpath("//*[@id='authorsList']/div[2]/ul/li"));

		int countDIV2 = DIV2.size();

		logger.info("DIV2 SIZE =" + countDIV2);

		for (WebElement webElement : DIV2) {
			String Capitalletters = webElement.getText();

			if (Capitalletters.startsWith("M"))
			{ ControlSituation="M";
				logger.info("Starts with 'M' = True");
			} else {
				ControlSituation="Z";
				logger.error(("Starts with 'Z' = True"));

			}

		}

		List<WebElement> DIV3 = Testsenerio.driver.findElements(By
				.xpath("//*[@id='authorsList']/div[3]/ul/li"));

		int countDIV3 = DIV3.size();

		logger.info("DIV3 SIZE =" + countDIV3);

		for (WebElement webElement : DIV3) {
			String Capitalletters = webElement.getText();

			if (Capitalletters.startsWith("M"))
			{ ControlSituation="M";
				logger.info("Starts with 'M' = True");
			} else {
				ControlSituation="Z";
				logger.error(("Starts with 'Z' = True"));

			}

		}

		List<WebElement> DIV4 = Testsenerio.driver.findElements(By
				.xpath("//*[@id='authorsList']/div[4]/ul/li"));

		int countDIV4 = DIV4.size();

		logger.info("DIV4 SIZE =" + countDIV4);

		for (WebElement webElement : DIV4) {
			String Capitalletters = webElement.getText();

			if (Capitalletters.startsWith("M"))
			{ ControlSituation="M";
				logger.info("Starts with 'M' = True");
			} else {
				ControlSituation="Z";
				logger.error(("Starts with 'Z' = True"));

			}

		}

		int TOTALDIV = countDIV2 + countDIV3 + countDIV4 + countDIV1;
		// sum divs counting authors names and then controlling
		if (TOTALDIV == 80) {
			logger.info("for"+" "+ControlSituation+" "+"have 80 authors");
		} else if (TOTALDIV <= 80) {
			logger.error(ControlSituation + TOTALDIV + " authors");
		} else if (TOTALDIV >= 80) {
			logger.error("for"+" "+ ControlSituation +" "+ "more for page this page have " + TOTALDIV
					+ " authors");
		}

		if (countDIV4 != 0) {
			// first page last element controls
			 LASTELEMENT = (DIV4.get(DIV4.size() - 1).getText());
			 Assert.assertTrue(true);

			 logger.info("first page last element Start with =" + LASTELEMENT);

		} else {
			// do nothing
			

		}

	}

}
