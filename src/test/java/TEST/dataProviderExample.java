package TEST;

import org.testng.annotations.*;

/**
 * Created by pavlo.balyuk on 10/25/2017.
 */
public class dataProviderExample {

        @DataProvider(name = "test1")
        public Object[][] createData1() {
            return new Object[][] {
                    { "Cedric", new Integer(36) },
                    { "Anne", new Integer(37)},
            };
        }

        @Test(testName = "TEST",dataProvider = "test1")
        public void verifyData1(String n1, Integer n2) {
            System.out.println(n1 + " " + n2);
        }
    }
