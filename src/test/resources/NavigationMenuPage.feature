Feature: testing navigation menu

  Scenario: 2.001 Check that subcategories is displayed after clicking on the "Key Technologies" title
    Given open home page
    Then home page is opened
    When click on the "Key Technologies" title
    Then "Liferay Development" subcategory is displayed
    When click on the "Liferay Development" subcategory title
    url
    Then "Liferay Development" title is displayed
    Then "Liferay development" breadcrumb is displayed
    Then "Alfresco Development" subcategory is displayed
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    Then "Hybris Development" subcategory is displayed
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed

  Scenario: 2.002 Check that subcategories is displayed after clicking on the "Services" title
    Given open home page
    Then home page is opened
    When click on the "Services" title
    Then "Engineering" subcategory is displayed
    When click on the "Engineering" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    When click on the "Software Product Dev." title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    When click on the "Dedicated Team" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    When click on the "Mobile" title subcat
    Then "Mobile" subcategory is displayed
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    When click on the "Mobile" title subcat
    Then "Frontend" subcategory is displayed
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    When click on the "Mobile" title subcat
    Then "Quality Assurance" subcategory is displayed
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed

  Scenario: 2.003 Check that "Portfolio" section title on the background image is displayed after clicking on the "Portfolio" title
    Given open home page
    Then home page is opened
    When click on the "Portfolio" title
    url
    Then "Portfolio" title is displayed
    Then "Portfolio" breadcrumb is displayed
    Then "All projects" tab is displayed
    Then "Liferay" tab is displayed
    Then "Alfresco" tab is displayed
    Then "Hybris" tab is displayed
    Then "Web Apps" tab is displayed
    Then "Mobile Apps" tab is displayed
    Then "Engineering" tab is displayed

  Scenario: 2.004 Check that "Blog" section title on the background image is displayed after clicking on the "Blog" title
    Given open home page
    Then home page is opened
    When click on the "Blog" title
    url
    Then "Blog" title is displayed
    Then "Blog" breadcrumb is displayed

  Scenario: 2.005 Check that "Company" section title on the background image is displayed after clicking on the "Company" title
    Given open home page
    Then home page is opened
    When click on the "Company" title
    url
    Then "Company" title is displayed
    Then "Company" breadcrumb is displayed
    Then "About Us" subcategory is displayed
    When click on the "About Us" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    Then "Customers" subcategory is displayed
    When click on the "Customers" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    Then "Testimonials" subcategory is displayed
    When click on the "Testimonials" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed
    Then "Careers" subcategory is displayed
    When click on the "Careers" title subcat
    url
    Then "" title is displayed
    Then "" breadcrumb is displayed

  Scenario: 2.006 Check that "Contacts" section title on the background image is displayed after clicking on the "Contacts" title
    Given open home page
    Then home page is opened
    When click on the "Contacts" title
    url
    Then "Contacts" title is displayed
    Then "Contacts" breadcrumb is displayed

    gdfgdfg