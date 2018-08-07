package pageobjects;

import org.openqa.selenium.By;

import com.appium.base.BaseClass;
import com.appium.base.CommonMethod;

public class OrderProductPage extends BaseClass {
	
	
	
	public By search = By.id("com.ebay.mobile:id/search_box");
	public By search_results = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView");
	public By search_box =By.id("com.ebay.mobile:id/search_src_text");
	public By product = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
	public By buyButton = By.id("com.ebay.mobile:id/button_bin");
	public By review = By.id("com.ebay.mobile:id/take_action");
	public By address1 = By.id("address1");
	public By address2 = By.id("address2");
	public By city = By.id("city");
	public By select_state = By.id("state");
	public By state_ap = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	public By zip = By.id("zip");
	public By mobile = By.id("phoneFlagComp1");
	public By checkBox = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[9]/android.view.View[12]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");
	public By coninue = By.id("sbtBtn");
	public By proceedToPay = By.id("proceed");
	
	public String add1;
	public String add2;
	public String city_data;
	public String mobile_data;
	public String zip_data;
	
	
	
	
	public void searchProduct(String category) {
		CommonMethod.click(search);
		CommonMethod.sendKeys(search_box,category );
		CommonMethod.click(search_results);
	}
	
	
	public void selectProduct() {
		
		CommonMethod.click(product);
	}
	
	
	public void clickOnBuyButton() throws InterruptedException {
		
		CommonMethod.click(buyButton);
		Thread.sleep(5000);
		
	}
	
	public void clickOnReviewButton() throws InterruptedException {
		
		CommonMethod.click(review);
		Thread.sleep(5000);
		
	}
	public void provideContactInfo() {
		
		CommonMethod.sendKeys(address1,add1 );
		CommonMethod.sendKeys(address2, add2);
		CommonMethod.sendKeys(city, city_data);
		CommonMethod.click(select_state);
		CommonMethod.click(state_ap);
		CommonMethod.sendKeys(zip, zip_data);
		CommonMethod.sendKeys(mobile, mobile_data);
		CommonMethod.click(checkBox);
		CommonMethod.click(proceedToPay);
	}
	
	
	public void getDataFromSheet() {
		
		add1 = ereader.getCellData("ContactDetails", 1, 0);
		add2 = ereader.getCellData("ContactDetails", 1, 1);
		city_data = ereader.getCellData("ContactDetails", 1, 2);
		zip_data = ereader.getCellData("ContactDetails", 1, 3);
		mobile_data = ereader.getCellData("ContactDetails", 1, 4);


	}
	
	public void clickOnConinue() {
		
		CommonMethod.click(coninue);
		
	}
	
	

}
