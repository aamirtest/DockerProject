package dockerProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerwithFirefox {
	
	@Test
	public void test3() throws MalformedURLException {
		
	// 	DesiredCapabilities ds =DesiredCapabilities.chrome();
		DesiredCapabilities ds = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver wd = new RemoteWebDriver(ds);
		
		wd.get("https://www.amazon.com/");
		System.out.println(wd.getTitle());
		
		wd.quit();
	}

}
