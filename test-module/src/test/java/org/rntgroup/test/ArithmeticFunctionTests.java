package org.rntgroup.test;

import org.rntgroup.BaseTest;
import org.rntgroup.StaticDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticFunctionTests extends BaseTest {

    @Test(description = "Unit Sum Long Test",
            dataProvider = "valuesForSumLongTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSumLongTest(long num1, long num2, long expValue) {
        long result = calculator.sum(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }

    @Test(description = "Unit Sum Double Test",
            dataProvider = "valuesForSumDoubleTest",
            dataProviderClass = StaticDataProvider.class)
    public void unitSumDoubleTest(double num1, double num2, double expValue) {
        double result = calculator.sum(num1, num2);
        Assert.assertEquals(result, expValue, "Result is not correct!");
    }
}
