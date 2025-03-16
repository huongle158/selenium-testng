package listeners;
import org.testng.ITestListener;
public class SimpleListeners implements ITestListener {
    public void onTestStart(org.testng.ITestResult result) {


    }
    public void onTestSuccess(org.testng.ITestResult result) {
        System.out.println("SimpleListeners.onTestSuccess");
    }
    public void onTestFailure(org.testng.ITestResult result) {
        System.out.println("SimpleListeners.onTestFailure");
    }
    public void onTestSkipped(org.testng.ITestResult result) { /* compiled code */
    }
    public void onTestFailedButWithinSuccessPercentage(org.testng.ITestResult result) {

    }
    public void onTestFailedWithTimeout(org.testng.ITestResult result) {

        }
    public void onStart(org.testng.ITestContext context) {


    }
    public void onFinish(org.testng.ITestContext context) {


    }
}
