package pompac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepac.Amazonbase;

public class AmazonPom extends Amazonbase{

	@FindBy(css="#ap_email") WebElement Semail;      //Sign in
	@FindBy(id="continue") WebElement Scontinue;
	@FindBy(id="ap_password") WebElement Spassword;
	@FindBy(name="rememberMe") WebElement Sremember;
	@FindBy(id="signInSubmit") WebElement Signin;
	@FindBy(css="#nav-flyout-ya-signin > a > span") WebElement Option;
	
	public AmazonPom() {
		PageFactory.initElements(driver, this);
	}
	public void initial() {     //signin
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		Option.click();
	}
	public void typesemail(String semail) {  //sign in
		Semail.sendKeys(semail);
	}
	public void clickcontinue() {
		Scontinue.click();
	}
	public void typepassword(String spassword) {
		Spassword.sendKeys(spassword);
	}
	public void typeSremember() {
		Sremember.click();
	}
	public void signbtn() {     //signin
		Signin.click();
}
	
	@FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement Addressoption; //Address module
	@FindBy(xpath="//h2[contains(text(),'Your Addresses')]") WebElement YourAddress;
	@FindBy(css="#ya-myab-plus-address-icon") WebElement Addaddress;
	@FindBy(css="#address-ui-widgets-countryCode > span > span") WebElement Country;//
	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId_39") WebElement Canada;
	@FindBy(css="#address-ui-widgets-enterAddressFullName") WebElement Aname;      
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber") WebElement Aphone;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement Address;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement City;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span") WebElement Province;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8") WebElement Ontario;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement Postal;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement Default; 
	@FindBy(id="address-ui-widgets-addr-details-gate-code") WebElement Delivery; 
	@FindBy(css="#address-ui-widgets-addr-details-business-hours > span > span") WebElement Weekend; 
	@FindBy(id="dropdown1_1") WebElement Option1; 
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input") WebElement Add;   
	@FindBy(id="nav-logo-sprites") WebElement Amazon;
	public void addressopen() {
    	  Actions a1=new Actions(driver);
 		  a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
 		  Addressoption.click();
 		  YourAddress.click();
 		  Addaddress.click();
       }
public void country() {
	Country.click();	
	}
public void canada() throws InterruptedException {
	Canada.click();
	Thread.sleep(3000);
	}
