Feature: testing home page

  Scenario: 1.001 Check that "Home" page is opened
    Given open home page
    Then home page is opened

  Scenario: 1.002 Check that full size site mode is displayed after clicking on the left button
    Given open home page
    Then home page is opened
    When click on left button
    Then full size site mode is displayed

  Scenario: 1.003 Check that "We are really good at" block is displayed after clicking on the down button
    Given open home page
    Then home page is opened
    When click on down button
    Then We are really good at block is has coordinates "155"

  Scenario: 1.004 Check that "Contacts" page is opened after clicking on the "Request a free quote" link
    Given open home page
    Then home page is opened
    When click on the Request a free quote link
    Then current url equals to "https://www.aimprosoft.com/contact-us/"
    Then "Contacts" title is displayed
    Then "Contacts" breadcrumb is displayed