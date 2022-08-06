package adapter_pattern;

interface WebDriver {
	public void getElement();

	public void selectElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.err.println("Get element from ChromeDriver");
	}

	@Override
	public void selectElement() {
		System.err.println("Select element from ChromeDriver");
	}

}

class IEDriver {
	public void findElement() {
		System.err.println("Find element from IEDriver");
	}

	public void clickElement() {
		System.err.println("Click element from IEDriver");
	}
}

class WebDriverAdapter implements WebDriver {

	IEDriver ieDriver;

	WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}

}

public class Adapter {
	public static void main(String[] args) {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.getElement();
		chromeDriver.selectElement();
		System.err.println();

		IEDriver ieDriver = new IEDriver();
		ieDriver.findElement();
		ieDriver.clickElement();
		System.err.println();

		WebDriver webDriver = new WebDriverAdapter(ieDriver);
		webDriver.getElement();
		webDriver.selectElement();
	}
}