public void addname(String aname) {
	Aname.sendKeys(aname);
}
public void addphone(String aphone) {
	Aphone.sendKeys(aphone);
}
public void address(String address) {
	Address.sendKeys(address);
}
public void city(String city) {
	City.sendKeys(city);
}
public void province() {
	Province.click();
}
public void ontario() {
	Ontario.click();
}
public void postal(String postal) {
	Postal.sendKeys(postal);
}
public void adddefault() {
	Default.click();
}
public void delivery(String delivery) throws InterruptedException {
	Delivery.sendKeys(delivery);
	Thread.sleep(3000);
}
public void weekend() {
	Weekend.click();
}
public void option1() {
	Option1.click();
}
public void add() throws InterruptedException {
	Add.click();
	Thread.sleep(5000);
	Amazon.click(); 
	Thread.sleep(3000);
	                                                                                               //Address module end
}
   
   @FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement Aaccount; //login and security
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement Login;
	@FindBy(css="#NAME_BUTTON > span > a") WebElement Nameb;
	@FindBy(id="ap_customer_name") WebElement Cnamen;//clear then send      
	@FindBy(id="cnep_1C_submit_button") WebElement Submit;
	@FindBy(css="#MOBILE_NUMBER_BUTTON > span > a") WebElement Mobilebtn;
	@FindBy(css="#a-autoid-0-announce > span") WebElement Countrybtn;
	@FindBy(css="#auth-country-picker_34") WebElement Canadabtn;
	@FindBy(id="ap_phone_number") WebElement Phoneno; //clear then send
	@FindBy(id="auth-continue") WebElement Continuebtn;
	@FindBy(id="auth-verification-ok-announce") WebElement Verifybtn;    
	
	public void security() {                            //Login and security module
		   Actions a1=new Actions(driver);
		   a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	       Aaccount.click();
	       Login.click();
	   }   
	public void logname() {
		Nameb.click();;
	}
	public void cname(String cnamen) {
		Cnamen.clear();
		Cnamen.sendKeys(cnamen);
	}
	public void submit() throws InterruptedException {
		Submit.click();
		Thread.sleep(2000);
	}
	public void mobile() {
		Mobilebtn.click();
	}
	public void countrybtn() {
		Countrybtn.click();
	}
	public void canadabtn() {
		Canadabtn.click();
	}
	public void phoneno(String phoneno) throws InterruptedException {
		Phoneno.clear();
		Thread.sleep(2000);
		Phoneno.sendKeys(phoneno);
	}
	public void countinuebtn() throws InterruptedException {
		Continuebtn.click();
		Thread.sleep(1000);
	}
	public void verify() throws InterruptedException {
		Verifybtn.click();
		Thread.sleep(2000);
		Amazon.click();                                             //Login and security module end                                       
	}
	
	@FindBy(id="twotabsearchtextbox") WebElement Search;      //search module
	@FindBy(id="nav-search-submit-button") WebElement Searchbtn;
	@FindBy(css="#a-autoid-0-announce > span.a-dropdown-prompt") WebElement Sorting; //sort by newest arrival
	@FindBy(id="s-result-sort-select_4") WebElement Sortoption;
	@FindBy(css="#p_36\\/2661613011 > span > a > span") WebElement Filterprice; //filter by price
	@FindBy(css="#p_n_date_first_available_absolute\\/15196852011 > span > a > span") WebElement Filterdays;//filter by last 30 days
	
	
	public void search(String search) {
		Search.sendKeys(search);
	}
	public void searchbtn() throws InterruptedException {
		Searchbtn.click();
		Thread.sleep(3000);
	}
	public void sorting() {
		Sorting.click();
		}
	public void sortoption() throws InterruptedException {
		Sortoption.click();
		Thread.sleep(2000);
		}
	public void filterprice() throws InterruptedException {
		Filterprice.click();
		Thread.sleep(2000);
}
	public void filterdays() throws InterruptedException {
		Filterdays.click();
		Thread.sleep(3000);
		Amazon.click();                                            //Search Module ends
}
	
	@FindBy(id="nav-cart-count") WebElement Item;                 //cart module
	@FindBy(name="submit.addToCart") WebElement Addcart;
	@FindBy(name="proceedToRetailCheckout") WebElement Checkout; 
	@FindBy(name="ppw-claimCode") WebElement Coupon;
	@FindBy(name="ppw-claimCodeApplyPressed") WebElement Press ; 
	@FindBy(css="#banner-image > span > span > i") WebElement Logo;
	@FindBy(id="a-autoid-1-announce") WebElement Returncart;
	@FindBy(name="submit.delete.1d3f10ab-aee9-4b5f-9c14-afc54ce74298") WebElement Delete;
	//@FindBy(name="submit.delete.2523f53c-2b42-45e0-abba-82e53bea442b") WebElement Delete2;
	@FindBy(id="nav-cart-count") WebElement Cart;	
	
	public void searchcart(String searchcart) {
		Search.sendKeys(searchcart);
	}
	public void item() {
		Item.click();
	}
	public void addcart() {
		Addcart.click();
		Addcart.click();
	}
	public void checkout() {
		Checkout.click();
	}
	public void coupon(String coupon) {
		Coupon.sendKeys(coupon);;
	}
	public void press() {
		Press.click();
	}
	public void logo() {
		Logo.click();
	}
	public void returncart() throws InterruptedException {
		Thread.sleep(2000);
		Returncart.click();
	}
	
	public void cart() throws InterruptedException {
		Thread.sleep(4000);
		Cart.click();
	}
	public void delete() throws InterruptedException {
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		Amazon.click();                                         //cart module end
	}                                                             
	
	
    @FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement Orderoption ;   //order module starts
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement YourOrder;
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > "
			+ "div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")WebElement Buyagain;
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a") WebElement Noship;
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(6) > a") WebElement Cancel;
	
	public void order() {                           
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		Orderoption.click();
		YourOrder.click();
		boolean b=Buyagain.isDisplayed();
		System.out.println("Buy Again option is displayed:  "+b);
		boolean n=Noship.isDisplayed();
		System.out.println("Not Yet Shipped option is displayed:  "+n);
		boolean c=Cancel.isDisplayed();
		System.out.println("Cancelled Orders option is displayed:  "+c);             //order module ends
	}
	
	@FindBy(id="ap_customer_name") WebElement Cusname;          //create account
	@FindBy(id="ap_email") WebElement Email;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="ap_password_check") WebElement Passcheck;
	@FindBy(id="continue") WebElement Continue;
	@FindBy(linkText="Start here.") WebElement Start;
	
	public void createaccount() throws InterruptedException {
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		Start.click();
		Thread.sleep(2000);
	}
	
	public void cusname(String cusname) {
		Cusname.sendKeys(cusname);
	}
	public void email(String email) {
		Email.sendKeys(email);
	}
	public void password(String password) {
		Password.sendKeys(password);
	}
	public void passcheck(String passcheck) {
		Passcheck.sendKeys(passcheck);
	}
	public void ok() {
		Continue.click();
	}
	
	
	
	
	
}
