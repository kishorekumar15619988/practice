package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void browerlaunch(String browser) {
	try {	
		switch (browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			System.out.println("This browser not listed"); 
			break;
		}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public static void launchUrl(String url) {
		try {
			driver.get(url);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
	
	public static void screenmaximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void screenminimize() {
		try {
			driver.manage().window().minimize();;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static boolean elementIsDisplayed(WebElement element, long seconds) {
		boolean isDisplayed=false;
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			isDisplayed= element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isDisplayed;
	}
	
	public static void sendData(WebElement element, String data, long seconds){
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(data);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	public static void clickonElement(WebElement element, long seconds) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	public static WebElement findElementById(String id) {
		WebElement element=null;
		try {
			element=driver.findElement(By.id(id));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	
	public static WebElement findElementByXpath(String xpath) {
		WebElement element=null;
		try {
			element=driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}
	
	
	
	public static WebElement findElementByLinktext(String text) {
		WebElement element=null;
		try {
			element=driver.findElement(By.linkText(text));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return element;
	}

	public static void dropDownSelectbyValue(String value,WebElement element) {
		Select s = new Select(element);
		try {
			s.selectByValue(value);	
		} catch (Exception e) {
			e.getMessage();
		}
		
		
	}
	public static void dropDownSelectbyindex(int id,WebElement element) {
		Select s = new Select(element);
		try {
			s.selectByIndex(id);	
		} catch (Exception e) {
			e.getMessage();
		}
	}
		public static void dropDownSelectbyvisibletext(String name,WebElement element) {
			Select s = new Select(element);
			try {
				s.selectByVisibleText(name);	
			} catch (Exception e) {
				e.getMessage();
			}
		
		
	}
		
		public static String excelFormat(int rowData, int cellData) {
			String value = null;
			
			try {
				File f = new File("C:\\Users\\shoby\\eclipse-workspace2\\AdactinHotel\\src\\test\\resources\\excel\\myexcel2.xlsx");
				FileInputStream fis = new FileInputStream(f);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				Sheet sheet = wb.getSheet("Sheet1");
				Row row = sheet.getRow(rowData);
				Cell cell = row.getCell(cellData);
				CellType cellType = cell.getCellType();
				/*if(cellType.equals(1)) {
					value = cell.getStringCellValue();
				}else if (cellType.equals(0)) {
					if(DateUtil.isCellInternalDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
						value = s.format(dateCellValue);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long a = (long)numericCellValue;
						value = String.valueOf(a);
						System.out.println(value);
					}
				}*/
				
				DataFormatter dft =new DataFormatter();
				value = dft.formatCellValue(cell);
							
				wb.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return value;
			
		}
		
		public static void screenShot() {

			try {
				TakesScreenshot tk = (TakesScreenshot)driver;
				File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
				File f = new File("C:\\Users\\shoby\\eclipse-workspace2\\AdactinHotel\\src\\test\\resources\\Screenshot\\sample.png");
				FileHandler.copy(screenshotAs, f);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}
