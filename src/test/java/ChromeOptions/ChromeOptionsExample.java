package ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
	ChromeOptions options = new ChromeOptions();
	
	// UI & Window Behavior
	options.addArguments("--start-maximized");              // Start maximized
	options.addArguments("--window-size=1920,1080");        // Set specific window size
	options.addArguments("--kiosk");                        // Fullscreen mode (Mac/Linux)
	options.addArguments("--start-fullscreen");             // Fullscreen (Windows)
	
	// Privacy & Security
	options.addArguments("--incognito");                    // Incognito mode
	options.addArguments("--disable-popup-blocking");       // Disable pop-up blocking
	options.addArguments("--ignore-certificate-errors");    // Ignore SSL errors
	options.addArguments("--disable-notifications");        // Disable browser notifications
	
	// Performance & Stability
	options.addArguments("--disable-extensions");           // Disable extensions
	options.addArguments("--disable-infobars");             // Hide "Chrome is being controlled..."
	options.addArguments("--disable-gpu");                  // Disable GPU hardware acceleration
	options.addArguments("--no-sandbox");                   // Bypass OS security model (CI use)
	options.addArguments("--disable-dev-shm-usage");        // Overcome limited resource problems
	
	// Headless & Automation
	options.addArguments("--headless=new");                 // Headless mode (new headless)
	options.addArguments("--remote-allow-origins=*");       // Allow remote origins (Selenium 4+)
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);   // Can be EAGER or NONE
	
	// Custom Preferences (e.g., download behavior)
	Map<String, Object> prefs = new HashMap<>();
	prefs.put("download.default_directory", "C:\\Downloads");
	prefs.put("profile.default_content_settings.popups", 0);
	prefs.put("credentials_enable_service", false);
	prefs.put("profile.password_manager_enabled", false);
	options.setExperimentalOption("prefs", prefs);
}

