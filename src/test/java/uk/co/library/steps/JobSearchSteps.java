package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        //new HomePage().acceptCookies();
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I  select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistanceFromDropdown(distance);
    }

    @Then("I click on moreSearchOptions Link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String minSalary) {
        new HomePage().enterMinimumSalary(minSalary);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String maxSalary) {
        new HomePage().enterMaximumSalary(maxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryFromDropdown(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobTypeFromDropdown(jobType);
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().getResultOfJobSearch(),result,"Result not matching");
    }

    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }
}
