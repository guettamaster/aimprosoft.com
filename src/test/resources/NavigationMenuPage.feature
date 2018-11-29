Feature: testing navigation menu

  Scenario: 2.001 Check that subcategories is displayed after clicking on the "Key Technologies" title
    Given open home page
    Then home page is opened
    When click on the "Key Technologies" title
    Then "Liferay Development" subcategory is displayed
    Then "Alfresco Development" subcategory is displayed
    Then "Hybris Development" subcategory is displayed
    When click on the "Liferay Development" subcategory title
    Then current url equals to "https://www.aimprosoft.com/liferay-development/"
    Then "Liferay Development" title is displayed
    Then "Liferay Development" breadcrumb is displayed
    When click on the "Alfresco Development" subcategory title
    Then current url equals to "https://www.aimprosoft.com/alfresco-development/"
    Then "Alfresco Development" title is displayed
    Then "Alfresco Development" breadcrumb is displayed
    When click on the "Hybris Development" subcategory title
    Then current url equals to "https://www.aimprosoft.com/hybris-development/"
    Then "Hybris Development" title is displayed
    Then "Hybris Development" breadcrumb is displayed

  Scenario: 2.002 Check that subcategories is displayed after clicking on the "Services" title
    Given open home page
    Then home page is opened
    When click on the "Services" title
    Then "Engineering" subcategory is displayed
    Then "Mobile" subcategory is displayed
    Then "Frontend" subcategory is displayed
    Then "Quality Assurance" subcategory is displayed
    When click on the "Engineering" subcategory title
    Then current url equals to "https://www.aimprosoft.com/engineering-services/"
    Then "Engineering" title is displayed
    Then "Engineering" breadcrumb is displayed
    Then "Software Product Dev." subcategory is displayed
    Then "Dedicated Team" subcategory is displayed
    When click on the "Software Product Dev." subcategory title
    Then current url equals to "https://www.aimprosoft.com/software-development/"
    Then "Software" title is displayed on the background image
    Then "Software Product Dev." breadcrumb is displayed
    When click on the "Dedicated Team" subcategory title
    Then current url equals to "https://www.aimprosoft.com/dedicated-team/"
    Then "Dedicated Team" title is displayed
    Then "Dedicated Team" breadcrumb is displayed
    When click on the "Mobile" subcategory title
    Then "Mobile" subcategory is displayed
    Then current url equals to "https://www.aimprosoft.com/mobile-development/"
    Then "Mobile Development" title is displayed
    Then "Mobile Development" breadcrumb is displayed
    When click on the "Frontend" subcategory title
    Then "Frontend" subcategory is displayed
    Then current url equals to "https://www.aimprosoft.com/frontend-development/"
    Then "Frontend Development" title is displayed
    Then "Frontend Development" breadcrumb is displayed
    When click on the "Quality Assurance" subcategory title
    Then "Quality Assurance" subcategory is displayed
    Then current url equals to "https://www.aimprosoft.com/quality-assurance/"
    Then "Quality Assurance" title is displayed
    Then "Quality Assurance" breadcrumb is displayed

  Scenario: 2.003 Check that "Portfolio" section title on the background image is displayed after clicking on the "Portfolio" title
    Given open home page
    Then home page is opened
    When click on the "Portfolio" title
    Then current url equals to "https://www.aimprosoft.com/portfolio/"
    Then "Portfolio" title is displayed
    Then "Portfolio" breadcrumb is displayed
    Then "All projects" tab is displayed

    When click on the "Liferay" tab
    Then breadcrumb "1" breadcrumb "2" displayed
    Then "Liferay" breadcrumb is displayed
    Then current url equals to "https://www.aimprosoft.com/liferay-development-portfolio/"
    Then "Liferay" tab is displayed

    When click on the "Alfresco" tab
    Then current url equals to "https://www.aimprosoft.com/alfresco-development-portfolio/"
    Then "Alfresco" tab is displayed

    When click on the "Hybris" tab
    Then current url equals to "https://www.aimprosoft.com/hybris-development-portfolio/"
    Then "Hybris" tab is displayed

    When click on the "Web Apps" tab
    Then current url equals to "https://www.aimprosoft.com/web-apps-development-portfolio/"
    Then "Web Apps" tab is displayed

    When click on the "Mobile Apps" tab
    Then current url equals to "https://www.aimprosoft.com/mobile-apps-development-portfolio/"
    Then "Mobile Apps" tab is displayed

    When click on the "Engineering" tab
    Then current url equals to "https://www.aimprosoft.com/engineering-development-portfolio/"
    Then "Engineering" tab is displayed

#  Scenario: 2.004 Check that "Blog" section title on the background image is displayed after clicking on the "Blog" title
#    Given open home page
#    Then home page is opened
#    When click on the "Blog" title
#    url
#    Then "Blog" title is displayed
#    Then "Blog" breadcrumb is displayed
#
#  Scenario: 2.005 Check that "Company" section title on the background image is displayed after clicking on the "Company" title
#    Given open home page
#    Then home page is opened
#    When click on the "Company" title
#    url
#    Then "Company" title is displayed
#    Then "Company" breadcrumb is displayed
#    Then "About Us" subcategory is displayed
#    When click on the "About Us" title subcat
#    url
#    Then "" title is displayed
#    Then "" breadcrumb is displayed
#    Then "Customers" subcategory is displayed
#    When click on the "Customers" title subcat
#    url
#    Then "" title is displayed
#    Then "" breadcrumb is displayed
#    Then "Testimonials" subcategory is displayed
#    When click on the "Testimonials" title subcat
#    url
#    Then "" title is displayed
#    Then "" breadcrumb is displayed
#    Then "Careers" subcategory is displayed
#    When click on the "Careers" title subcat
#    url
#    Then "" title is displayed
#    Then "" breadcrumb is displayed
#
#  Scenario: 2.006 Check that "Contacts" section title on the background image is displayed after clicking on the "Contacts" title
#    Given open home page
#    Then home page is opened
#    When click on the "Contacts" title
#    url
#    Then "Contacts" title is displayed
#    Then "Contacts" breadcrumb is displayed
