Feature: Job Search Test


  Scenario Outline: verifyJobSearchResultUsingDifferentDataSet
    Given I am on Home page
    When I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I  select distance "<distance>"
    Then I click on moreSearchOptions Link
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And  I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"

    Examples:
      | jobTitle           | location  | distance | salaryMin | salaryMax | salaryType | jobType        | result                                          |
      | Tester             | Harrow    | 5 miles  | 30000     | 50000     | Per annum  | Permanent      | Permanent Tester jobs in Harrow                 |
      | Software Engineers | Wembley   | 10 miles | 4000      | 4800      | Per month  | Contract       | Contract Software Engineers jobs in Wembley     |
      | Senior Tester      | Aberdeen  | 15 miles | 800       | 900       | Per week   | Part Time      | Part Time Senior Tester jobs in Aberdeen        |
      | Experience Tester  | Kingsbury | 50 miles | 300       | 500       | Per day    | Contract       | Contract Experience Tester jobs in Kingsbury    |
      | Software Tester    | Stanmore  | 35 miles | 25        | 28        | Per hour   | Apprenticeship | Apprenticeship Software Tester jobs in Stanmore |
      | QA Tester          | London    | 25 miles | 35000     | 55000     | Per annum  | Temporary      | Temporary Qa Tester jobs in London              |