package dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerwithChrome2 {
	
	@Test
	public void test2() throws MalformedURLException {
		
	// 	DesiredCapabilities ds =DesiredCapabilities.chrome();
		DesiredCapabilities ds = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver wd = new RemoteWebDriver(ds);
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		
		wd.quit();
	}

}
