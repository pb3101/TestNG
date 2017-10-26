package Tasks8Bonus;

import org.testng.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
public class MethodListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println(method.getTestMethod().getMethodName());
    }
}
