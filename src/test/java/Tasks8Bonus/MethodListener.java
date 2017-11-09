package Tasks8Bonus;

import org.testng.*;

/**
 * Created by pavlo.balyuk on 10/26/2017.
 */
public class MethodListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
       // System.out.println(DebugUtil.formatCurrentStacktrace());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.isTestMethod()) {
            System.out.println(method.getTestMethod().getMethodName());
        }
    }

    public static class DebugUtil {

        private static final String SEPARATOR = "\n";

        private DebugUtil() {
        }

        public static String formatStackTrace(StackTraceElement[] stackTrace) {
            StringBuilder buffer = new StringBuilder();
            for (StackTraceElement element : stackTrace) {
                buffer.append(element).append(SEPARATOR);
            }
            return buffer.toString();
        }

        public static String formatCurrentStacktrace() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            return formatStackTrace(stackTrace);
        }
    }
}
