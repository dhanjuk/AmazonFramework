package testpac;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepac.Amazonbase;
import excelsheet.Excelsheet;
import pompac.AmazonPom;


public class AmazonTest extends Amazonbase{

	AmazonPom pom;
	public AmazonTest() {
		super();
	}
@BeforeMethod
    public void initialSetup() {
	start();
	pom=new AmazonPom();
}
@Test(priority=0)
public void Signin() throws InterruptedException {
	pom.initial();                                       //signin module
	pom.typesemail(pr.getProperty("semail"));
	pom.clickcontinue();
	pom.typepassword(pr.getProperty("spassword"));
	pom.typeSremember();
	pom.signbtn();
	pom.addressopen();                                  //address module
	pom.country();
	pom.canada();
	pom.addname(pr.getProperty("aname"));
	pom.addphone(pr.getProperty("aphone"));
	pom.address(pr.getProperty("address"));
	pom.city(pr.getProperty("city"));
	pom.province();
	pom.ontario();
	pom.postal(pr.getProperty("postal"));
	pom.adddefault();
	pom.delivery(pr.getProperty("delivery"));
	pom.weekend();
	pom.option1();
	pom.add();
	pom.security();                                    //login and security module
	pom.logname();
	pom.cname(pr.getProperty("cnamen"));
	pom.submit();
	pom.mobile();
	pom.countrybtn();
	pom.canadabtn();
	pom.phoneno(pr.getProperty("phoneno"));
	pom.countinuebtn();
	pom.verify();
}
 @Test(priority=1)
 public void search() throws InterruptedException {          //search option with sort, filter
	 pom.initial();                                          
		pom.typesemail(pr.getProperty("semail"));
		pom.clickcontinue();
		pom.typepassword(pr.getProperty("spassword"));
		pom.typeSremember();
		pom.signbtn();
		pom.search(pr.getProperty("search"));
		pom.searchbtn();
		pom.sorting();
		pom.sortoption();
		pom.filterprice();
		pom.filterdays();
		pom.searchcart(pr.getProperty("searchcart"));
		pom.item();
		pom.addcart();
		pom.checkout();
		pom.coupon(pr.getProperty("coupon"));
		pom.press();
		pom.logo();
		pom.returncart();
		pom.cart();
		pom.delete();
		pom.order();
 }
 @DataProvider
	public Object[][] Details(){
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;
 }
 @Test(priority=2,dataProvider="Details")
	public void create(String cusname,String email, String password, String passcheck) throws InterruptedException {
	 pom.createaccount();
	 pom.cusname(cusname);
	 pom.email(email);
	 pom.password(password);
	 pom.passcheck(passcheck);
	 Thread.sleep(2000);
	 pom.ok();
 }
 
}
