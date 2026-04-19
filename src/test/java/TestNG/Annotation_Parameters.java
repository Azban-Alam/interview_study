package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation_Parameters {

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setUp(String browser, String url) {
        System.out.println("🔧 Setting up test on " + browser + " for URL: " + url);
        // Example: Initialize WebDriver based on browser and open the URL
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("🔐 Testing login with Username: " + username + ", Password: " + password);
        // Simulate login with credentials
    }
}

/*

<suite name="MultiParamSuite">
<test name="LoginTest">
  <parameter name="browser" value="chrome"/>
  <parameter name="url" value="https://example.com"/>
  <parameter name="username" value="testUser"/>
  <parameter name="password" value="secure123"/>
  
  <classes>
    <class name="LoginTest"/>
  </classes>
</test>
</suite>

*/