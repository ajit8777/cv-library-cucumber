package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distance;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearch;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement tempPerm;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement cookies;


    public void acceptCookies(){
        clickOnElement(cookies);
    }

    public void enterJobTitle(String job){
        sendTextToElement(jobTitle, job);
    }

    public void enterLocation(String area){
        sendTextToElement(location, area);
    }

    public void selectDistanceFromDropdown(String text){
        selectByVisibleTextFromDropDown(distance, text);
    }


    public void clickOnMoreSearchLink(){
        try{
            mouseHoverToElementAndClick(moreSearch);
        }catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("argument[0].scrollIntoView(true);", moreSearch);
            moreSearch.click();
        }
    }

    public void enterMinimumSalary(String minSalary){
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaximumSalary(String maxSalary){
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryFromDropdown(String salary){
        selectByVisibleTextFromDropDown(salaryType, salary);
    }

    public void selectJobTypeFromDropdown(String jobType){
        selectByVisibleTextFromDropDown(tempPerm, jobType);
    }

    public void clickOnFindJobsButton(){
        clickOnElement(findButton);
    }
}
