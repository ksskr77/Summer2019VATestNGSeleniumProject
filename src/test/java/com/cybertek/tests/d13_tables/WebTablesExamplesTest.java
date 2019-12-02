package com.cybertek.tests.d13_tables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExamplesTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void printTable(){
        WebElement table1 = driver.findElement(By.id("table1"));
        System.out.println(table1.getText());

        Assert.assertTrue(table1.getText().contains("jsmith@gmail.com"));
    }

    @Test
    public void getAllHeaders(){
        // get all column names individually
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("header.size()= "+headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

        // get all column anmes in a single webelement
        WebElement headers2 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(headers2.getText()+" ");

    }
    @Test
    public void printTableSize(){
        // number of columns
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of columns = "+headers.size());

        // number of Rows with headers
        List<WebElement> allRowsIncludingHeaders = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("number of rows = "+allRowsIncludingHeaders.size());

        // Number of rows without headers
        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows excluding headers = " + allRowsExcludingHeaders.size());
    }
    @Test
    public void getRow(){
        // get any from the table using index. we will ignore the headers. 1st row is the 1st row in the body
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]"));
        System.out.println(row.getText());

        List<WebElement> allRowsExcludingHeaders = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("number of rows excluding headers = " + allRowsExcludingHeaders.size());

        for (int i = 1; i <=allRowsExcludingHeaders.size(); i++) {
            String xpath = "//table[@id='table1']/tbody/tr["+i+"]";
            System.out.println(xpath);
            WebElement singleRow = driver.findElement(By.xpath(xpath));
            System.out.println(singleRow.getText());
        }
    }

    @Test
    public void getCellsInRow(){
        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
        for (WebElement cell : row) {
            System.out.println(cell.getText());
        }
        System.out.println("Number of cells in this row: "+row.size());
    }
    @Test
    public void getSingleCellByIndex(){
        WebElement SingleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println(SingleCell.getText());
    }
    @Test
    public void getCellByDynamicIndex(){
        // get number of rows
        int rowNumber = getNumberOfRows();
        // get number of columns
        int columnNumber = getNumberOfColumns();

        // iterates each row in the table
        for (int i=1; i<= rowNumber; i++){
            // iterates each column in the row
            for (int j = 1; j <= columnNumber; j++) {
                // i = index of tr (row)
                // j = index of td (cell)
                String xpath = "//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
                WebElement cell = driver.findElement(By.xpath(xpath));
                System.out.println(cell.getText());
            }
        }
    }

    private int getNumberOfColumns() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    private int getNumberOfRows(){
        // returns number of rows and the body of tables. skips the table header
        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
        return row.size();
    }

    @Test
    public void getSpecificCellByIndex(){
        // get cell by given indexes
        int r = 2;   // row number
        int c = 4;   // column number

        String xpath = "//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]";
        WebElement cell = driver.findElement(By.xpath(xpath));
        System.out.println(cell.getText());

    }
    @Test
    public void getCellInRelationToAnotherCellInSameRow(){
        // get email of "Jason"
        // email is in 3rd column
        String name = "Jason";
        String xpath = "//table[@id='table1']//td[.='"+name+"']/../td[3]";
        System.out.println(driver.findElement(By.xpath(xpath)).getText());

    }

}
