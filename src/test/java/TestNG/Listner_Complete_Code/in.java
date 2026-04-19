package TestNG.Listner_Complete_Code;

/*

The ITestListener interface in TestNG provides hooks to track the 
life cycle of test execution. Here's a complete list of its methods:

📋 Methods in ITestListener

- onStart(ITestContext context)     Invoked before any test method in the <test> tag is run.
- onFinish(ITestContext context)    Called after all test methods in the <test> tag have run.
- onTestStart(ITestResult result)   Triggered right before each test method is invoked.
- onTestSuccess(ITestResult result) Called when a test method completes successfully.
- onTestFailure(ITestResult result) Invoked when a test method fails.
- onTestSkipped(ITestResult result) Called when a test method is skipped.

- onTestFailedButWithinSuccessPercentage(ITestResult result) Triggered when a test fails but is 
															 still within the success percentage defined.

- onTestFailedWithTimeout(ITestResult result) Invoked when a test fails due to a timeout.


*/