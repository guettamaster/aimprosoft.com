package aimprosoft.com;

public interface LOCATORS {

//TODO======================================================HomePage========================================================

String AIMPROSOFT_LOGO = "//div[@class='navbar-header']/a[@class='navbar-brand']";
String LEFT_BUTTON = "//div[@class='menu-icon']";
String AIMPROSOFT_LOGO_ON_THE_FULL_SIZE_SITE_MODE = "//div[@class='site-logo']/a[@class='navbar-brand']";
String CATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU = "//a[contains(text(),'$1')]";
String SUBCATEGORY_TITLE_NAME_ON_THE_NAVIGATION_MENU = "//a[contains(text(),'$1')]";
String SECTION_TITLE_ON_THE_BACKGROUND_IMAGE = "//h1[@class='light-font section-title'][contains(text(),'$1')]";
String CATEGORY_BREADCRUMB = "//span[@property='name'][contains(text(),'$1')]";
String TECHNOLOGIES_TAB = "//ul[@class='menu-portfolio-category-menu']//a[contains(@href,\"https://www.aimprosoft.com/\")][.='$1']";
String DOWN_BUTTON = "//i[@class='ti-angle-down']";
String WE_ARE_REALLY_GOOD_AT_TITLE = "//h1[@class='light-font section-title'][contains(text(),'We are really good at')]";
String REQUEST_A_FREE_QUOTE_LINK = "//div[@class='pull-right top-contact-links hidden-xs hidden-sm hidden-md']/a[@class='request-button'][contains(text(),'REQUEST A FREE QUOTE')]";
String SECTION_TITLE_NAME_ON_THE_BACKGROUND_IMAGE = "//h1[@class='light-font section-title'][contains(text(),'$1')]";

String CATEGORY_SUBCATEGORY_BREADCUMB = //div[@class='breadcrumbs']//span[contains(text(),'Aimprosoft')]//ancestor::div[@class='breadcrumbs']//span[contains(text(),'Portfolio')]//ancestor::div[@class='breadcrumbs']//span[contains(text(),'Liferay')]



}
