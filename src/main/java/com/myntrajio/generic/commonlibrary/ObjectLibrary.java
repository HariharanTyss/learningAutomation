package com.myntrajio.generic.commonlibrary;
import org.openqa.selenium.WebDriver;

import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyfile;
import com.myntrajio.generic.webdriverlibrary.WebDriverLibrary;

public class ObjectLibrary {
	public	ReadExcelFile excellibrary;
	public JavaLibrary javalibrary;
	public ReadPropertyfile propertyfilelibrary;
	public WebDriverLibrary webdriverlibrary;

	public void createObject() {
		excellibrary = new ReadExcelFile();
		javalibrary = new JavaLibrary();
		propertyfilelibrary = new ReadPropertyfile();
		webdriverlibrary = new WebDriverLibrary();
	}
}
